package pl.pjatk.micwad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataConfiguration {

    @Bean
    public MySimplePojo mySimplePojo() {
        return new MySimplePojo("Hello from bean mySimpleClassTwo zjazd2");
    }

    @Bean
    public List<String> defaultData() {
        return List.of("ass", "bass", "grass", "pass", "mass");
    }

    @Bean
    public List<String> anotherDefaultData() {
        return List.of("ass2", "bass2", "grass2", "pass2", "mass2");
    }

    @Bean
    public List<MySimplePojo> mySimplePojoList(MySimplePojo mySimplePojo){
        return List.of(mySimplePojo);
    }

    @Bean
    public int someInt(){
        return 1;
    }
}
