package solution.TimesTable;

import java.util.Scanner;

public class TimesTable {
  public static void main(String[] args){
    System.out.println("2 이상 9 이하의 정수를 하나 입력 받아 n 값으로 사용하세요.");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int j = 1; j < 10; j++ ){
      System.out.println(n + "x" + j + "=" + n * j);
    }
    sc.close();
  }
}
