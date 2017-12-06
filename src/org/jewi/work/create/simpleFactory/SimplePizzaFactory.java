package org.jewi.work.create.simpleFactory;



public class SimplePizzaFactory {
	
	public static Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if ("cheese".equals(orderType)) {
			pizza = new CheesePizza();
		} else if ("greek".equals(orderType)) {
			pizza = new GreekPizza();
		}
		
		return pizza;
	}
}

/**
 * 总结
 * 上面用披萨项目的列子来讲解了简单工厂模式的使用，总结下优缺点：
 * 简单工厂模式的优点：
 * 模式的核心是工厂类。这个类含有必要的判断逻辑，可以决定在什么时候创建哪一个产品类的实例。
 * 而客户端则可以免除直接创建对象的责任（比如那个服务员）。简单工厂模式通过这种做法实现了对责任的分割。
 * 
 * 简单工厂模式的缺点：
 * 这个工厂类集中了所以的创建逻辑，当有复杂的多层次等级结构时，所有的业务逻辑都在这个工厂类中实现。
 * 什么时候它不能工作了，整个系统都会受到影响。并且简单工厂模式违背了开闭原则（对扩展的开放，对修改的关闭）。
 * 
 * 适用场景：
 * 在以下情况下可以考虑使用简单工厂模式：
 * 
 * 工厂类负责创建的对象比较少，由于创建的对象较少，不会造成工厂方法中的业务逻辑太过复杂。
 * 客户端只知道传入工厂类的参数，对于如何创建对象并不关心
 */
