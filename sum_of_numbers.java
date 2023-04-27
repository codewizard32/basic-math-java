package PBL.basic.Maths;
import java.util.*;

public class sum_of_numbers {

    public static void sum(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to calculate sum");
        int n = sc.nextInt();
        sum(n);
    }
}
