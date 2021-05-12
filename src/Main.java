public class Main {
    public static void main(String[]args){
        //BTVN buổi 1
//        Rectangle r= new Rectangle();
//        r.CalculatorPerimeterRectangle();
//        r.CalculatorRectangularArea();
//        Circle c = new Circle();
//        double sc=c.CalculatorPerimeterCircle();
//        System.out.println("Perimeter Circle: " + sc);
//        double rc = c.CalculatorCircleArea();
//        System.out.println("Circle Area:"+rc);

        // BTVN buổi 2
        // sử dụng switch case
        Switch sw= new Switch();
        sw.monthSwitch(2);
        // sử dụng if else
        IFELSE ifelse= new IFELSE();
        ifelse.monthIfElse(2);
        // nhập 3 số xem có phải là cạnh của tam giác
        Triangles triangles= new Triangles();
        triangles.numberTriangles(4,9,6);
        // phương trình bậc 2
        PTB2 ptb2=new PTB2();
            ptb2.PTBH(0, 5, 10);


    }
}
