package review;

public class Ex01_Lotta {

	public static void main(String[] args) {

        int[] lotto = new int[6];
        int sort;

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1; // 랜덤값 6번 뽑아라
            for(int j = 0; j < i; j++) { // 1개의 값은 넣겠다
                if(lotto[i]==lotto[j]) { // 1인덱스 0인덱스를 비교하고 값이 같으면 i를 0으로 보내서 다시 
                    i--;
                    break;
                }
            }
        }

        //정렬

        for(int i = 0; i < lotto.length; i++) { // 0~5까지 6번 반복
            for(int j = i+1; j < lotto.length; j++) { //1~5까지 반복
                if(lotto[i] > lotto[j]) { //i를 > 1~5까지 비교
                   //    0          1X   <- 0,1 인덱스에 있는 랜덤 숫자
                   //    0          1X
                   //    0          1O
                    sort = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = sort;
                }
            }
        }

        for(int i = 0; i < lotto.length; i++) {
            System.out.println(lotto[i] + " ");
        }

        //Today Point^^
        //개선된 for문, 향상된 for 문
        //Java: for(Type 변수명: 배열 or Collection) {실행구문}
        //C#  : for(Type 변수명 in 배열 or Collection) {실행구문}
        //JavaScript: for(Type 변수명 in 배열 or Collection) {실행구문}

        int[] arr3 = {5,6,7,8,9};
//        for(int i = 0; i < arr3.length; i++) {
//            System.out.println(arr3[i]);
//        }

        for(int val : arr3) {
            System.out.println(val);
        }

        String[] strarr = {"A","B","c","D","FFFF"};
        for(String val : strarr) {
            System.out.println(val);
        }

        //Emp[] list = {new Emp(1,"A"), new Emp(2,"B"), new Emp(3,"C")};

        //개선된 for문을 사용해서 사번, 이름 출력

        //for(Emp val : list) {
//            val.empInfoPrint();
//        }
//        
//        for(int i = 0; i < list.length; i++) {
//            list[i].empInfoPrint();
//        }

        //모닝 커피 퀴즈(3명)
        int[][] score3 = new int[][] {
            {11,12},
            {13,14},
            {15,16}
        };

        //개선된 for문을 사용해서 배열값 출력
        for(int[] col : score3) { //행
            for(int val : col) {
                System.out.println("값: " + val);
            }
        }

	}
}
