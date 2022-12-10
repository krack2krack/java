package Chapter02;

import java.util.*;

public class VarEx {
    public static void main(String args[]) {
        // ex1();
        // swap();
        // finalTest();
        // printfTest();
        // printfTest2();
        // scannerTest();
        // decimalToBin(10);
        // decimalToOct(10);
        // decimalToHex(10);
        charToUnicode('가');

    }

    static void ex1() {
        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);
    }

    static void swap() {
        int x = 10, y = 20;
        int temp = 0;

        System.out.println(String.format("x : %d, y : %d", x, y));
        temp = y;
        y = x;
        x = temp;
        System.out.println(String.format("x : %d, y : %d", x, y));
    }

    static void finalTest() {
        final String test = "test final value";
        // test = "바보";
        // compile 불가
        System.out.printf("test value : %s", test);
    }

    static void printfTest() {
        byte b = 1;
        short s = 2;
        char c = 'A';
        int finger = 10;
        long big = 100_000_000_000L;
        long bin = 0b1111_1111_1111_1111L;
        long oct = 07777_7777_7777L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;
        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b = %d\n", b);
        System.out.printf("s = %s\n", s);
        System.out.printf("c = %c, %d\n", c, (int) c);
        System.out.printf("finger = [%5d]\n", finger);
        System.out.printf("finger = [%-5d]\n", finger);
        System.out.printf("finger = [%05d]\n", finger);
        System.out.printf("big = %d\n", big);
        System.out.printf("bin = 0b%s\n", Long.toBinaryString(bin));
        System.out.printf("oct = %#o\n", oct);
        System.out.printf("hex = %#x\n", hex); // #은 접두사, 16진수 0x, 8진수 0
        System.out.printf("octNum = %o, %d\n", octNum, octNum);
        System.out.printf("hexNum = %x, %d\n", hexNum, hexNum);
        System.out.printf("binNum = %s, %d\n", Integer.toBinaryString(binNum), binNum);
    }

    static void printfTest2() {
        String url = "http://google.com";
        float f1 = .10f; // 0.10, 1.0e-1
        float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
        float f3 = 3.14e3f; // 3140.0
        double d = 1.23456789;

        System.out.printf("f1 = %f, %e, %g\n", f1, f1, f1);
        System.out.printf("f2 = %f, %e, %g\n", f2, f2, f2);
        System.out.printf("f3 = %f, %e, %g\n", f3, f3, f3);

        System.out.printf("d = %f\n", d);
        System.out.printf("d = %14.10f\n", d); // 전체 14자리 중 소수점 10자리
        System.out.printf("[123456789101111123123]\n");
        System.out.printf("[%s]\n", url);
        System.out.printf("[%20s]\n", url);
        System.out.printf("[%s-20]\n", url); // 왼쪽 정렬
        System.out.printf("[%.8s]\n", url); // 왼쪽에서 8글자만 출력
    }

    static void scannerTest() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.printf("input : %s", input);
        scan.close();
    }

    static String decimalTo(int dividend, int divisor) {
        String result = "";

        Map<Integer, String> ht = new HashMap<Integer, String>();
        ht.put(0, "0");
        ht.put(1, "1");
        ht.put(2, "2");
        ht.put(3, "3");
        ht.put(4, "4");
        ht.put(5, "5");
        ht.put(6, "6");
        ht.put(7, "7");
        ht.put(8, "8");
        ht.put(9, "9");
        ht.put(10, "A");
        ht.put(11, "B");
        ht.put(12, "C");
        ht.put(13, "D");
        ht.put(14, "F");
        ht.put(15, "E");

        while (dividend >= divisor) {
            int q = (int) dividend / divisor;
            int r = (int) dividend % divisor;

            dividend = q;

            if (divisor == 16) {
                result += ht.get(r);
            } else {
                result += r;
            }
        }

        if (divisor == 16) {
            result += ht.get(dividend);
        } else {
            result += dividend;
        }

        StringBuffer sb = new StringBuffer(result);
        String reversedStr = sb.reverse().toString();
        return reversedStr;

    }

    static void decimalToBin(int number) {
        String result = decimalTo(number, 2);
        System.out.printf("Number %d to binary => 0b%s\n", number, result);
    }

    static void decimalToHex(int number) {
        String result = decimalTo(number, 16);
        System.out.printf("Number %d to hexadecimal => 0x%s\n", number, result);

    }

    static void decimalToOct(int number) {
        String result = decimalTo(number, 8);
        System.out.printf("Number %d to octal => 0%s\n", number, result);

    }

    static void charToUnicode(char value) {
        int code = (int) value;
        System.out.printf("%c => %d(%#X)\n", value, code, code);

    }
}
