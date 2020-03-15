package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Test08_Array {

	public static void main(String[] args) {
//		int[] Array = new int[5];
//		int sum = 0;
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 5개 입력하세요");
//		
//		for (int i = 0; i < Array.length; i++) {
//            System.out.print( (i+1) + "번째 숫자 입력 : ");
//                Array[i] = Integer.parseInt(sc.nextLine());
//                        
//            }
//		
//		for(int i = 0; i < Array.length; i++) {
//			sum += Array[i];
//		}
//		
//		int avg = sum / Array.length;
//		
//		System.out.println("입력 값" + Arrays.toString(Array));
//		System.out.println("합계" + sum);
//		System.out.println("평균" + avg);
		
		int[] array = new int[45];
		
//		int random = (int)(Math.random()*10000)+1;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10000)+1;
			System.out.println((i+1) + " : " + array[i]);
//			array[i] = random;
//			System.out.println(random);
		}
		
		
		
	}

}
