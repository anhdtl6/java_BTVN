import java.util.Scanner;
public class PrimeNumber {
     boolean isPrimeNumber(int n) {
        //Kiểm tra n=>2 không, nếu không > = 2 thì không phải là số nguyên tố
        if (n < 2) {
            return false;
        }
        // Kiểm tra số nguyên tố khi n>=2
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    void primeNumber() {
        System.out.print("Nhập n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int dem = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        while (dem < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
//      Dùng do-while
//        int i = 0;
//        do {
//            if (isPrimeNumber(i)) {
//                System.out.print(i + "\t");
//                dem++;
//            }
//            i++;
//        } while (dem < n);
    }
     void listPrimeNumber()
    {
        System.out.print("\nNhập n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là:", n);
        for(int i=2;i<=n;i++)
        {
            if(isPrimeNumber(i)) {
                System.out.print("\t"+i);
            }
        }
    }
}
