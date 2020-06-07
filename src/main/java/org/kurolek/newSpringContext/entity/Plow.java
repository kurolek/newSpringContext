package org.kurolek.newSpringContext.entity;

import org.kurolek.newSpringContext.interfaces.ITool;
import org.springframework.stereotype.Component;

@Component("tool-plow")
public class Plow implements ITool {
    public String name;

    @Override
    public void doAction() {
        System.out.println("Work with plow");
    }

    @Override
    public String getName() {
        return name;
    }
}
