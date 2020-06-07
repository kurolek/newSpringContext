package org.kurolek.newSpringContext.configs;


import org.kurolek.newSpringContext.builder.Unit;
import org.kurolek.newSpringContext.entity.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("weapon-axe")
    @Qualifier(value = "axe-of-death")
    public Object axeOfDeath() {
        Axe axe = new Axe();

        axe.name = "Axe of death";
        return axe;
    }

    @Bean("weapon-sword")
    @Qualifier(value = "default-sword")
    public Object defaultSword(){
        Sword sword = new Sword();
        sword.name = "Sword";
        return sword;
    }

    @Bean("tool-plow")
    @Qualifier(value = "default-plow")
    public Object defaultPlow(){
        Plow plow = new Plow();
        plow.name = "Plow";
        return plow;
    }

    @Bean("unit-warrior")
    @Qualifier(value = "default-warrior")
    public Object defaultWarrior() {
        Warrior warrior = new Warrior();
        warrior.name = "Warrior";
        return warrior;
    }

    @Bean("unit-peasant")
    @Qualifier(value = "default-peasant")
    public Object defaultPeasant(){
        Peasant peasant = new Peasant();
        peasant.name = "Peasant";
        return peasant;
    }


    @Bean("warrior-with-axe")
    public Object getWarrior(@Qualifier(value = "axe-of-death") Axe axe,
                             @Qualifier(value = "default-warrior") Warrior warrior) {
        return new Unit(warrior, axe);
    }

    @Bean("peasant-with-plow")
    public Object getPeasantWithPlow(@Qualifier(value = "default-plow") Plow plow,
                                     @Qualifier(value = "default-peasant") Peasant peasant) {
        return new Unit(peasant, plow);
    }

    @Bean("peasant-with-sword")
    public Object getPeasantWithSword(@Qualifier(value = "default-sword") Sword sword,
                                      @Qualifier(value = "default-peasant") Peasant peasant){
        return new Unit(peasant, sword);
    }

    @Bean("warrior-with-sword")
    public Object getWarriorWithSword(@Qualifier(value = "default-sword") Sword sword,
                                      @Qualifier(value = "default-warrior") Warrior warrior){
        return new Unit(warrior, sword);
    }
}
