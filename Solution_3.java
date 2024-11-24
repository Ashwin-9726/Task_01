import java.util.Scanner;

public class Solution_3 {
    int remainder = 0;
    int reverse = 0;
    public static void main(String[] args) {

        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Solution_3 obj = new Solution_3();

        System.out.println("For loop reverse "+ obj.reverseValueUsingForLoop(num));
        System.out.println("while loop reverse "+ obj.reverseValueUsingWhileLoop(num));


    }

    //using for loop
    public  int reverseValueUsingForLoop(int num) {
        //using for loop

        int reverse = 0;
        for (; num != 0; num = num / 10) {
            remainder = num % 10;
            reverse = (reverse * 10) + remainder;
        }
        return reverse;
    }

    public  int reverseValueUsingWhileLoop(int num) {
        while (num > 0) {
            remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num = num / 10;


        }
        return reverse;
    }
}



