import java.util.Scanner;

public class SaoTamGiac {
    Scanner scanner= new Scanner(System.in);
    int height;
    void saoTamGiac()
    {
        do {
            System.out.print("Nhập vào height: ");
            height= scanner.nextInt();
            if(height<=0)
            {
                System.out.println("Hãy nhập chiều cao > 0");
            }
        }while(height<=0);
        inSao();
    }
    void inSao()
    {
        for (int i = 0; i < height; i++) {
            for (int j = height - i; j > 1; j--) {
                System.out.print("   ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
