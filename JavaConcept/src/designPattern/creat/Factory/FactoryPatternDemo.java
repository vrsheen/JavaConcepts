package designPattern.creat.Factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeFactory shpfc=new ShapeFactory();
		Shape shp1=shpfc.getShape("CIRCLE");
		shp1.draw();
		
		Shape shp2=shpfc.getShape("RECTANGLE");
		shp2.draw();
		
		Shape shp3=shpfc.getShape("SQUARE");
		shp3.draw();
	}

}
