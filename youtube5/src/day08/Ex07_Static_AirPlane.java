package day08;

public class Ex07_Static_AirPlane {

	public static void main(String[] args) {
		/*
		AirPlane air = new AirPlane();
		air.makeAirPlane(101, "�����װ�");
		air.airPlaneTotalCount();
		
		AirPlane air2 = new AirPlane();
		air2.makeAirPlane(303, "�����װ�");
		air2.airPlaneTotalCount();
		
		AirPlane air3 = new AirPlane();
		air3.makeAirPlane(404, "�����װ�");
		air3.airPlaneTotalCount();
		*/
		AirPlane air = new AirPlane();
		air.setAirnum(101);
		air.getAirnum();
		air.setAirname("����A");
		air.getAirname();
		air.getAirtotalcount();
		
		AirPlane air2 = new AirPlane();
		air2.setAirnum(102);
		air2.getAirnum();
		air2.setAirname("����B");
		air2.getAirname();
		air2.getAirtotalcount();
		
		
//		AirPlane air2 = new AirPlane(708, "�����װ�");
//		air.airPlaneTotalCount();
//		
//		
//		AirPlane air3 = new AirPlane(709, "�����װ�");
//		air.airPlaneTotalCount();
//		
//		AirPlane air4 = new AirPlane(808, "�ƽþƳ�");
		
	}

}
