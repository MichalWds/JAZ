package pl.pjatk.micwad;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwo {

    public ComponentTwo() {
        System.out.println("component Two");
    }

    void helloFromMethod() {
        System.out.println("hello from second component. method");
    }
}
