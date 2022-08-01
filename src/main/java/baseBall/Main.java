package baseBall;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static baseBall.IsErrorCheck.numbersSizeCheck;

public class Main {

    public final static int MIN_NUMBER = 0;
    public final static int MAX_NUMBER = 3;

    public static void main(String[] args) {
        List<Integer> computerNumbers = computerNumbers();
        System.out.println(computerNumbers);

    }

    // 컴퓨터의 정수 1~9까지를 만든다.
    private static List<Integer> computerNumbers() {
        List<Integer> computerRandomNumbers = new ArrayList<>();

        while (computerRandomNumbers.size() != MAX_NUMBER) {
            computerRandomNumbers.add(new Random().nextInt(9) + 1);
            computerRandomNumbers = computerRandomNumbers.stream().distinct().collect(Collectors.toList());
        }

        return computerRandomNumbers;
    }

    private static void errorCheck(List<Integer> numbers) {
        numbersSizeCheck(numbers);
    }

}