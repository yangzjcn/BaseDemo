package com.abstractFactoryPattern;

import com.abstractFactoryPattern.color.BlueImpl;
import com.abstractFactoryPattern.color.Color;
import com.abstractFactoryPattern.color.GreenImpl;
import com.abstractFactoryPattern.color.RedImpl;
import com.abstractFactoryPattern.shape.Shape;

public class ColorFactory extends AbstractFactory
{

	@Override
	Color getColor(String color)
	{
		if (color == null)
		{
			return null;
		}

		if (color.equalsIgnoreCase("RED"))
		{
			return new RedImpl();

		}
		else if (color.equalsIgnoreCase("GREEN"))
		{
			return new GreenImpl();

		}
		else if (color.equalsIgnoreCase("BLUE"))
		{
			return new BlueImpl();
		}

		return null;
	}

	@Override
	Shape getShape(String shape)
	{
		return null;
	}

}
