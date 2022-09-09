3.	Accept number from user and print it in words. 
import java.util.Scanner;
class Unnamed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a = n/100;
        int b = (n%100)/10;
        int c = n%10;
        if(a==0 && b==0 && c==0)
            System.out.println("Zero");
        else if(a==0 && b==0 && c!=0)
            System.out.println(c+"");
        else if(a==0 && b!=0 && c==0)
            System.out.println(b+"0");
        else if(a==0 && b!=0 && c!=0)
            System.out.println(b+""+c);
        else if(a!=0 && b==0 && c==0)
            System.out.println(a+"00");
        else if(a!=0 && b==0 && c!=0)
            System.out.println(a+"0"+c);
        else if(a!=0 && b!=0 && c==0)
            System.out.println(a+""+b+"0");
        else
            System.out.println(a+""+b+""+c);
    }
}