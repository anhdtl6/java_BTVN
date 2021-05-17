import java.util.Scanner;

public class Fibonacci {
        int fibonacci(int n)
        {
            int f0 = 0;
            int f1 = 1;
            int fn = 1;
            int i;
            if (n < 0) {
                return -1;
            } else if (n == 0 || n == 1) {
                return n;
            } else {
                for (i = 2; i < n; i++) {
                    f0 = f1;
                    f1 = fn;
                    fn = f0 + f1;
                }
            }
            return fn;
        }
        void fibonacciFirst()
        {
            int n;
            System.out.print("Nhập n= ");
            Scanner scanner= new Scanner(System.in);
            n=scanner.nextInt();
            System.out.println("Các số fibonacci đầu tiên là: ");
            for (int i=0;i<n;i++)
            {
                System.out.print("\t"+fibonacci(i));
            }
        }
        void listFibonacci()
        {
            System.out.print("Nhập n= ");
            Scanner scanner= new Scanner(System.in);
            int n=scanner.nextInt();
            System.out.printf("Danh sách các số fibonacci nhỏ hơn %d là: ", n);
            for (int i = 0; fibonacci(i) < n; i++){
                System.out.print(fibonacci(i) + "\t");
            }
        }
}

