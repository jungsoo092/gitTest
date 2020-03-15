package JavaHomeWork;
import java.util.Arrays;
import java.util.Scanner;

public class moonja2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    int[] score = new int[3];

    System.out.println("첫번째 수입력:");
    int num1 = sc.nextInt();
    score[0] = num1;

    System.out.println("두번째 수입력:");
    int num2 = sc.nextInt();
    score[1] = num2;

    System.out.println("세번째 수입력:");
    int num3 = sc.nextInt();
    score[2] = num3;

    Arrays.sort(score); // sort = 값을 순서대로 정렬시켜준다 (작은 숫자 -> 큰 숫자)
    System.out.println("최대값: " + score[2]); // 정렬로 인해 가장 큰 수는 배열의 가장 마지막에 있을 것이다
    System.out.println("최소값: " + score[0]); // 정렬로 인해 가장 큰 수는 배열의 가장 첫번째에 있을 것이다
    
    }
}