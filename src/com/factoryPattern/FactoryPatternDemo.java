package com.factoryPattern;

import com.factoryPattern.shape.Shape;

/**
 * Java工厂设计模式
 */
public class FactoryPatternDemo
{

	public static void main(String[] args)
	{
		ShapeFactory shapeFactory = new ShapeFactory();

		// get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw(); // call draw method of Circle

		// get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw(); // call draw method of Rectangle

		// get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw(); // call draw method of circle
	}

}
