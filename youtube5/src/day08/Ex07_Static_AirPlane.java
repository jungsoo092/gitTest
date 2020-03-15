package day08;

public class Ex07_Static_AirPlane {

	public static void main(String[] args) {
		/*
		AirPlane air = new AirPlane();
		air.makeAirPlane(101, "대한항공");
		air.airPlaneTotalCount();
		
		AirPlane air2 = new AirPlane();
		air2.makeAirPlane(303, "대한항공");
		air2.airPlaneTotalCount();
		
		AirPlane air3 = new AirPlane();
		air3.makeAirPlane(404, "대한항공");
		air3.airPlaneTotalCount();
		*/
		AirPlane air = new AirPlane();
		air.setAirnum(101);
		air.getAirnum();
		air.setAirname("대한A");
		air.getAirname();
		air.getAirtotalcount();
		
		AirPlane air2 = new AirPlane();
		air2.setAirnum(102);
		air2.getAirnum();
		air2.setAirname("대한B");
		air2.getAirname();
		air2.getAirtotalcount();
		
		
//		AirPlane air2 = new AirPlane(708, "대한항공");
//		air.airPlaneTotalCount();
//		
//		
//		AirPlane air3 = new AirPlane(709, "대한항공");
//		air.airPlaneTotalCount();
//		
//		AirPlane air4 = new AirPlane(808, "아시아나");
		
	}

}
