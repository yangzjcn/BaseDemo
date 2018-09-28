package com.innerclass.four.memberInner;

/**
 * 成员式内部类
 */
public class Outer
{
	private int size;

	public class Inner
	{
		public void dostuff()
		{
			size++;
			System.out.println(size);
		}
	}

}