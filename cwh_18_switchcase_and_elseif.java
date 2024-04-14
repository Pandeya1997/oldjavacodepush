import java.sql.SQLOutput;
import java.util.Scanner;

public class cwh_18_switchcase_and_elseif {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Your Name");
          String name = sc.nextLine();
          System.out.println(name);
         switch(name) {
             case "abhishek_yadev" :
                 System.out.println("you are going to become an adult");
             case "Ayush":
                 System.out.println("you going to join a jobs");
             case "Abhay":
                 System.out.println("you are fistly marrige party orgnigeswd");
             case "abhishek_pandey":
                 System.out.println("you are going to job search");
             default:
                 System.out.println("you are enjoy your life ");


         }
       /* System.out.println("Enter the your age");
        int  age = sc.nextInt();
       if (age>=56){
           System.out.println("your are exprienced gye seniours software");
       } else if (age>=36) {
           System.out.println("your are exprienced gye software");
       } else if (age>=18) {
           System.out.println("your are software learing face ");
       }
       else {
            System.out.println("you are child gye");
        }
       */
    }
}
