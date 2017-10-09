package designPattern.creat.Factory;

public class ShapeFactory {

	public Shape getShape(String shp){
		if(shp.equals("CIRCLE")){
			return new Circle();
		}else if(shp.equals("SQUARE")){
			return new Square();
		}else if(shp.equals("RECTANGLE")){
			return new Rectangle();
		}else return null;
		
	}
}
