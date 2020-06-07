package org.kurolek.newSpringContext.entity;

import org.kurolek.newSpringContext.interfaces.ITool;
import org.springframework.stereotype.Component;

@Component("weapon-sword")
public class Sword implements ITool {
    public String name;

    @Override
    public void doAction() {
        System.out.println("Hit with sword");
    }

    @Override
    public String getName() {
        return name;
    }
}
