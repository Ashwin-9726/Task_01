import java.util.Scanner;

//java program to calculate discount
public class Solution_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double amount =sc.nextInt();
      if(amount<500){
          System.out.println("No discount applied ");
      }else if(amount>=500 && amount<1000){
          amount=amount+(amount*0.1);
          System.out.println("The final payable amount is "+amount);
      }else if(amount>1000){
          amount=amount+(amount*0.2);
          System.out.println("The final payable amount is "+amount);

      }
    }
}
