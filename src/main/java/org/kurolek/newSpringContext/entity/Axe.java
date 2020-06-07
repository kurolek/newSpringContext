package org.kurolek.newSpringContext.entity;

import org.kurolek.newSpringContext.interfaces.ITool;
import org.springframework.stereotype.Component;

@Component("weapon-axe")
public class Axe implements ITool {
    public String name;

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void doAction() {
        System.out.println("Hit with axe");
    }
}
