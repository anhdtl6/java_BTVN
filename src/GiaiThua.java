import java.util.Scanner;

public class GiaiThua {
    void nGiaiThua()
    {
        System.out.print("nhập n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%d giai thừa là:", n);
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer = answer * i;
        }
        System.out.print(answer);
    }
}
