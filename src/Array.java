import java.util.Scanner;

public class Array {

    void intArray()
    {
        int[] intArray= new int[3];
        // Nhập các phần tử
        Scanner scanner= new Scanner(System.in);
        for(int i=0;i<intArray.length;i++)
        {
            System.out.println("Nhập phần tử vị trí "+i);
            intArray[i]=scanner.nextInt();
        }
        //In các phần tử
        System.out.println("Các phần tử của mảng ");
        for(int i=0; i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }
        //Tìm phần tử lớn nhất và index của phần tử
        int maxValue=intArray[0];
        int index=0;
        for(int i=0; i<intArray.length;i++)
        {
            if(maxValue<intArray[i])
            {
                maxValue=intArray[i];
                index=i;
            }
        }
        System.out.println("Phần tử lớn nhất của mảng là: "+maxValue);
        System.out.println("Vị trí lớn nhất của mảng là: "+index);
        //Tìm phần tử lớn thứ hai và index của phần tử
        int index2=0;
        int max1Value=intArray[0];
        for(int i=1; i<intArray.length;i++)
        {
            if(intArray[i]>max1Value)
            {
                max1Value=intArray[i];
            }
        }
        int max2Value=intArray[0];
        for(int i=1; i<intArray.length;i++)
        {
            if(intArray[i]>max2Value&&intArray[i]<max1Value)
            {
                max2Value=intArray[i];
                index2=i;
            }
        }
        System.out.println("Phần tử lớn thứ hai của mảng là: "+max2Value);
        System.out.println("Vị trí lớn thứ hai của mảng là: "+index2);
        //Tìm phần tử nhỏ nhất và index của phần tử
        int minValue=intArray[0];
        int index1=0;
        for(int i=0; i<intArray.length;i++)
        {
            if(minValue>intArray[i])
            {
                minValue=intArray[i];
                index1=i;
            }
        }
        System.out.println("Phần tử nhỏ nhất của mảng là: "+minValue);
        System.out.println("Vị trí nhỏ nhất của mảng là: "+index1);
    }
    void arrayString()
    {
        String[] strArray= new String[3];
        Scanner scanner= new Scanner(System.in);
        //Nhập phần tử của mảng
        for(int i=0;i<strArray.length;i++)
        {
            System.out.println("Nhập phần tử vị trí "+i);
            strArray[i]=scanner.nextLine();
        }
        // In ra vị trí các phần tử
        System.out.println("Vị trí các phần tử của mảng");
        for(int i=0; i<strArray.length;i++)
        {
            System.out.printf("Phần tử thứ %d: %s \n", i, strArray[i]);
        }
        // Số lần Java xuất hiện trong mảng
        int count=0;
        for(int i=0; i<strArray.length;i++)
        {
            if(strArray[i].equals("java")) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện Java trong mảng là: "+count);
        //Nhập chuỗi, kiểm tra chuỗi ở vị trí nào của mảng
        System.out.print("Mời bạn nhập chuỗi muốn kiểm tra: ");
        String str= scanner.nextLine();
        for(int i=0; i<strArray.length;i++)
        {
            if(strArray[i].equals(str)) {
                System.out.println("Chuỗi bạn vừa nhập ở vị trí thứ : "+i);
            }
        }

    }

}
