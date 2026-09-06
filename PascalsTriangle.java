import java.util.Scanner;
public class PascalsTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(j==0||i==j){
                    System.out.print("1"+" ");
                } else {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
