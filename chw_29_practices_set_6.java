import java.util.Arrays;

public class chw_29_practices_set_6 {
    public static void main(String[] args) {
      /*
        float[] number = {10.3f, 12.5f, 4.03f, 8.40f};
        float i;
        for( i = 0; i<=number.length ; i++){
        }
        System.out.printf("number arrays" + Arrays.toString(number));


       */
        // Practices Problem  1
        // Create an array of 5 floats and calculate their sum.
        // use for each loop
      /*   float[] marks = {10.2f, 23.45f, 94.5f};
        float sum = 0;

        for (float element : marks) {
            sum = sum + element;

        }
        System.out.println(sum);

       */
        /* Write a program to find out whether a given integer is present in an array or not.
          Practices Problem 2

        int marks [] = {10, 15, 18, 20, 34,25,49};
        int num = 110;
        boolean isInArray = false ;
        for (int element : marks){
            if(element == num){
                isInArray = true;
                break;
            }

        }
        if(isInArray){
            System.out.println("The values is present in array");
        }

        else{
            System.out.println("the values is not present"); }

         */
     /*
     Practices Problem 3
     Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
      */
        /*
        float[] marks = {10.2f, 23.45f, 94.5f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
   System.out.println(" the average marks from an array containing marks of all students " + sum/marks.length);

         */
        /*
        Practices  Problem 4
         Create a Java program to add two matrices of size 2x3.
         */
        /*
       int [] [] mat1 =  {{1,5,3} , {4,5,8}};
       int [] [] mat2 = {{3,5,7},{4,9,2}};
       int [][] result = {{0,0,0},{0,0,0}};

       for ( int  i = 0; i<mat1.length ; i++){
           for (int j = 0; j<=mat1.length;j++){
               System.out.format("i=%d, j=%d \n", i,j);
           }

       }

       for ( int  i = 0; i<mat1.length ; i++){

            for (int j = 0; j<=mat1.length;j++){
                result [i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i] [j] +" ");
            }

               System.out.println( " ");
            }

         */
        /*
        Practices Problem 5
        Write a Java program to reverse an array
         */
        /*
      int [] num1 = {10,14,15,17,18,21,23,25};
      for(int i = num1.length - 1; i>=0; i-- ){
          System.out.print(num1[i] + ",");
      }
      // second methos
        System.out.println("    ");
        int  [] aar = {23,45,2,7,5,4,34,666,453,6557,45655,7756,24543};
       int l = aar.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for(int i = 0; i<n; i++){
            // swap a[i] and a[l-1-i]
            // a b  temp
            // |4| |3|  |temp|

            temp = aar[i];
            aar[i] = aar[l-1-i];
            aar[l-1-i] = temp;
        }
        for (int element : aar){
            System.out.print(element  + ",");
        }

         */

        /*
        Practices Problem 6
        Write a Java program to find the maximum element in an array.
         */
        /*
        int  [] aar = {23,45,2,7,5,4,34,666,453,6557,45655,7756,240543};
        int max = 0;
        for(int element : aar){
            if(element >max){
              max =element;
            }

        }
        System.out.println(" maximum number in aaray" + max);

         */
        /*
        Problem 7
        Write a Java program to find the maximum element in a Java array.

         */
       /*
        int  [] aar = {23,45,2,7,5,4,34,666,453,6557,45655,-7756,240543};

        //int min = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int e : aar){
            if (e<min){
              min = e;
            }
        }

       // System.out.println(Integer.MIN_VALUE);
        System.out.println(min);

        */

        /*
        Write a Java program to find whether an array is sorted or not.

         */
        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }
}