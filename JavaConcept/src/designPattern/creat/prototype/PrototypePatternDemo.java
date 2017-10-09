package designPattern.creat.prototype;

public class PrototypePatternDemo {
	   public static void main(String[] args) {
		   //https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
	      ShapeCache.loadCache();

	      Shape clonedShape = (Shape) ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());	
	      clonedShape.draw();

	      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
	      System.out.println("Shape : " + clonedShape2.getType());	
	      clonedShape2.draw();

	      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
	      System.out.println("Shape : " + clonedShape3.getType());	
	      clonedShape3.draw();
	   }
	}
