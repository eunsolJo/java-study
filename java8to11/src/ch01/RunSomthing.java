package ch01;

@FunctionalInterface // java standard lib에 들어서 별도 import가 되지 않음
public interface RunSomthing {

    // 함수형 인터페이스
    void doIt(); // interface는 abstract 생략가능
    //int doIt(int number);

    // <자바8의 추가 기능>
    // 1. static 메서드
    static void printName() {
        System.out.println("esjo");
    }

    // 2. default 메서드
    default void pringAge() {
        System.out.println("28");
    }

}
