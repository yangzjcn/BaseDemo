package com.abstractFactoryPattern;

import com.abstractFactoryPattern.color.Color;
import com.abstractFactoryPattern.shape.CircleImpl;
import com.abstractFactoryPattern.shape.RectangleImpl;
import com.abstractFactoryPattern.shape.Shape;
import com.abstractFactoryPattern.shape.SquareImpl;

public class ShapeFactory extends AbstractFactory
{

	@Override
	Color getColor(String color)
	{
		return null;
	}

	@Override
	Shape getShape(String shapeType)
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
