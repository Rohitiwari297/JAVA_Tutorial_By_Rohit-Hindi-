public class Datatypes {
    public static void main(String[] args) {
        
        // we are discussing here about numerical datatypes in java

        // byte: 1 byte
        // short: 2 bytes
        // char: 2 bytes
        // int: 4 bytes
        // long: 8 bytes
        

        byte bInt = 123;
        short sInt = 12345;
        int iInt = 1234567;
        long lInt = 1234567890000000000l;

        // float: 4 bytes
        // double: 8 bytes

        float fFloat = 123.123f;  // if we are using multiple decimal points in float then compliler will reduce the precision if you want to print [123.123456789f] this then compiler convert it in [123.12346f]
        double dDouble = 123.456789;


        /**
         * boolean Datatype: -boolean: true or false
         *  - boolean is used to represent a true or false value
         *  - boolean: 1 bites
         * 
         * */ 

        boolean isBoolean = true;

        /**
         * Character Datatype:
         *   
         *   -char: 2 bytes 
         *   -char is used to represent a single character
         */

        char cChar = 'a';
    }
}
