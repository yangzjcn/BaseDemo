package com.innerclass.four.localInner;

/**
 * 局部内部类
 * 
 * @author yzj
 * 
 * @note 局部内部类(Local class)是定义在代码块中的类。它们只在定义它们的代码块中是可见的。
 * 
 *       局部类有几个重要特性：1. 仅在定义了它们的代码块中是可见的； 2.可以使用定义它们的代码块中的任何局部 final 变量；
 *       3.局部类不可以是 static 的，里边也不能定义 static 成员；4.局部类不可以用 public、private、protected
 *       修饰，只能使用缺省的； 5.局部类可以是 abstract 的。
 * 
 */
public class Outer
{
	public static final int TOTAL_NUMBER = 5;
	public int id = 123;

	public void func()
	{
		final int age = 15;
		@SuppressWarnings("unused")
		String str = "str";
		class Inner
		{
			public void innerTest()
			{
				System.out.println(TOTAL_NUMBER);
				System.out.println(id);
				// System.out.println(str);不合法，只能访问本地方法的final变量
				System.out.println(age);
			}
		}
		new Inner().innerTest();
	}

	public static void main(String[] args)
	{
		Outer outer = new Outer();
		outer.func();
	}
}
