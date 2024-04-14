import java.util.Scanner;
public class chh_10_resulting_data_type {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        byte x = 5;
        int y = 2;
        short z = 8;
        int a = y+z;
        float b= 6.24f + x ;
        System.out.println(b);

        String n =  "abhishek";
        String m = 14+n;
        System.out.println(m+n);
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);
        int s = 7;
        int p = ++s*8;
        System.out.println(p);
        System.out.println("Enter the name first charector");
        char ch = sc.next().charAt(0);
        System.out.println(++ch);
        char type_custing = (char) (ch+1);
     System.out.println(type_custing);
    }
}
