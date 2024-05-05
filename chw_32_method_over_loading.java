public class chw_32_method_over_loading {
    public static void main(String[] args) {

        foo ();
        int a =10;
        int b =10;
        foo(a);
        foo(a,b);



    }
    static void foo (){
        System.out.println("Hello I Am Abhishek Pandey ");
    }static void foo (int x){
        System.out.println("Hello I Am Abhishek Pandey "+ x);
    }static void foo (int x, int y){
        System.out.println("Hello I Am Abhishek Pandey " +(x+y));
    }



}
