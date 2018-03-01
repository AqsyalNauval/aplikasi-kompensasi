package id.ac.tazkia.hr.kompensasi.aplikasikompensasi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

@SpringBootApplication
public class AplikasiKompensasiApplication {
	@Bean
	public SpringDataDialect springDataDialect(){
		return new SpringDataDialect();
	}
	public static void main(String[] args) {
		SpringApplication.run(AplikasiKompensasiApplication.class, args);
	}
}
