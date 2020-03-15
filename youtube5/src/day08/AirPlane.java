package day08;

public class AirPlane {

	private int airnum;
	private String airname;
	private static int airtotalcount; //모든 객체가 공유하는 공유자원
	
	//public AirPlane() {}
	//this 적용 : 100점
//	public AirPlane(int airnum , String airname) { //당신은 반드시 번호 , 이름 ...강제
//		this.airnum = airnum;
//		this.airname = airname;
//		//강제
//		airtotalcount++;
//		System.out.printf("번호:[%d] , 이름:[%s]\n",airnum,airname);
//		
//	}
	
	public int getAirnum() {
		System.out.print("번호 : " + this.airnum);
		return airnum;
		
	}



	public void setAirnum(int airnum) {
		this.airnum = airnum;
//		System.out.println("번호 : " + this.airnum);
		airtotalcount++;
	}



	public String getAirname() {
		System.out.println(", 이름 : " + airname);
		return airname;
	}



	public void setAirname(String airname) {
		this.airname = airname;
	}



	public static int getAirtotalcount() {
		System.out.printf("총 비행기 제작 대 수 :[%d]\n",airtotalcount);
		return airtotalcount;
	}



//	public void airPlaneTotalCount() {
//		System.out.printf("총 비행기 제작 대 수 :[%d]\n",airtotalcount);
//	
//	}
}
