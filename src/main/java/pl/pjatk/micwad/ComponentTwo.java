package pl.pjatk.micwad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComponentTwo {

    public ComponentTwo(@Value("${my.custom.property}") String valueFromProperties,
                        @Value("${my.custom.random:myDefaultValue}") String randomValue) {
        System.out.println(valueFromProperties);
        System.out.println(randomValue);
    }

    void helloFromMethod() {
        System.out.println("hello from second component. method");
    }
}
