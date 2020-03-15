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
//			System.out.println("���ܸ޼��� : " + ae.getMessage());
//		}
//		System.out.println(6);
//		
//		Ex8_6
//		try {
//			Exception e = new Exception("���Ƿ� �߻�������");
//			throw e;
//		} catch(Exception e) {
//			System.out.println("���� �޽��� : " + e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("���α׷��� ���� ����Ǿ���");
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
//			System.out.println( f.getName()+ "������ ���������� �����Ǿ����ϴ�");
//		}catch(Exception e) {
//			System.out.println(e.getMessage()+" �ٽ� �Է��� �ֽñ� �ٶ��ϴ�");
//		}
//	}
//	
//	static File createFile(String fileName) throws Exception{
//		if(fileName==null || fileName.equals(""))
//			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�");
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
//			System.out.println("���� �޼��� : " + e.getMessage());
//			e.printStackTrace();
//			System.out.println("������ Ȯ���� �Ŀ� �ٽ� ��ġ�ϼ���");
//		}catch(MemoryException me) {
//			System.out.println("���� �޼���: " + me.getMessage());
//			me.printStackTrace();
//			System.gc();
//			System.out.println("�ٽ� ��ġ�� �õ��ϼ���");
//		}finally {
//			deleteTempFiles();
//		}
//		
//		Ex8_12
//		try{
//			method1();
//		}catch(Exception e) {
//			System.out.println("main�޼��忡�� ���ܰ� ó���Ǿ����ϴ�");
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
//			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
//			ie.initCause(e);
//			throw ie;
//		}catch (MemoryException2 me) {
//			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
//			ie.initCause(me);
//			throw ie;
//		}finally {
//			deleteTempFiles();
//		}
//	}
//	
//	static void startInstall() throws SpaceException2, MemoryException2{
//		if(!enoughSpace()) {
//			throw new SpaceException2("��ġ�� ������ �����մϴ�");
//		}
//		
//		if(!enoughMemory()) {
//			throw new MemoryException2("�޸𸮰� �����մϴ�");
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
//			System.out.println("mathod1 �޼��忡�� ���ܰ� ó���Ǿ����ϴ�");
//			throw e;
//		}
//	}
//	
//}
//
//	Ex8_11
//	static void startInstall() throws SpaceException, MemoryException{
//		if(!enoughSpace())
//				throw new SpaceException("��ġ�� ������  �����մϴ�");
//		if(!enoughMemory())
//			throw new MemoryException("�޸𸮰� �����մϴ�");
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
