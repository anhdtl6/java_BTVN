public class Triangles {
    void numberTriangles(int a, int b, int c){
        if((a+b>c)&&(a+c>b)&&(b+c>a)){
            System.out.println("Ba số này là cạnh của một tam giác");
        } else {
            System.out.println("Ba số này không là cạnh của tam giác");
        }
    }
}
