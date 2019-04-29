package Controller;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class API {

	public static void main(String args[]) {
		SpringApplication.run(API.class, args);
	}

	
	/*@Bean
	CommandLineRunner runner(PostRepository repo) {
		return Args ->{
			repo.save(new Post("heloo", "public", "1", 5 , 6, "5Am"));
		};
		
	}*/
}
