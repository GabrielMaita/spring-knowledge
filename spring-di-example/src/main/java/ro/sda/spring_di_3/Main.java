package ro.sda.spring_di_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring_di_3.components.Dog;
import ro.sda.spring_di_3.components.Owner;
import ro.sda.spring_di_3.config.ProjectConfig;

public class Main {
    public static void main (String[] args) {
        try(var  context = new AnnotationConfigApplicationContext(ProjectConfig.class)){

            Owner o=context.getBean(Owner.class);
            System.out.println(o);
            System.out.println(o.getDog().getName());
            System.out.println(o.getName());

            System.out.println("________________________");

            Dog d = context.getBean((Dog.class));
            System.out.println(d.getName());
        }
    }
}
