package com.codeWarning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test
{

	/**
	 * 参考https://www.cnblogs.com/tiantianbianma/p/7077463.html
	 * 
	 * @Java常见错误
	 */
	public static void main(String[] args)
	{
		/**
		 * 一、数组转ArrayList
		 */
		String[] arr = { "0", "1", "2" };
//		List<String> list = Arrays.asList(arr);
//		System.out.println(list);
		// list.add("3"); // 报错: java.lang.UnsupportedOperationException
		List<String> list2 = new ArrayList<>(Arrays.asList(arr));
		list2.add("3");
//		System.out.println(list2);

		/**
		 * 二、数组是否包含特定值
		 */
//		System.out.println(isContain());

		/**
		 * 三、在迭代时移除List中的元素
		 */
		// 错误用法一：这里存在一个非常严重的错误。当一个元素被移除时，该List的大小(size)就会缩减，同时也改变了索引的指向。所以，在迭代的过程中使用索引，将无法从List中正确地删除多个指定的元素。
//		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
//		for (int i = 0; i < list3.size(); i++)
//		{
//			list3.remove(i);
//		}
//		System.out.println(list3);

		// 错误用法二
//		ArrayList<String> list4 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
//		for (String s : list4)
//		{
//			if (s.equals("a"))
//				list4.remove(s);// 报错: java.util.ConcurrentModificationException
//		}
//		System.out.println(list4);

		// 正确用法
		ArrayList<String> list5 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
		Iterator<String> iterable = list5.iterator();
		while (iterable.hasNext())
		{
			//next()方法必须在remove()方法之前被调用。在 foreach 循环中，编译器使得 remove()方法先于next()方法被调用，这就导致了 ConcurrentModificationException 异常。具体细节可以查看 ArrayList.iterator()的源码。
			String string = (String) iterable.next();
			if ("a".equals(string))
			{
				iterable.remove();
			}
		}
//		System.out.println(list5);
		
		/**
		 * 四、Hashtable vs HashMap 
		 * 学习过数据结构的读者都知道一种非常重要的数据结构叫做哈希表。
		 * 在Java中，对应哈希表的的类是 HashMap 而不是 Hashtable。
		 * HashMap与Hashtable之间的最核心区别就是：HashMap是非同步的，Hashtable是同步的。
		 */
		
		/**
		 * 五、在Collection中使用原始类型(使用泛型可以避免数据转换问题)
		 */
//		List<String> list6 = new ArrayList<String>();
//		add(list6, 10);
//		String s = list6.get(0);
		
		/**
		 * 六、访问权限
		 * 很多的Java初学者喜欢使用 public 来修饰类的成员。这样可以很方便地直接访问和存取该成员。但是，这是一种非常糟糕的编程风格，正确的设计风格应该是尽可能降低类成员的访问权限。
		 */
		
		/**
		 * 七、ArrayList vs LinkedList
		 * 很多的Java初学者不明白ArrayList与LinkedList之间的区别，所以，他们完全只用相对简单的ArrayList，甚至不知道JDK中还存在LinkedList。
		 * 但是，在某些具体场景下，这两种List的选择会导致程序性能的巨大差异。简单而言：当应用场景中有很多的 add/remove 操作，只有少量的随机访问操作时，应该选择LinkedList;在其他的场景下，考虑使用ArrayList。
		 */
		
		/**
		 * 八、可变 vs 不可变
		 * 不可变的对象具有非常多的优势，比如简单，安全等。但是，对于每一个不同的值，都需要该类的一个对象。而且，生成很多对象带来的问题就是可能导致频繁的垃圾回收。所以，在选择可变类还是不可变类时，应该综合考虑后再做抉择。
  		 * 通常而言，可变对象可以避免创建大量的中间对象。一个非常经典的例子就是链接大量的短String对象为一个长的String对象。如果使用不可变String类，链接的过程将产生大量的，适合立即被垃圾回收的中间String对象，这将消耗大量的CPU性能和内存空间。此时，使用一个可变的StringBuilder或StringBuffer才是正确的。
		 */
		
		/**
		 * 九、继承中的构造函数
		 */
		
		/**
		 * 十、字符串对象的两个构建方式
		 */
		String a = "abcd";
		String b = "abcd";
		System.out.println(a == b); // true
		System.out.println(a.equals(b)); // true
		String c = new String("abcd");
		String d = new String("abcd");
		System.out.println(c == d); // false
		System.out.println(c.equals(d)); // true
	}

	public static boolean isContain()
	{
		String[] arr = { "0", "1", "2" };

		// 以下代码就功能而言是正确无误的,但在数组转List,List再转Set的过程中消耗了大量的性能
//		Set<String> set = new HashSet<String>(Arrays.asList("0", "1", "2"));
//		return set.contains("3");

		// 优化一
		// return Arrays.asList(arr).contains("3");

		// 优化二
		for (String s : arr)
		{
			if (s.equals("2"))
				return true;
		}
		return false;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void add(List list, Object o)
	{
		list.add(o);
	}
}
