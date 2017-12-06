package org.jewi.work.create.abstractFactory;
public class SingleFactory implements Factory{
    @Override
    public Pizza createPizza() {
        return new SinglePizza();
    }

    @Override
    public Hamburger createHamburger() {
        return new SingleHamburger();
    }
}