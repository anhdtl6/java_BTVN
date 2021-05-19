import java.util.Scanner;

public class Array {

    void intArray() {
        int[] intArray = new int[3];
        // Nhập các phần tử
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Nhập phần tử vị trí " + i);
            intArray[i] = scanner.nextInt();
        }
        //In các phần tử
        System.out.println("Các phần tử của mảng ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        //Tìm phần tử lớn nhất và index của phần tử
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max1) {
                max2 = max1;
                max1 = intArray[i];
            } else if (intArray[i] > max2 && intArray[i] != max1) {
                max2 = intArray[i];
            }
        }
        System.out.println("Phần tử lớn nhất của mảng là: " + max1);
        getIndexOfElement(intArray, max1);

        System.out.println("Phần tử lớn thứ hai của mảng là: " + max2);
        getIndexOfElement(intArray, max2);
        //Tìm phần tử nhỏ nhất và index của phần tử
        int minValue = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (minValue > intArray[i]) {
                minValue = intArray[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất của mảng là: " + minValue);
        getIndexOfElement(intArray, minValue);
    }

    void getIndexOfElement(int arr[], int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("Vị trí " + i);
            }
        }
    }

    void arrayString() {
        String[] strArray = new String[3];
        Scanner scanner = new Scanner(System.in);
        //Nhập phần tử của mảng
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("Nhập phần tử vị trí " + i);
            strArray[i] = scanner.nextLine();
        }
        // In ra vị trí các phần tử
        System.out.println("Vị trí các phần tử của mảng");
        for (int i = 0; i < strArray.length; i++) {
            System.out.printf("Phần tử thứ %d: %s \n", i, strArray[i]);
        }
        // Số lần Java xuất hiện trong mảng
        int count = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals("java")) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện Java trong mảng là: " + count);
        //Nhập chuỗi, kiểm tra chuỗi ở vị trí nào của mảng
        System.out.print("Mời bạn nhập chuỗi muốn kiểm tra: ");
        String str = scanner.nextLine();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(str)) {
                System.out.println("Chuỗi bạn vừa nhập ở vị trí thứ : " + i);
            }
        }

    }

}
