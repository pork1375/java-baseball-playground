import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean isNumber = s.chars().allMatch(Character::isDigit);
        if (!isNumber) {
            throw new IllegalArgumentException("숫자만 입력가능합니다.");
        }

        if (s.length() != 3) {
            throw new IllegalArgumentException("3개의 숫자만 입력가능합니다.");
        }


    }
}
