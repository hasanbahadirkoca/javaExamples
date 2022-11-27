public class widening {
        
        public static void main(String[] args) {
            byte myByte = 127;
            short myShort = 32767;
            int myInt = 88;
            long myLong = 999999999;
            float myFloat = 3.14f;
            double myDouble = 3.14159265359d;
            
            System.out.println("myByte: " + myByte);
            System.out.println("myShort: " + myShort);
            System.out.println("myInt: " + myInt);
            System.out.println("myLong: " + myLong);
            System.out.println("myFloat: " + myFloat);
            System.out.println("myDouble: " + myDouble);
            
            // Widening
            myDouble = myFloat;
            myFloat = myLong;
            myLong = myInt;
            myInt = myShort;
            myShort = myByte;
            
            System.out.println("\nmyShortWidening: " + myShort);
            System.out.println("myIntWidening: " + myInt);
            System.out.println("myLongWidening: " + myLong);
            System.out.println("myFloatWidening: " + myFloat);
            System.out.println("myDoubleWidening: " + myDouble);
        }
}
