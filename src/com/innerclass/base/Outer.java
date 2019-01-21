package com.innerclass.base;

/**
 * 外部类
 * 
 * 在Java中，允许在一个类（或方法、语句块）的内部定义另一个类，称为内部类(Inner Class)，有时也称为嵌套类(Nested Class)。
 * 
 * 内部类和外层封装它的类之间存在逻辑上的所属关系，一般只用在定义它的类或语句块之内，实现一些没有通用意义的功能逻辑，在外部引用它时必须给出完整的名称。
 * 
 * 使用内部类的主要原因有：1.内部类可以访问外部类中的数据，包括私有的数据。2.内部类可以对同一个包中的其他类隐藏起来。
 * 3.当想要定义一个回调函数且不想编写大量代码时，使用匿名(anonymous)内部类比较便捷。 4.减少类的命名冲突。
 */
public class Outer
{
	private int size;

	/**
	 * 内部类
	 */
	public class Inner
	{
		private Integer counter = 10;

		public void dostuff()
		{
			size++;
		}
	}

	public static void main(String[] args)
	{
		Outer outer = new Outer();
		Inner inner = outer.new Inner(); // 注意：必须先有外部类的对象才能生成内部类的对象，因为内部类需要访问外部类中的成员变量，成员变量必须实例化才有意义。
		inner.dostuff();
		System.out.println(outer.size);
		System.out.println(inner.counter);

		// 编译错误，外部类不能访问内部类的变量
		// System.out.println(counter);
	}

	/*
	 * 这段代码定义了一个外部类 Outer，它包含了一个内部类 Inner。将错误语句注释掉，编译，会生成两个 .class
	 * 文件：Outer.class 和 Outer$Inner.class。也就是说，内部类会被编译成独立的字节码文件。
	 * 
	 * 内部类是一种编译器现象，与虚拟机无关。编译器将会把内部类翻译成用 $ 符号分隔外部类名与内部类名的常规类文件，而虚拟机则对此一无所知。
	 */

}
