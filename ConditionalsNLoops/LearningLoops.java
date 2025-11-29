package ConditionalsNLoops;

public class LearningLoops {
    
    public static void main(String[] args) {
        /** 
        // for loop 
            for(int i=0; i<5; i++){
                System.out.println("hello from for loop");
            }
        */
        // Question: print all the even nums b/w 0-10
        /**
        for (int i =0; i<=10; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }else{
                System.out.println(i + " is odd");
            }
        }
        */

        // Nested toop -> toop inside toop 
            //-> printing the tables
        /**
        for (int i=0; i<=2; i++){
            for (int j = 1; j<=10; j++){
                System.out.println(i * j);
            }
        }
        */

        // Question: print a given pattern
        /**
         * 
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * 
         */

        for (int i=0; i<5; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // while loop
        // do-while loop
    }
}
