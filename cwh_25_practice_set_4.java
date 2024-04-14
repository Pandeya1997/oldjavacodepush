import java.util.Scanner;
public class cwh_25_practice_set_4 {
    public static void main(String[] args) {
       /* for(int i = 0; i<=3;i++)
        {
           int j;
            for(j=0;j<=i;j++){
                System.out.print("*");

           }
           System.out.print("\n");


        }
         */
       /* for(int k=5;k>=0;k--){
            for(int l=0; l<= k;l++){
                System.out.print("*");

            }
            System.out.print("\n");
        }  */

    /* int sum =0;
     int n=4;
     for (int i=0; i<n;i++){
      sum = sum + (2*i);

     }
        System.out.println("Sum 4 First  even  number ");
        System.out.println(sum);
         */

       // practice 3
       /* int n = 10 ;
        for( int i =0; i<=n;i++){
          int l = n*i;
            System.out.print(l);
            System.out.println("\n");
        } */
       // Practice 4
       /*
       10*10 = 100  | 10*9 = 90 | 10*8 = 90 |  10*7 = 70 | 10*6 = 60 | 10*5 = 50 |
       10*4 = 40 | 10*3 = 30 | 10*2 = 20 | 10*1 = 10
     */
       /*
        int n = 10;
                for (int i = 10 ; i>= 1; i-- ){
                    int m= n*i;

                    System.out.print(n +"*"+ i +"="+m);
                    System.out.println("\n");
                    
                }
              */
        // practice 5
      //  5 = 5*4*3*2*1 = 120
        /*
        int n = 5;

        int fact = 1;
        int i = 1;
       while( i<=n ){
         fact = i*fact;
         i++;
       }
        System.out.println("factorial = "+  fact );
         */
        // practices 4
       //  10 table reverse order
       // int i =10;
        //for (int n = 10; i>=1; i--){
          //  int table =i*n;
            //System.out.println("table "+"=" + i +"*"+n +" = "+  table  );

        //}
        // Practices 7
        /* Patern type question use while loop
           *****
           ****
           ***
           **
           *

        int n =1 ;
        int i = 0;

        while(i<=n){
            int j = 0;
        while(j<=i){
            System.out.print("*");
           // System.out.println(j);
         j++;
        }
            System.out.print("\n");

            i++;

        }

         */
        // write a program 8 table sum find

        Scanner sc = new Scanner(System.in);
       /* System.out.println("enter table");
        int num = sc.nextInt();
        int n = 8;
        int table;
        int sum = 0;
        for (int i = 1; i<=10 ; i++){
           table=num*i;
            System.out.println(table);
             sum = sum +table;

        }
       System.out.println("sum " +"= "  +  sum);
        int sum = table;

        */

        //

       // sum n even number
       // 10 = 1*2*4*6*8*10
      int  n = 4;
        int sum = 0;
       int i = 0;
       while( i<=n ){

           sum = sum + (2*i);

           i++;
       }
        System.out.print(sum);
        System.out.print("\n");

    }

}
