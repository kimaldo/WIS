package baekjoon;
import java.util.*; 
public class Main2588 {
    public static void main(String[] args) {

        int a,b;
        int arr[] = new int[3];
        Scanner scan = new Scanner(System.in); 
        a = scan.nextInt(); 
        b = scan.nextInt();

        arr[0] = b/100;
        arr[1] = (b%100)/10;
        arr[2] = b%10;
        
        System.out.println(a*arr[2]);
        System.out.println(a*arr[1]);
        System.out.println(a*arr[0]);
        System.out.println(a*b);
    }
}