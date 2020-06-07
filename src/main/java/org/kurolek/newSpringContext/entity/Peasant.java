package org.kurolek.newSpringContext.entity;

import org.kurolek.newSpringContext.interfaces.IPerson;
import org.springframework.stereotype.Component;

@Component("unit-peasant")
public class Peasant implements IPerson {
    public String name;

    @Override
    public void goTo(int x, int y) {
        System.out.printf("Run to %d; %d\n", x, y);
    }

    @Override
    public String getName() {
        return name;
    }
}
