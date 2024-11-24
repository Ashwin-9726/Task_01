// program to print pattern using i,j,k with value 5
public class Solution_6 {
    public static void main(String[] args) {
        int k = 5;
        for (int i = k; i > 0; i--) {
            for (int j = k; j > 0; j--) {

                if(j == k)
                {
                    System.out.print(j);
                }
                else if(i == k)

                {
                    System.out.print(i);
                } else if (j == k-1) {
                    System.out.print(j);

                }
                else if( i == k-1)
                {
                    System.out.print(i);
                }else if(j == k-2)
                {
                    System.out.print(j);
                }
                else if(i == k-2)

                {
                    System.out.print(i);
                }else if(j == k-3)
                {
                    System.out.print(j);
                }
                else if(i == k-3)

                {
                    System.out.print(i);
                }else if(j == k-4)
                {
                    System.out.print(j);
                }
                else if(i == k-4)

                {
                    System.out.print(i);
                }

            }
            System.out.println();

        }
    }
}

