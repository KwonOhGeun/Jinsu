import java.util.Scanner;

public class Jinsu {
    public static void main(String[] args) {
        //수를 입력 받아서 진수를 판별해보자.
        Scanner s = new Scanner(System.in);
        int data;

        System.out.printf("정수를 입력하세요 ==> ");
        data= s.nextInt();

        System.out.printf("10진수로 출력하세요 ==> %d\n", data);
        System.out.printf("16진수로 출력하세요 ==> %x\n", data);
        System.out.printf("8진수로 출력하세요 ==> %o\n",data);



    }
}
