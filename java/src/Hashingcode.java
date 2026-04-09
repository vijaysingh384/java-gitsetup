import java.util.*;

public class Hashingcode {

    public static int calHash(int key, int size) {
        return key % size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int n = sc.nextInt();

        int[] keys = new int[n];
        for(int i = 0; i < n; i++) {
            keys[i] = sc.nextInt();
        }

        int[] hashTable = new int[size];

        // Initialize with -1
        Arrays.fill(hashTable, -1);

        for(int i = 0; i < n; i++) {
            int index = calHash(keys[i], size);

            // Linear probing
            while(hashTable[index] != -1) {
                index = (index + 1) % size;
            }

            hashTable[index] = keys[i];

            // Print index
            System.out.print(index + " ");
        }

        sc.close();
    }
}