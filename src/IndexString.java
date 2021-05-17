public class IndexString {
    void indexString()
    {
        System.out.printf("Bài số 5: In ra màn hình index của tất cả ký tự 'o' trong chuỗi");
        String str="You only live once, but if you do it right, once is enough";
        System.out.println("Index của ký tự 'o' là:");
        int dem=0;
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)=='o')
            {
                System.out.print(i+"\t");
                dem++;
            }
        }
        System.out.println("\nSố lần xuất hiện của kí tự '0' là: "+dem);
    }
}
