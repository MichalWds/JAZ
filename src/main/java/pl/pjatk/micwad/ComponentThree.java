package pl.pjatk.micwad;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class ComponentThree {

//    public ComponentThree(ApplicationContext applicationContext) {
//        //String musi posiadac taka sama nazwe zmiennej co component, ktory chcemy wywolac.
//        // String = bean wyszukiwany na bazie nazwy danego obiektu ( domyslnie z malej litery)
//        ComponentOne componentOne = applicationContext.getBean("componentOne", ComponentOne.class);
//        ComponentTwo componentTwo = applicationContext.getBean("componentTwo", ComponentTwo.class);
//        componentTwo.helloFromMethod();
//        System.out.println("Component three");
//                                                                        //nazwy metod musza sie matchowac do tych beanow
//        MySimpleClass myFirstSimpleClass = applicationContext.getBean("mySimpleClass", MySimpleClass.class);
//        MySimpleClass mySecondSimpleClass = applicationContext.getBean("mySecondSimpleClass", MySimpleClass.class);
//
//        System.out.println(myFirstSimpleClass.getName());
//        System.out.println(mySecondSimpleClass.getName());
//    }

    public ComponentThree(ComponentOne componentOne, ComponentTwo componentTwo,
                          MySimpleClass mySimpleClass, MySimpleClass mySecondSimpleClass) {

        componentTwo.helloFromMethod();
        System.out.println("Component three");
        System.out.println(mySimpleClass.getName());
        System.out.println(mySecondSimpleClass.getName());
    }

//    public ComponentThree() {
//        System.out.println("component three");
//    }
}
