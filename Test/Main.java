package Test;
import Test.*;

public class Main{
	public static void main(String [] args){
		FactoryProducer factory = new FactoryProducer();
		AbstractFactory shape = factory.getAbstractFactory("SHAPE");
		AbstractFactory color = factory.getAbstractFactory("COLOR");
		Color color1 = color.getColor("GREEN");
		Color color2 = color.getColor("RED");
		color1.fill();
		color2.fill();
		Shape shape1 = shape.getShape("CIRCLE");
		Shape shape2 = shape.getShape("RECTANGLE");
		shape1.draw();
		shape2.draw();
	}
}
