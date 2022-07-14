package baekjoon;
import java.util.*; 
public class Main1001 {
    public static void main(String[] args) {

        int a,b;
        Scanner scan = new Scanner(System.in); //사용자로부터 입력 받을 때 사용하는 참조형 변수이다
        a = scan.nextInt(); //공백 전까지의 정수를 입력 받아 a에 저장
        b = scan.nextInt();
        
        System.out.println(a+b);
    }
}