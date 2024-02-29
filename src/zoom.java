import java.util.*;

//import java.util.Scanner;
//import java.util.Arrays;

public class zoom {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        scan.nextLine();
        int q = n/k;
        int [] line = new int[n];
        for(int i=0;i<n;i++)
        {
            line[i] = scan.nextInt();
        }
        for(int i = k-1; i<n;i=i+k)
        {
            System.out.print(line[i]+" ");
        }
    }
}
