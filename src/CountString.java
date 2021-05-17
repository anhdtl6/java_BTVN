import java.util.Scanner;
import java.util.StringTokenizer;

public class CountString {

    void countWord()
    {
        System.out.println("Bài 8: Nhập vào chuỗi và đếm số từ của chuỗi");
       Scanner scanner = new Scanner(System.in);
        int dem=0;
        System.out.println("Mời bạn nhập chuỗi: ");
        String str = scanner.nextLine();
        for(int i=0; i< str.length()-1;i++)
        {
            if(str.charAt(i)==' '&& str.charAt(i+1)!=' ')
            {
                dem++;
            }
        }
        // kiểm tra kí tự đầu tiên có phải là dấu cách không
        if(str.charAt(0)!=' ')
        {
            dem++;
        }
        System.out.printf("Chuỗi \"%s\" có %d từ",str,dem);
    }
    void countString()
    {
        System.out.println("Bài 15: Đếm số lần ký tự '0' xuất hiện trong chuỗi");
        String n="You only live once, but if you do it right, once is enough";
        int dem=0;
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)=='o'){
                dem++;
            }
        }
        System.out.printf("Chuỗi \"%s\" có %d ký tự 'o'",n,dem);
    }

}
