package org.kurolek.newSpringContext.builder;


import org.kurolek.newSpringContext.interfaces.IPerson;
import org.kurolek.newSpringContext.interfaces.ITool;



public class Unit {

    private IPerson mPerson;
    private ITool mTool;


    public Unit(IPerson _person, ITool _tool) {
        super();
        mPerson = _person;
        mTool = _tool;
    }

    public void testActions(){
        mPerson.goTo(10, 25);
        mTool.doAction();
    }

    public void show() {

        System.out.printf("Unit: %s; tool: %s\n", mPerson.getName(), mTool.getName());
    }
}
