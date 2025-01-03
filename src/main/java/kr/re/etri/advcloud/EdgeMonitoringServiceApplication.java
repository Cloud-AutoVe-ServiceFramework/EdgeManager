package kr.re.etri.advcloud;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EdgeMonitoringServiceApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(EdgeMonitoringServiceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(EdgeMonitoringServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			logger.debug("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				logger.debug(">>> beanName : {}", beanName);
			}
			logger.debug("This is debug message!");
			logger.info("This is info message!");
			logger.warn("This is warn message!");
		};
	}
	
}
