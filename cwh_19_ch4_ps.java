import java.util.Scanner;

public class cwh_19_ch4_ps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         /*
        byte m1,m2,m3;
        System.out.println("Enter your marks in physics");
        m1= sc.nextByte();
        System.out.println("Enter your mark chemistry");
        m2= sc.nextByte();
        System.out.println("Enter your mark mathematics");
        m3= sc.nextByte();
        float avg = (m1+m2+m3) / 3f;
        System.out.println(avg);
        if(avg>=40 && m1 >=33 && m2>=33 ) {
            System.out.println("congrlutions , you are promoted");
        }
       else {
                System.out.println("Sprry . you not promoted ");
            }
       */

       // probulms 3
         /*
        System.out.println("Enter your income in lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5f){
            tax = tax+ 0 ;
        }
        if(income > 2.5 && income <= 5f ){
            tax = tax + 0.05f*(income - 2.5f);
        }
        if (income > 5 && income <= 10f){
            tax = tax + 0.05f * (5f - 2.5f);
            tax =  tax + 0.2f*(income - 5f);
        }
        if (income > 10f){
            tax = tax + 0.05f * (5f - 2.5f);
            tax =  tax + 0.2f*(10f - 5f);
            tax = tax + 0.3f * (income-10f);
        }
        System.out.println("the total tax paid by the employee is : " +tax);
       */
       /* System.out.println("Enter the your number in week");
        int day = sc.nextInt();
        switch (day){
          case 1 -> System.out.println("Monday");
          case 2 -> System.out.println("Tuesday");
          case 3-> System.out.println("Wednesday");
          case 4 -> System.out.println("thursday");
          case 5 -> System.out.println("friday");
          case 6 -> System.out.println("saturday");
          case 7 -> System.out.println("sunday");
        } */
        System.out.println("enter the year");
        float year = sc.nextFloat();
        float leap;
        if(year % 4 == 0){
            System.out.println("welcome! your are in leap years ");
        }
        else  {
            System.out.println("Welcome! your are not in leap years ");
        }
        }
    }

