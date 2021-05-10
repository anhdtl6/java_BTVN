public class Main {
    public static void main(String[]args){
        Rectangle r= new Rectangle();
        r.CalculatorPerimeterRectangle();
        r.CalculatorRectangularArea();
        Circle c = new Circle();
        double sc=c.CalculatorPerimeterCircle();
        System.out.println("Perimeter Circle: " + sc);
        double rc = c.CalculatorCircleArea();
        System.out.println("Circle Area:"+rc);
    }
}
