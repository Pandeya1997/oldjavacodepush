import java.util.Scanner;
public class cwh_11_ex1_sol {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your school Name");
        char school_name = sc.next().charAt(0);
        System.out.println("Enter marks first subject 1 = math ");
        double subject_1 = sc.nextDouble();
        System.out.println("Enter marks first subject 2 = Science ");
        double subject_2 = sc.nextDouble();
        System.out.println("Enter marks first subject 3 = Hindi ");
        double subject_3 = sc.nextDouble();
        System.out.println("Enter marks first subject 4 = English ");
        double subject_4 = sc.nextDouble();
        System.out.println("Enter marks first subject 5 = Social science ");
        double subject_5 = sc.nextDouble();
        System.out.println("Enter marks first subject 6 = Sanskarit ");
        double subject_6 = sc.nextDouble();
        double total = subject_1 + subject_2 +subject_3 + subject_4 + subject_5 + subject_6;
        double precentage = (total /600 )*100;
        System.out.println("School Name  " + school_name + " Total Marks High schools = " + total + "High Schools Percentage = " + precentage +"%");

    }
}
