package org.kurolek.newSpringContext;

import org.kurolek.newSpringContext.builder.Unit;
import org.kurolek.newSpringContext.configs.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Unit unit = (Unit) context.getBean("warrior-with-axe");
        unit.show();
        unit.testActions();

        Unit peasantWithPlow = (Unit) context.getBean("peasant-with-plow");
        peasantWithPlow.show();
        peasantWithPlow.testActions();

        Unit peasantWithSword= (Unit) context.getBean("peasant-with-sword");
        peasantWithSword.show();
        peasantWithSword.testActions();


        Unit warriorWithSword = (Unit) context.getBean("warrior-with-sword");
        warriorWithSword.show();
        warriorWithSword.testActions();
    }

}
