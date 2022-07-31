package chanAfter;

import java.util.*;
import java.util.stream.Collectors;

public class chanAfterBaseball {


    private static final int NUMBER_MIN = 0;
    private static final int NUMBER_THREE_MAX = 3;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> computerNumbers = new ArrayList<>();
        Random random = new Random();

        while (true) {
            computerNumbers.add(String.valueOf(random.nextInt(9) + 1));

            computerNumbers = computerNumbers.stream().distinct().collect(Collectors.toList());
            if (isNumberThree(computerNumbers.size())) break;
        }

        while (true) {
            int s = 0;
            int b = 0;
            System.out.print("숫자를 앱력해 주세요 : ");
            String inputUserNumbers = sc.nextLine();

            boolean isNumber = inputUserNumbers.chars().allMatch(Character::isDigit);

            List<String> userNumbers = isNumbersCheck(inputUserNumbers, isNumber);

            System.out.println(userNumbers);
            System.out.println(computerNumbers);

            for (int i = 0; i < computerNumbers.size(); i++) {

                if (userNumbers.get(i).equals(computerNumbers.get(i))) {
                    s++;
                    continue;
                }

                for (String computerNumber : computerNumbers) {
                    if (computerNumber.equals(userNumbers.get(i))) {
                        b++;
                    }
                }

            }

            if (isNumberThree(s)) break;

            System.out.println(s + "스트라이크 / " + b + "볼");

        }

    }

    private static boolean isNumberThree(int s) {
        if (s == NUMBER_THREE_MAX) {
            return true;
        }
        return false;
    }

    private static List<String> isNumbersCheck(String inputUserNumbers, boolean isNumber) {
        if (!isNumber) {
            throw new IllegalArgumentException("숫자만 입력가능합니다.");
        }

        if (inputUserNumbers.length() != NUMBER_THREE_MAX) {
            throw new IllegalArgumentException("3개의 숫자만 입력가능합니다.");
        }

        List<String> userNumbers = Arrays.asList(inputUserNumbers.split("")).stream()
                .distinct()
                .collect(Collectors.toList());

        if (userNumbers.size() != NUMBER_THREE_MAX) {
            throw new IllegalArgumentException("중복숫자 입력은 불가능합니다.");
        }
        return userNumbers;
    }



}
