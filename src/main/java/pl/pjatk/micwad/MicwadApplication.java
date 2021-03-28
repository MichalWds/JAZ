package pl.pjatk.micwad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource({"classpath:beans.xml"})
public class MicwadApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicwadApplication.class, args);
      //  new ClassPathXmlApplicationContext("beans.xml");
//		ComponentTwo componentTwo = (ComponentTwo) context.getBean("componentTwo");
//		componentTwo.helloFromMethod();
    }

}
