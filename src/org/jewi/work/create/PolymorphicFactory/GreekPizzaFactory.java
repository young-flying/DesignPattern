package org.jewi.work.create.PolymorphicFactory;
public class GreekPizzaFactory  implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new GreekPizza();
    }
}