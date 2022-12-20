import java.util.Scanner;
//overloading
//2
class overload1{
    public int add(int a,int b){
        System.out.println("\nA = "+a);
        System.out.println("B = "+b);
        return a+b;
    }
    public double add(double a,double b){
        System.out.println("\nA = "+a);
        System.out.println("B = "+b);
        return a+b;
    }
}
class GFG{
    public static void main(String[] args){
        int a,b,c;
        double d,e,f;
        Scanner s1 = new Scanner(System.in);
        overload1 s = new overload1();
        System.out.println("Enter two numbers:");
        a=s1.nextInt();
        b=s1.nextInt();
        c=s.add(a, b);
        System.out.println("Sum = "+c);
        System.out.println("\nEnter two numbers:");
        d=s1.nextDouble();
        e=s1.nextDouble();
        f=s.add(d, e);
        System.out.println("Sum = "+f);
    }
}