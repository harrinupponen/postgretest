package postgre.test.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import postgre.test.demo1.domain.PgTest;
import postgre.test.demo1.domain.TestRepo;



@SpringBootApplication
public class Demo1Application {
	
	private static final Logger log = LoggerFactory.getLogger(Demo1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	
	@Bean
	public CommandLineRunner testDemo(TestRepo testRepo) { 
		return (args) -> {
			log.info("save a couple of tests");
			
			
			testRepo.save(new PgTest("TestText"));
			
			
			log.info("fetch all tests");
			for (PgTest pgTest : testRepo.findAll()) {
				log.info(pgTest.toString());
			}

		};
	}
}
