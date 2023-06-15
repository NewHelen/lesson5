public class Main
{
    static public void main (String[] argv){

        ClassExample example = new ClassExample();
        System.out.println(example.getString());
        System.out.println(example.stringExample);


        System.out.println("Hello world");
        System.out.println("test");
        System.out.println("test");   //command +D copy
        byte byteVar1 = -128;
        byte byteVar2 = 127;

        System.out.println(byteVar1);

        //char or short 2 byte = 16 bit - 65K
        short shortVal1 = -32768;
        Short shortVal2 = 32767;
        //Int
        int intVal1 = -2147483648;
        int intVal2 = 2147483647;
        Integer intVal3 = 2147483647;
        // Float
        float floatVal1 = 5.054F;
        // Double
        double doubleVal1 = 5.00008787787878787878;
        //boolean
        boolean booleanVal1 = true;
        // char
        char charVal1 = 'a';

        // String
        String strVal1 ="Hello Olena";

        System.out.println("Chars");
        for (char ch: strVal1.toCharArray()){
            System.out.println(ch);
        }

        System.out.println("Bytes");
        for (byte bt: strVal1.getBytes()){
            System.out.println(bt);
        }

        String strVal2 ="Hello Olena";
        String strVal3 = null; //NULL

        StringBuffer strBuff = new StringBuffer("Привіт");
        strVal3 = strBuff.toString();

        System.out.println("strVal: " + strVal1 );  //конкотинація
        System.out.println("strVal2: " + strVal2 );
        System.out.println("strVal3: " + strVal3 );
        System.out.println("strVal1 = strVal2 " + ( strVal1 == strVal2 ));  //порівняти
        System.out.println("strVal1 = strVal3 " + ( strVal1 == strVal3 ));

        System.out.println("strVal1 equals strVal2 " + strVal1.equals(strVal2));  //порівнюе посимвольно
        System.out.println("strVal1 equals strVal3 " +  strVal1.equals(strVal3));

        strVal1 = null;
        //strVal1.equals("some string"); // отримаем ексепшен NullPointerException
        "some string".equals(strVal1);   // отримаем

        //Format
        int num =10;
        float coefficient = 1.5F;
        String message = "My message";
        String formatted = String.format("[%d] coefficient is %.2f message: %s %nNew line", num, coefficient, message);
        System.out.print(formatted + "\n");
        System.out.println("some line");
    }
}
