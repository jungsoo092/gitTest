//package JavaHomeWork;
//
//import java.util.Scanner;
//
//public class Chapter2 {
//
//    public static void main(String[] args) {
//
//        Ex2_1
//
//        System.out.println("Hello, world");
//        System.out.print("Hello");
//        System.out.println("world");
//
//        Ex2_2
//
//        System.out.println("Hello, world");
//        System.out.print("3+5=");
//        System.out.println(3+5);
//
//        Ex2_3
//
//        System.out.println(5+3);
//        System.out.println(5-3);
//        System.out.println(5*3);
//        System.out.println(5/3);
//
//        Ex2_4
//        int x = 5; 
//        System.out.println(x);
//        x = 10;
//        System.out.println(x);
//
//        Ex2_5
//        int a = 10;
//        int b = 5;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//
//        Ex2_6
//        int x = 100;
//        double pi = 3.14;
//        char ch ='a';
//        String str = "abc";
//        
//        System.out.println(x);
//        System.out.println(pi);
//        System.out.println(ch);
//        System.out.println(str);
//
//        Ex2_7
//        String name = "Ja" + "va";
//        String str = name + 8.0;
//
//        System.out.println(name);
//        System.out.println(str);
//        System.out.println(7 + " ");
//        System.out.println(" " + 7);
//        System.out.println(7 + "");
//        System.out.println("" + 7);
//        System.out.println("" + "");
//        System.out.println(7 + 7 + "");
//        System.out.println("" + 7 + 7);
//
//        Ex2_8
//        int x = 10, y = 5;
//        System.out.println("x="+x);
//        System.out.println("y="+y);
//
//        int tmp = x; 
//        x = y; 
//        y = tmp; 
//        System.out.println("x="+x);
//        System.out.println("y="+y);
//
//        Ex2_9
//        String url = "www.codechobo.com";
//
//        float f1 = .10f;
//        float f2 = 1e1f;
//        float f3 = 3.14e3f;
//        double d = 1.23456789;
//
//        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
//        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
//        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
//        System.out.printf("d=%f%n", d);
//        System.out.printf("d=%14.10f%n", d);
//        System.out.printf("[12345678901234567890]%n");
//        System.out.printf("[%s]%n", url);
//        System.out.printf("[%20s]%n", url);
//        System.out.printf("[%-20s]%n", url);
//        System.out.printf("[%.8s]%n", url);
//        
//        Ex2_10
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.print("두자리 정수를 하나 입력해주세요.>");
//        String input = scanner.nextLine();
//        int num = scanner.nextInt();
//        
//        System.out.println("입력내용 : " + input);
//        System.out.printf("num=%d%n", num);
//        
//        Ex2_11
//        short sMin = -32768, sMax = 32767;
//        char cMin = 0, cMax = 65535;
//        
//        System.out.println("sMin = " + sMin);
//        System.out.println("sMin-1 = " + (short)(sMin-1));
//        System.out.println("sMax = " + sMax);
//        System.out.println("sMax+1 = " + (short)(sMax+1));
//        System.out.println("cMin = " + (int)cMin);
//        System.out.println("cMin-1 = " + (int)--cMin);
//        System.out.println("cMax = " + (int)cMax);
//        System.out.println("cMax+1 = " + (int)++cMax);
//        
//        Ex2_12
//        String str = "3";
//        
//        System.out.println(str.charAt(0) - '0');
//        System.out.println('3' - '0' + 1);
//        System.out.println(Integer.parseInt("3") + 1);
//        System.out.println("3" + 1);
//        System.out.println((char)(3 + '0'));
//        
//    }
//
//}
