package org.jewi.work.create.abstractFactory;

public class FamilyFactory implements Factory{
    @Override
    public Pizza createPizza() {
        return new FamilyPizza();
    }
    @Override
    public Hamburger createHamburger() {
        return new FamilyHamburger();
    }
}