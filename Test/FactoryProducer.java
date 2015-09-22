package Test;

public class FactoryProducer{
	public AbstractFactory getAbstractFactory(String factory){
		switch(factory){
			case "SHAPE": return new ShapeFactory();
			case "COLOR": return new ColorFactory();
		}
		return null;
	}
}
