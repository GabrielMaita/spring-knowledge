package ro.sda.spring_di_4.beans;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cat {

    @Value("Jessie")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    private void init(){
        System.out.println("Cat was created!");
    }

    @PreDestroy
    private void destroy(){
        System.out.println("Cat is destroying");
    }
}
