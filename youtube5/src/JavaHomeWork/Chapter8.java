//package JavaHomeWork;
//
//import java.io.File;
//
//public class Chapter8 {
//
//	public static void main(String[] args) {
//		
//		Ex8_1
//		System.out.println(1);
//		try {
//			System.out.println(2);
//			System.out.println(3);
//		}catch(Exception e) {
//			System.out.println(4);
//		}
//		System.out.println(5);
//		
//		Ex8_2
//		System.out.println(1);
//		try {
//			System.out.println(0/0);
//			System.out.println(2);
//		}catch(Exception e) {
//			System.out.println(3);
//		}
//		System.out.println(4);
//		
//		Ex8_3
//		System.out.println(1);
//		System.out.println(2);
//		
//		try {
//			System.out.println(3);
//			System.out.println(0/0);
//			System.out.println(4);
//		}catch(Exception e) {
//			System.out.println(5);
//		}
//		System.out.println(6);
//		
//		Ex8_4
//		System.out.println(1);
//		System.out.println(2);
//		
//		try {
//			System.out.println(3);
//			System.out.println(0/0);
//			System.out.println(4);
//		}catch(Exception e) {
//			System.out.println(5);
//		}
//		System.out.println(6);
//		
//		Ex8_5
//		System.out.println(1);
//		System.out.println(2);
//		
//		try {
//			System.out.println(3);
//			System.out.println(0/0);
//			System.out.println(4);
//		}catch(ArithmeticException ae) {
//			ae.printStackTrace();
//			System.out.println("예외메세지 : " + ae.getMessage());
//		}
//		System.out.println(6);
//		
//		Ex8_6
//		try {
//			Exception e = new Exception("고의로 발생시켰음");
//			throw e;
//		} catch(Exception e) {
//			System.out.println("에러 메시지 : " + e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("프로그램이 정상 종료되었음");
//		
//		Ex8_7
//		throw new Exception();
//
//		Ex8_8
//		throw new RuntimeException();
//		
//		Ex8_9
//		method1();
//	}
//	
//	static void method1() throws Exception{
//		method2();
//	}
//	static void method2() throws Exception{
//		throw new Exception();
//	}
//		
//		Ex8_10
//		try {
//			File f = createFile(args[0]);
//			System.out.println( f.getName()+ "파일이 성공적으로 생성되었습니다");
//		}catch(Exception e) {
//			System.out.println(e.getMessage()+" 다시 입력해 주시기 바랍니다");
//		}
//	}
//	
//	static File createFile(String fileName) throws Exception{
//		if(fileName==null || fileName.equals(""))
//			throw new Exception("파일이름이 유효하지 않습니다");
//		File f = new File(fileName);
//		f.createNewFile();
//		return f;
//	}
//		
//		Ex8_11
//		try {
//			startInstall();
//			copyFiles();
//		}catch(SpaceException e){
//			System.out.println("에러 메세지 : " + e.getMessage());
//			e.printStackTrace();
//			System.out.println("공간을 확보한 후에 다시 설치하세요");
//		}catch(MemoryException me) {
//			System.out.println("에러 메세지: " + me.getMessage());
//			me.printStackTrace();
//			System.gc();
//			System.out.println("다시 설치를 시도하세요");
//		}finally {
//			deleteTempFiles();
//		}
//		
//		Ex8_12
//		try{
//			method1();
//		}catch(Exception e) {
//			System.out.println("main메서드에서 예외가 처리되었습니다");
//		
//		Ex8_13
//		try {
//			install();
//		}catch(InstallException e) {
//			e.printStackTrace();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	static void install() throws InstallException{
//		try {
//			startInstall();
//			copyFiles();
//		}catch (SpaceException2 e) {
//			InstallException ie = new InstallException("설치 중 예외발생");
//			ie.initCause(e);
//			throw ie;
//		}catch (MemoryException2 me) {
//			InstallException ie = new InstallException("설치 중 예외발생");
//			ie.initCause(me);
//			throw ie;
//		}finally {
//			deleteTempFiles();
//		}
//	}
//	
//	static void startInstall() throws SpaceException2, MemoryException2{
//		if(!enoughSpace()) {
//			throw new SpaceException2("설치할 공간이 부족합니다");
//		}
//		
//		if(!enoughMemory()) {
//			throw new MemoryException2("메모리가 부족합니다");
//		}
//	}
//	
//	static void copyFiles() {}
//	static void deleteTempFiles() {}
//	
//	static boolean enoughSpace() {
//		return false;
//	}
//	
//	static boolean enoughMemory() {
//		return true;
//	}
//}
//
//class InstallException extends Exception{
//	InstallException(String msg){
//		super(msg);
//	}
//}
//
//class SpaceException2 extends Exception{
//	SpaceException2(String msg){
//		super(msg);
//	}
//}
//
//class MemoryException2 extends Exception{
//	MemoryException2(String msg){
//		super(msg);
//	}
//}
//	
//	Ex8_12
//	static void method1() throws Exception{
//		try{
//			throw new Exception();
//		}catch(Exception e) {
//			System.out.println("mathod1 메서드에서 예외가 처리되었습니다");
//			throw e;
//		}
//	}
//	
//}
//
//	Ex8_11
//	static void startInstall() throws SpaceException, MemoryException{
//		if(!enoughSpace())
//				throw new SpaceException("설치할 공간이  부족합니다");
//		if(!enoughMemory())
//			throw new MemoryException("메모리가 부족합니다");
//	}
//	
//	static void copyFiles() {}
//	static void deleteTempFiles() {}
//	
//	static boolean enoughSpace() {
//		return false;
//	}
//	
//	static boolean enoughMemory() {
//		return true;
//	}
//	
//}
//class SpaceException extends Exception{
//	SpaceException(String msg){
//		super(msg);
//	}
//}
//
//class MemoryException extends Exception{
//	MemoryException(String msg){
//		super(msg);
//	}
//}
