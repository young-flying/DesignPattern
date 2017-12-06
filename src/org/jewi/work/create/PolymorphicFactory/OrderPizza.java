package org.jewi.work.create.PolymorphicFactory;

public class OrderPizza {

	public static void main(String[] args) {
		
		PizzaFactory cheesefactory = new CheesePizzaFactory();
		Pizza cheesePizza = cheesefactory.createPizza();
		cheesePizza.prepare();
		cheesePizza.bake();
		cheesePizza.cut();
		cheesePizza.box();
		
		PizzaFactory greekfactory = new GreekPizzaFactory();
		Pizza greekPizza = greekfactory.createPizza();
		greekPizza.prepare();
		greekPizza.bake();
		greekPizza.cut();
		greekPizza.box();
		
		
	}
}
