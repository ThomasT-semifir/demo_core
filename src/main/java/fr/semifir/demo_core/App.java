package fr.semifir.demo_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@ComponentScan("fr.semifir.demo_core")

public class App {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        Personne toto = context.getBean(Personne.class);
        System.out.println(toto);
    }
}
