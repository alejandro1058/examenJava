package mx.com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@SpringBootApplication
public class ExamProductosApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExamProductosApplication.class, args);
	}

}
