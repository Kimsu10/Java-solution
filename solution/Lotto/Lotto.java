import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {
        int[] winningNumbers = makeLottoNumber();
        int[] selectedNumber = getselectedNumber();

        Arrays.sort(winningNumbers);
        Arrays.sort(selectedNumber);


        System.out.println("당첨 번호: " + Arrays.toString(winningNumbers));
        System.out.println("선택한 번호: " + Arrays.toString(selectedNumber));


        int matchedCount = countMatchedNumbers(winningNumbers, selectedNumber);
        
        if (matchedCount > 0) {
          System.out.println("일치하는 번호: " + matchedCount + "개");
      } else {
          System.out.println("일치하는 번호가 없습니다.");
      }
    }

    private static int[] makeLottoNumber() {
        int[] numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = getRandomNumber();
        }
        return numbers;
    }

    private static int getRandomNumber() {
        return (int) (Math.random() * 45) + 1;
    }

    private static int[] getselectedNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1부터 45까지의 숫자 중 6개를 선택하세요.");
        int[] numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            int inputNumber;
            do {
                System.out.print((i + 1) + "번째 번호를 입력해주세요: ");
                inputNumber = scanner.nextInt();
                
                if (inputNumber < 1 || inputNumber > 45) {
                  System.out.println("1부터 45 사이의 숫자를 입력하세요.");
              } else if (contains(numbers, inputNumber)) {
                  System.out.println("이미 선택한 숫자입니다. 다른 번호를 입력해주세요.");
              }

            } while (inputNumber < 1 || inputNumber > 45 || contains(numbers, inputNumber));
            numbers[i] = inputNumber;
        }
        return numbers;
    }

    private static boolean contains(int[] array, int number) {
        for (int value : array) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }

    private static int countMatchedNumbers(int[] winningNumbers, int[] selectedNumber) {
        int count = 0;
        for (int winningNumber : winningNumbers) {
            for (int userNumber : selectedNumber) {
                if (winningNumber == userNumber) {
                    count++;
                }
            }
        }
        return count;
    }
}

