package org.jewi.work.create.PolymorphicFactory;
public class CheesePizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}