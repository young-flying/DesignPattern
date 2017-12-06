package org.jewi.work.create.simpleFactory;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("准备--------------- CheesePizza");
	}

	@Override
	public void bake() {
		System.out.println("正在烘烤--------------- CheesePizza");
	}

	@Override
	public void cut() {
		System.out.println("正在切--------------- CheesePizza");
	}

	@Override
	public void box() {
		System.out.println("正在打包--------------- CheesePizza");
	}

}
