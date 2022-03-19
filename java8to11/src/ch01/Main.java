package ch01;

public class Main {
    public static void main(String[] args) {

	/** 익명 내부 클래스 anonymous inner class */

	// 자바8 이전
	RunSomthing runSomthing1 = new RunSomthing() {
	    @Override
	    public void doIt() {
		System.out.println("Hello");
	    }
	};

	// 자바 8
	RunSomthing runSomthing2 = () -> System.out.println("Hello");

	RunSomthing runSomthing3 = () -> {
	    System.out.println("Hello");
	    System.out.println("Bye");
	};

	runSomthing1.doIt();
	runSomthing2.doIt();
	runSomthing3.doIt();
    }
}