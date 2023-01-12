package ro.sda.spring_di_1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring_di_1.beans.Cat;
import ro.sda.spring_di_1.components.Dog;

@Configuration
public class ProjectConfig {
    @Bean
    public Cat cat(){
        return new Cat();
    }

    @Bean
    public Dog dog(){
        return new Dog();
    }


}
