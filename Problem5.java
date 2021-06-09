import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}
class Square extends Shape {
    public Square(int w){
        width = w;
    }
    public void area(){
        width = width*width;
        System.out.println(width);
    }
}

class Circle extends Shape {
    public Circle(int w){
        width = w;
    }
    public void area() {
        double areaCircle = (double)Math.PI*(int)width*(int)width;
        System.out.println(areaCircle);
    }
}


public class Problem5 {
    public static void main(String[ ] args) {
    	try
    	(Scanner sc = new Scanner(System.in)){
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    } catch (Exception e) { 
	    e.printStackTrace();}}}
	
    
