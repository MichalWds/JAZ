package pl.pjatk.micwad;

import org.springframework.stereotype.Component;

@Component
public class ComponentOne {

    public ComponentOne(ComponentTwo componentTwo) {
        System.out.println("component one");
        componentTwo.helloFromMethod();
    }
}
