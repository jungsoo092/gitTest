package JavaHomeWork;
import java.util.Arrays;
import java.util.Scanner;

public class moonja2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    int[] score = new int[3];

    System.out.println("ù��° ���Է�:");
    int num1 = sc.nextInt();
    score[0] = num1;

    System.out.println("�ι�° ���Է�:");
    int num2 = sc.nextInt();
    score[1] = num2;

    System.out.println("����° ���Է�:");
    int num3 = sc.nextInt();
    score[2] = num3;

    Arrays.sort(score); // sort = ���� ������� ���Ľ����ش� (���� ���� -> ū ����)
    System.out.println("�ִ밪: " + score[2]); // ���ķ� ���� ���� ū ���� �迭�� ���� �������� ���� ���̴�
    System.out.println("�ּҰ�: " + score[0]); // ���ķ� ���� ���� ū ���� �迭�� ���� ù��°�� ���� ���̴�
    
    }
}