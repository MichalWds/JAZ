package pl.pjatk.micwad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfig {

    //w configuracji nie towrzymy metod, ktore cos robia. Korzystamy z nazw obiektow, ktore zwaracaja

    @Bean //adnotacja dla metod, dzieki czemu, tworzymy beana z MySimpleClass, ktory nie jest componentem
    public MySimpleClass mySimpleClass() {
        return new MySimpleClass("Hello from bean my SimpleClass");
    }

    @Bean
    public MySimpleClass mySecondSimpleClass() {
        return new MySimpleClass("Hello from bean my second SimpleClass");
    }
}
