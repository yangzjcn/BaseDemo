package com.abstractFactoryPattern;

import com.abstractFactoryPattern.color.Color;
import com.abstractFactoryPattern.shape.Shape;

/**
 * Java抽象工程模式
 */
public class AbstractFactoryPatternDemo
{

	public static void main(String[] args)
	{
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw(); // call draw method of Shape Circle

		// get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw(); // call draw method of Shape Rectangle

		// get an object of Shape Square
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw(); // call draw method of Shape Square

		// get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// get an object of Color Red
		Color color1 = colorFactory.getColor("RED");
		color1.fill(); // call fill method of Red

		// get an object of Color Green
		Color color2 = colorFactory.getColor("Green");
		color2.fill(); // call fill method of Green

		// get an object of Color Blue
		Color color3 = colorFactory.getColor("BLUE");
		color3.fill(); // call fill method of Color Blue
	}

}
