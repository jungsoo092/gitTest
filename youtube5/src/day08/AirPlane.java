package day08;

public class AirPlane {

	private int airnum;
	private String airname;
	private static int airtotalcount; //��� ��ü�� �����ϴ� �����ڿ�
	
	//public AirPlane() {}
	//this ���� : 100��
//	public AirPlane(int airnum , String airname) { //����� �ݵ�� ��ȣ , �̸� ...����
//		this.airnum = airnum;
//		this.airname = airname;
//		//����
//		airtotalcount++;
//		System.out.printf("��ȣ:[%d] , �̸�:[%s]\n",airnum,airname);
//		
//	}
	
	public int getAirnum() {
		System.out.print("��ȣ : " + this.airnum);
		return airnum;
		
	}



	public void setAirnum(int airnum) {
		this.airnum = airnum;
//		System.out.println("��ȣ : " + this.airnum);
		airtotalcount++;
	}



	public String getAirname() {
		System.out.println(", �̸� : " + airname);
		return airname;
	}



	public void setAirname(String airname) {
		this.airname = airname;
	}



	public static int getAirtotalcount() {
		System.out.printf("�� ����� ���� �� �� :[%d]\n",airtotalcount);
		return airtotalcount;
	}



//	public void airPlaneTotalCount() {
//		System.out.printf("�� ����� ���� �� �� :[%d]\n",airtotalcount);
//	
//	}
}
