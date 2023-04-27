package PBL.basic.Maths;
import java.util.*;

public class SumOfOddEven {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of elements you want to enter");
    int n = sc.nextInt();
    int sum_even = 0;
    int sum_odd = 0;
    for (int i = 1; i<=n;i++){
        System.out.println("Enter the no.");
        int a = sc.nextInt();
        if(a%2==0){
            sum_even = sum_even + a;
        }else{
            sum_odd = sum_odd + a;
        }
    }
    System.out.println("Sum of even no."+sum_even);
    System.out.println("Sum of odd no."+sum_odd);
} 
}
