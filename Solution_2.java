import java.sql.SQLOutput;
import java.util.Scanner;

//write a program to find a given number is negative or postive
public class Solution_2 {
    public static void main(String[] args){
        System.out.println("Enter a Value ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num>0)
            System.out.println("The given number is positive ");
        else if(num<0){
            System.out.println("The given number is negative");
        }
        else{
            System.out.println("The given number is neither positive nor negative ");
        }
    }
}
