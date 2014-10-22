package com.ttfl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.MimeMappings;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application implements EmbeddedServletContainerCustomizer,
		ResourceLoaderAware {

	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
			"classpath:/META-INF/resources/", "classpath:/resources/",
			"classpath:/static/", "classpath:/public/" };

	private ResourceLoader resourceLoader;

	@Bean
	public SimpleUrlHandlerMapping faviconHandlerMapping() {
		SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
		mapping.setOrder(Integer.MIN_VALUE + 1);
		mapping.setUrlMap(Collections.singletonMap("static/favicon.ico",
				faviconRequestHandler()));
		return mapping;
	}

	@Bean
	public ResourceHttpRequestHandler faviconRequestHandler() {
		ResourceHttpRequestHandler requestHandler = new ResourceHttpRequestHandler();
		requestHandler.setLocations(getLocations());
		return requestHandler;
	}

	private List<Resource> getLocations() {
		List<Resource> locations = new ArrayList<Resource>(
				CLASSPATH_RESOURCE_LOCATIONS.length + 1);
		for (String location : CLASSPATH_RESOURCE_LOCATIONS) {
			locations.add(this.resourceLoader.getResource(location));
		}
		locations.add(new ClassPathResource("/"));
		return Collections.unmodifiableList(locations);
	}

	// static private Logger log = Logger.getLogger("Application");

	/*
	 * @Bean public MultipartConfigElement multipartConfigElement() {
	 * MultipartConfigFactory factory = new MultipartConfigFactory();
	 * factory.setMaxFileSize("128KB"); factory.setMaxRequestSize("128KB");
	 * return factory.createMultipartConfig(); }
	 * 
	 * 
	 * @Bean public EmbeddedServletContainerFactory servletContainer() {
	 * TomcatEmbeddedServletContainerFactory factory = new
	 * TomcatEmbeddedServletContainerFactory(); factory.setPort(9000);
	 * factory.setSessionTimeout(10, TimeUnit.MINUTES); factory.
	 * log.info("factory.getUriEncoding: "+factory.getUriEncoding());
	 * 
	 * return factory; }
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer factory) {
		MimeMappings mappings = new MimeMappings(MimeMappings.DEFAULT);
		mappings.add("html", "text/html;charset=utf-8");
		factory.setMimeMappings(mappings);
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

}
