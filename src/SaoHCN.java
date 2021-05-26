import java.util.Scanner;

public class SaoHCN {
    Scanner scanner= new Scanner(System.in);
    int height;
    int width;
    void saoHCN()
    {
        do {
            System.out.print("Nhập vào height: ");
            height= scanner.nextInt();
            if(height<=0)
            {
                System.out.println("Hãy nhập chiều cao > 0");
            }
            System.out.print("Nhập vào width: ");
            width= scanner.nextInt();
            if(width<=0)
            {
                System.out.println("Hãy nhập chiều rộng > 0");
            }
        }while(width<=0&& height<=0);
        inHCN();
    }
    void inHCN() {
        for (int i = 0; i < height; i++) {
            System.out.println();
            for (int j = 0; j < width; j++) {
                System.out.print(" * ");
            }
        }
    }
}
