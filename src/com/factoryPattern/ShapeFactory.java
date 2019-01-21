package com.factoryPattern;

import com.factoryPattern.shape.CircleImpl;
import com.factoryPattern.shape.RectangleImpl;
import com.factoryPattern.shape.Shape;
import com.factoryPattern.shape.SquareImpl;

public class ShapeFactory
{

	// use getShape method to get object of type shape
	public Shape getShape(String shapeType)
	{
		if (shapeType == null)
		{
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE"))
		{
			return new CircleImpl();

		}
		else if (shapeType.equalsIgnoreCase("RECTANGLE"))
		{
			return new RectangleImpl();

		}
		else if (shapeType.equalsIgnoreCase("SQUARE"))
		{
			return new SquareImpl();
		}
		return null;
	}

}
