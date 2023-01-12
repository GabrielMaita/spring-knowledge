package ro.sda.spring_di_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring_di_1.beans.Cat;
import ro.sda.spring_di_1.components.Dog;
import ro.sda.spring_di_1.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Cat c1 = context.getBean(Cat.class);
        c1.sayMeow();

        Dog d1 = context.getBean(Dog.class);
        d1.sayHam();
    }
}
