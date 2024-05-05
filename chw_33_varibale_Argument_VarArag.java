import static java.lang.Long.sum;

public class chw_33_varibale_Argument_VarArag {
   /*   static int foo(int a, int b){
       return a+b;
     } static int foo(int a, int b, int c){
       return a+b+c;
     }
     static int foo(int a, int b, int c, int d){
       return a+b+c+d;
     }  */
    static  int sum (int x, int ...array){
       int result = x;
       for(int a:array){
           result  += a;

       }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("sum the numbers");
        System.out.println("the sue method call" +  sum(1));
        System.out.println("The sum of 4 and 5 is" + sum (4,5 )) ;
        System.out.println("The sum of 4 , 5 and 8 is" + sum (4,5,  8));
        System.out.println("The sum of 4, 5, 8and 9 is" + sum(4,5, 8, 9));


    }
}
