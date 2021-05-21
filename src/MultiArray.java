import java.util.Scanner;

public class MultiArray {

    void multiArray()
    {
        int  n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng, cột của ma trận:");
        n = scanner.nextInt();
        int A[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "," + j + "]:");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận A");
       xuatMaTran(A,n);
        inVaTong(A,n);
        sxHang(A, n);
    }
    void xuatMaTran(int A[][],int n)
    {
        for(int i = 0; i<n;i++)
        {
            for(int j=0; j<n;j++) {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }
       void inVaTong(int A[][], int n)
       {
        // In và tính tổng các phần tử nằm trên đường chéo chính
        int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // kiểm tra nếu i == j thì mới tính tổng
                if (i == j) {
                    sum += A[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
    void sxHang(int A[][], int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n ; j++)
                if (A[1][i] > A[1][j]) {
                    int temp = A[1][i];
                    A[1][i] = A[1][j];
                    A[1][j] = temp;
                }
        System.out.println("Hàng 2 của ma trận sau khi sắp xếp tăng dần là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[1][i] + "\t");
        }
    }
}
