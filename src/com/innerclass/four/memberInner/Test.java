package com.innerclass.four.memberInner;

import com.innerclass.four.memberInner.Outer.Inner;

/**
 * 成员式内部类 测试类
 */
public class Test
{

	public static void main(String[] args)
	{
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.dostuff();
	}

}
