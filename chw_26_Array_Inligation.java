 class chw_26_Array_Inligation {
    public static void main(String[] args) {
     /*   int [] marks = new int [5];
         marks[0] = 100;
         marks[1] = 60;
         marks[2] = 70;
         marks[3] = 90;
        marks[4] = 86;
        System.out.println(marks[3]);

      */

     /*  int [] marks;  //Declaration!
       marks  = new int [5]; //Memory allocation!
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        System.out.println(marks[4]);

      */
       // Declaration, memory allocation and initialization together
        int [] marks  =  {100,60,70,30,20,50,90};

       // System.out.println(marks[4]);
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);

        }

    }
}
