package ConditionalsNLoops;

public class LearningConditionals {
    
    public static void main(String[] args) {

    /**
    //if-else
        boolean sheAgreed = true ;

        if( !sheAgreed){
            System.out.println("maje hi mahe");
        }else{
            System.out.println("Tinder hai naa !");
        }

        System.out.println("Last me to ghar hi jana hai");
    */
    /**
    //if-else-if-else - Nested Conditionals 
        int a = 2;
        int b = 16;
        int c = 13;

        if (a >= b){
            if (a >= c) {
                System.out.println("A is greater than B and C");
            }else{
                System.out.println("C is greater than B but less than A");
            }
        }else {
            if (b >= c){
            System.out.println("B is greater than C but less than A");
            }else{
                System.out.println("C is greater than A and B");
            }
        }
    */

    
    
    //multi if/else conditions
        
        /**
         * >80 -> A
         * 70 - 80 -> B
         * 60 - 70 -> C
         * 50 - 60 -> D
         * <50 -> F
         */
        /**
        int marks = 57;
        if (marks >= 80){
            System.out.println("A");  
        }else if (marks >= 70 && marks < 80){
            System.out.println("B");
        }else if (marks >= 60 && marks < 70){
            System.out.println("C");
        }else if (marks >= 50 && marks < 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        */

         
    // Switch Case Condition

        int num = 9;
        switch(num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Not a valid number");
                break;
        }

    }

    
}
