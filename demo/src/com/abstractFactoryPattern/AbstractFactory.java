package com.abstractFactoryPattern;

import com.abstractFactoryPattern.color.Color;
import com.abstractFactoryPattern.shape.Shape;

public abstract class AbstractFactory
{

	/**
	 * 获取颜色
	 */
	abstract Color getColor(String color);

	/**
	 * 获取形状
	 */
	abstract Shape getShape(String shape);
}
