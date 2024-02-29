import java.util.Scanner;
public class pyramids {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int check = 1;
        int sum = 0;
        while(check*check < num){
            num -= check*check;
            check += 2;
            sum++;
        }
        System.out.print(sum);
    }
}
