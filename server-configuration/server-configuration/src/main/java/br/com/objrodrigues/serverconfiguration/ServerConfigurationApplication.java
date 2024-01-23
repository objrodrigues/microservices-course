package br.com.objrodrigues.serverconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Serve
public class ServerConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerConfigurationApplication.class, args);
	}

}
