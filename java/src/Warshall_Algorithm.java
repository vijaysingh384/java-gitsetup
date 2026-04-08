import java.util.Scanner;

public class Warshall_Algorithm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] a = new int[10][20];

        // input matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }

        int a1 = sc.nextInt();
        int b = sc.nextInt();

        // Warshall Algorithm
        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    a[i][j] = (a[i][j] == 1 ||
                            (a[i][k] == 1 && a[k][j] == 1)) ? 1 : 0;
                }
            }
        }

        // print matrix (same as your code)
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
        }

        // path checking
        if(a[a1][b] == 1){
            System.out.print("Path Exists");
        }
        else{
            System.out.print("Path does not Exist");
        }

        sc.close();
    }
}