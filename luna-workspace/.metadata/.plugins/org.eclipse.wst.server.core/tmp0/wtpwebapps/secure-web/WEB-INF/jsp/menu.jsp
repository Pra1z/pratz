<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page import="org.springframework.security.core.Authentication" %>
<%@ page import="org.springframework.security.core.GrantedAuthority" %>

<!DOCTYPE html>
<html>
    <head>
        
        <title>Home</title>
    </head>
    <body>
       Home >> <a href="j_spring_security_logout">Logout</a>


<h3>Security Debug Information</h3>

<%
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) { %>
<p>
            Authentication object is of type: <em><%= auth.getClass().getName() %></em>
</p>
<p>
            Authentication object as a String: <br/><br/><%= auth.toString() %>
</p>

            Authentication object holds the following granted authorities:<br /><br />
<%
            for (GrantedAuthority authority : auth.getAuthorities()) { %>
                <%= authority %> (<em>getAuthority()</em>: <%= authority.getAuthority() %>)<br />
<%			}
%>

                <p><b>Success! Your web filters appear to be properly configured!</b></p>
<%
        } else {
%>
            Authentication object is null.<br />
            This is an error and your Spring Security application will not operate properly until corrected.<br /><br />
<%		}
%>

    </body>
</html>
