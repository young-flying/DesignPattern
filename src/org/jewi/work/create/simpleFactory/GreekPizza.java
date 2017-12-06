package org.jewi.work.create.simpleFactory;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("准备--------------- GreekPizza");
	}

	@Override
	public void bake() {
		System.out.println("正在烘烤--------------- GreekPizza");
	}

	@Override
	public void cut() {
		System.out.println("正在切--------------- GreekPizza");
	}

	@Override
	public void box() {
		System.out.println("正在打包--------------- GreekPizza");
	}

}
