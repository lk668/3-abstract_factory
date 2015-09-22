package Test;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapetype){
		switch (shapetype){
			case "CIRCLE": return new Circle();
			case "RECTANGLE": return new Rectangle();
		}
		return null;
	}

	@Override
	public Color getColor(String color){
		return null;
	}
} 
