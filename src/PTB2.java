public class PTB2 {
    void PTBH(float a, float b, float c ) {
        float x1; float x2 = 0;
        float delta = ((b * b) - (4 * a * c));
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
            return;
        }
        if (delta < 0) {
            x1=x2= (float) 0.0;
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            x1 = x2 = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép x1=x2= "+x1);
        } else {
            delta = (float) Math.sqrt(delta);
            x1 = (-b + delta) / (2*a);
            System.out.println("Phương trình có 2 nghiệm x1="+x1+" và x2= "+x2);
        }

    }
}
