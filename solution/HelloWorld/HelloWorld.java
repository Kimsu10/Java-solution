package solution.HelloWorld;
/** - 대소문자 구분
 *  - public class X가 존재하면 파일이름은 X.java가 되어야한다.
 *    최상단의 의 빨간글씨("The declared package '' does not match the expected package 'solution.example_program')는 소스 코드의 패키지 선언과 실제 파일 경로 또는 패키지 구조가 일치하지않아 발생했다.
 *    public 옆의 빨간글씨(the public type HellowWorld must be defined in its own file.)public 클래스가 소스 파일의 이름과 일치하지 않아 발생했다.
 *    파일명은 helloWorld인데 함수는 HelloWorld라서 발생함.
 *  - main 함수에서 프로그램이 시작하는데 main 함수의 형식을 기억하자.
 */

public class HelloWorld {
  public static void main (String[] args){
 
      System.out.println("HelloWorld");
  }
}