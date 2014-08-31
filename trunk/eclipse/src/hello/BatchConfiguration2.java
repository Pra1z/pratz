package hello;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
@EnableAutoConfiguration
public class BatchConfiguration2 {

  @Autowired
  private JobBuilderFactory jobBuilderFactory;

  @Autowired
  private StepBuilderFactory stepBuilderFactory;

  @Bean
  public Step step1() {
    return stepBuilderFactory.get("step1")
        .tasklet(new Tasklet() {
			@Override
			public RepeatStatus execute(StepContribution arg0, ChunkContext arg1)
					throws Exception {
				// TODO Auto-generated method stub
				System.out.println("Tasklet.execute 1");
				return RepeatStatus.FINISHED;
			}
        }
        )
        .build();
  }
  
  @Bean
  public Step step2() {
    return stepBuilderFactory.get("step2")
        .tasklet(new Tasklet() {
			@Override
			public RepeatStatus execute(StepContribution arg0, ChunkContext arg1)
					throws Exception {
				// TODO Auto-generated method stub
				System.out.println("Tasklet.execute 2");
				return RepeatStatus.CONTINUABLE;
			}
        }
        )
        .build();
  }

  @Bean
  public Job job1(Step step1,Step step2) throws Exception {
    return /*jobBuilderFactory.get("job1")
        .incrementer(new RunIdIncrementer()).flow(step1).next(step2).;*/
    		jobBuilderFactory.get("job1").flow(step1).next(new JobExecutionDecider(){

				@Override
				public FlowExecutionStatus decide(JobExecution arg0,
						StepExecution arg1) {
					System.out.println("Step.ExitStatus: "+arg1.getExitStatus());
					System.out.println("Job.ExitStatus: "+arg0.getExitStatus());
					if (arg1.getExitStatus().equals(RepeatStatus.FINISHED)) {
			            return FlowExecutionStatus.COMPLETED;
			        }
			        else {
			            return FlowExecutionStatus.FAILED;
			        }
				}}).on("Fail").to(step2).end().build();
  }
}
