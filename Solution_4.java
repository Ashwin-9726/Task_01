//java program to find smallest of three numbers

import java.util.Scanner;

public class Solution_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        if(a<b && a<c){
            System.out.println(a+" is the smallest");
        }else if(b<a && b<c){
            System.out.println(b+" is the smallest");

        }else {
            System.out.println(c + " is the smallest");
        }
    }
}
