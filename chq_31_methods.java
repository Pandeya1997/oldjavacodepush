public class chq_31_methods {
    public static void main(String[] args) {
        int a =5;
        int b = 10;
       int c;
        // static methods calling
      // int c= sum (a,b);
       // object method
        chq_31_methods obj =new chq_31_methods();
        c =  obj.sum(a,b);
        System.out.println(c+ "c");
        int a1= 10;
        int b1 =4;
        int c1 = obj.sum(a1,b1);
        System.out.println(c1 +"c1");
    }
     int sum (int x, int y ){
        int z =0 ;
        if(x>y){
            z = (x+y)*5;
        }else{
            z=( (x+y)*10);
        }
        return  z;
    }
}
