package br.com.driw.obsido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Obsido {

	public static void main(String[] args) {
		SpringApplication.run(Obsido.class, args);
	}
}
