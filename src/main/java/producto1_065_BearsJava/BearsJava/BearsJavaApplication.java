package producto1_065_BearsJava.BearsJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BearsJavaApplication {


	public static void main(String[] args) {
		SpringApplication.run(BearsJavaApplication.class, args);

		Controller ctrl = new Controller();
		ctrl.helloWord();

	}

}

