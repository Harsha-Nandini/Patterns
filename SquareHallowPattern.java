import java.util.Scanner;
class SquareHallowPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = sc.nextInt();
        System.out.println("***SquareHallowPattern***"); 
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(i==0||i==n-1||j==0||j==n-2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}