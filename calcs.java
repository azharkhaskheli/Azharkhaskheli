import java.util.Scanner;
import java.lang.Math;
class Calc
{
        static int a,b;
        static Scanner sc = new Scanner(System.in);
        //////////////////////////////////////////
        static void input1()
        {
                System.out.println("Enter a no:");
                 a = sc.nextInt();
                System.out.println("Enter a no:");
                b = sc.nextInt();
        }
        static void input2()
       {
                System.out.println("Enter a no:");
                 a = sc.nextInt();
        }
        /////////////////////////////////////////
        static int add(int a,int b)
        {
                return a+b;
        }
        static int sub(int a,int b)
        {
                return a-b;
        }
        static int mul(int a,int b)
        {
                return a*b;
        }
       static int div(int a,int b)
        {
                return a/b;
        }
        static int sqr(int a)
        {
                return a*a;
        }
        static double sqroot(double a)
        {
                return Math.sqrt(a);
        }
}
class Calcu extends Calc
{
        static double c;
        static void input3()
        {
                System.out.println("Enter a no:");
                c = sc.nextDouble();
        }
        static double sine(double d)
        {
                return Math.sin(Math.toRadians(d));
        }
       static double cosine(double d)
        {
                return Math.cos(Math.toRadians(d));
        }
        static double tann(double d)
        {
                return Math.tan(Math.toRadians(d));
        }
        static double asine(double d)
       {
                return Math.asin(d);
        }
        static double acosine(double d)
        {
                return Math.acos(d);
        }
        static double atann(double d)
        {
                return Math.atan(d);
        }
        public static void main(String...args)
        {
                System.out.println("----Menu----");
                System.out.println("1.Add \n2.Sub \n3.Mul \n4.Div \n5.Sqr \n6.Sqr Root \n7.Sin \t\t8.Cos \t\t9.Tan \n10.Asin \t11.Acos \t12.Atan");
                int m = sc.nextInt();
                switch(m)
                {
                 case 1:
                        input1();
                        System.out.println("\n"+a+"+"+b+"="+add(a,b));
                        break;
                 case 2:
                        input1();
                        System.out.println("\n"+a+"-"+b+"="+sub(a,b));
                        break;
                 case 3:
                        input1();
                        System.out.println("\n"+a+"*"+b+"="+mul(a,b));
                        break;
                 case 4:
                        input1();
                        System.out.println("\n"+a+"/"+b+"="+div(a,b));
                        break;
                 case 5:
                        input2();
                        System.out.println("\nSquare of "+a+"="+sqr(a));
                        break;
                 case 6:
                        input2();
                        System.out.println("\nSquare root of "+a+"="+sqroot(a));
                        break;
                 case 7:
                        input3();
                        System.out.println("\nSine("+c+")="+sine(c));
                        break;
                 case 8:
                        input3();
                        System.out.println("\nCos("+c+")="+cosine(c));
                        break;
                 case 9:
                        input3();
                        System.out.println("\nTan("+c+")="+tann(c));
                        break;
                 case 10:
                        input3();
                        System.out.println("\nAsin("+c+")="+asine(c));
                        break;
                 case 11:
                        input3();
                        System.out.println("\nACos("+c+")="+acosine(c));
                        break;
                 case 12:
                        input3();
                        System.out.println("\nAtan("+c+")="+atann(c));
                        break;
                 default:
                        System.out.println("Wrong Entry");
         }
 }
} 