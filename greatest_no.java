package PBL.basic.Maths;
import java.util.*;

public class greatest_no {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three no.s");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("The greatest no. is "+ a);
        }
        else if(b>a && b>c){
            System.out.println("The greatest no. is " + b);
        }
        else{
            System.out.println("The greatest no. is " + c);
        }
    }
}
