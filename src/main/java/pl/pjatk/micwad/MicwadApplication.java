package pl.pjatk.micwad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MicwadApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicwadApplication.class, args);
        new ClassPathXmlApplicationContext("beans.xml");
//		ComponentTwo componentTwo = (ComponentTwo) context.getBean("componentTwo");
//		componentTwo.helloFromMethod();
    }

}
