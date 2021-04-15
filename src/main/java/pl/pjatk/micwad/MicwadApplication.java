package pl.pjatk.micwad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:beans.xml"})
public class MicwadApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicwadApplication.class, args);
    }
}
