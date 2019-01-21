package com.innerclass.four.anonymousInner;

/**
 * 匿名内部类
 * 
 * @author yzj
 * 
 * @note 匿名内部类是局部内部类的一种特殊形式，也就是没有变量名指向这个类的实例，而且具体的类实现会写在这个内部类里面。
 *       注意：匿名类必须继承一个父类或实现一个接口。
 * 
 */
public class Demo
{

	public static void main(String[] args)
	{
		// 匿名类继承了 Person 类并在大括号中实现了抽象类的方法。
		Persion persion = new Persion()
		{
			@Override
			public void eat()
			{
				System.out.println("ASDF");
			}
		};
		persion.eat();
	}

}
