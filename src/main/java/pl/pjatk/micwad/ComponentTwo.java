package pl.pjatk.micwad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ComponentTwo {

    public ComponentTwo(@Value("${my.custom.property}") String valueFromProperties,
                  //      @Value("${my.custom.someHomeworkValue}") boolean someHomeworkValue,
                        @Value("${my.custom.random:myDefaultValue}") String randomValue) {
        System.out.println(valueFromProperties);
        System.out.println(randomValue);
        System.out.println("----------------");
      //  System.out.println(someHomeworkValue);
        System.out.println("----------------");
    }

    @Bean
    @ConditionalOnProperty(name = "my.custom.someHomeworkValue", havingValue = "true")
    public void homeworkString(){
        System.out.println("PLACKI Z JABLKAMI SA MEGA DOBRE, A VALUE = TRUE, WIEC ODPALAM TEGO BEANA");;
    }

    void helloFromMethod() {
        System.out.println("hello from second component. method");
    }
}
