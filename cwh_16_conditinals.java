import java.util.Scanner;
public class cwh_16_conditinals {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter The your Age");
     int age = sc.nextInt();
     if(age>=18)
     {
         System.out.println("You are Eligble for Apply  election id card ");
     }
     if(age !=17){
         System.out.println("you are Eligble for application next years ");
        }
    else {
         System.out.println("you are not Eligble for  Apply election id card");
        }



    }
}
