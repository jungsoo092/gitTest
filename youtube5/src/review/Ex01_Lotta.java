package review;

public class Ex01_Lotta {

	public static void main(String[] args) {

        int[] lotto = new int[6];
        int sort;

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1; // ������ 6�� �̾ƶ�
            for(int j = 0; j < i; j++) { // 1���� ���� �ְڴ�
                if(lotto[i]==lotto[j]) { // 1�ε��� 0�ε����� ���ϰ� ���� ������ i�� 0���� ������ �ٽ� 
                    i--;
                    break;
                }
            }
        }

        //����

        for(int i = 0; i < lotto.length; i++) { // 0~5���� 6�� �ݺ�
            for(int j = i+1; j < lotto.length; j++) { //1~5���� �ݺ�
                if(lotto[i] > lotto[j]) { //i�� > 1~5���� ��
                   //    0          1X   <- 0,1 �ε����� �ִ� ���� ����
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
        //������ for��, ���� for ��
        //Java: for(Type ������: �迭 or Collection) {���౸��}
        //C#  : for(Type ������ in �迭 or Collection) {���౸��}
        //JavaScript: for(Type ������ in �迭 or Collection) {���౸��}

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

        //������ for���� ����ؼ� ���, �̸� ���

        //for(Emp val : list) {
//            val.empInfoPrint();
//        }
//        
//        for(int i = 0; i < list.length; i++) {
//            list[i].empInfoPrint();
//        }

        //��� Ŀ�� ����(3��)
        int[][] score3 = new int[][] {
            {11,12},
            {13,14},
            {15,16}
        };

        //������ for���� ����ؼ� �迭�� ���
        for(int[] col : score3) { //��
            for(int val : col) {
                System.out.println("��: " + val);
            }
        }

	}
}
