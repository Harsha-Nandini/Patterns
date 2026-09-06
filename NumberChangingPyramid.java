import java.util.Scanner;
public class NumberChangingPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((count++)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
