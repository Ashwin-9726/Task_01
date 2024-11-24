
//  write a program to print the numbers from 10 to 50 using for loop/while loop
public class Solution_1 {
    public static void main(String[] args)
    {
        // using for loop
        for (int i = 10; i <= 50; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        int j = 10;
        int k = 51;
        while (j < k) {
            System.out.print(j + " ");
            j++;
        }
    }
}