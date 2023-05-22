public class LessonJavaOne {

    public static byte byteMaxVal = Byte.MAX_VALUE;
    public static int intMaxVal = Integer.MAX_VALUE;
    public static double doubleMaxVal = Double.MAX_VALUE;
    public static void main (String[] args) {

        int x = 1220;
        int y = 10;

        //Вычисления
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("y / x = " + (y / x));
        System.out.println("x / y = " + (x / y));
        System.out.println("y % x = " + (y % x));
        System.out.println("x % y = " + (x % y));
        System.out.println("x++   = " +  (x++));
        System.out.println("x--   = " +  (x--));
        System.out.println("++y   = " +  (++y));

        //Равенства
        System.out.println("x == y = " + (x == y));
        System.out.println("x != y = " + (x != y) );
        System.out.println("x > y = " + (x > y) );
        System.out.println("x < y = " + (x < y) );
        System.out.println("b >= y = " + (y >= x) );
        System.out.println("b <= y = " + (y <= x) );

        //Переполнение Byte
        byte a = 126;
        byte b = (byte) (a + 25);
        System.out.println("Результат = " + (b));
        System.out.println("Результат = " + (byte) (byteMaxVal + 1));

        //Переполнение Integer
        int q = Integer.MAX_VALUE;
        int z = q + 1;
        System.out.println("Результат = " + (z));
        System.out.println("Результат = " + (intMaxVal + 1));

        double c = 6.9;

        System.out.println("int(x) + double(c) = " + (x + c));
        System.out.println("int(x) * double(c) = " + (x * c));
        System.out.println("int(x) / double(c) = " + (x / c));
        System.out.println("int(x) - double(c) = " + (x - c));
        System.out.println("int(x) % double(c) = " + (x + c));
        System.out.println("int(x) + double(c) = " + (x + c));

        //переполнение Double
        double result = doubleMaxVal + 3.14;
        System.out.println("Результат = " + result);

    }
}
