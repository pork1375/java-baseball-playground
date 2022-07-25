package study;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split 했을 때 1과 2로 잘 분리되는지 확인")
    void split1() {
        // "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
        String num = "1,2";
        String[] numList = num.split(",");
        List<String> collect = Arrays.stream(numList).collect(Collectors.toList());
        System.out.println(collect);
        assertThat(numList).contains("1");
        assertThat(numList).contains("2");

        // "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
        String num2 = "1";
        String[] numList2 = num2.split(",");
        assertThat(numList2).containsExactly("1");
    }

    @Test
    void split2() {
        String str = "(1,2)";
        System.out.println(str);
        String aaa = str.substring(1, str.length() - 1);
        System.out.println(aaa);
        assertThat(aaa).contains("1,2");
    }

    @Test
    @DisplayName("abc위치값 넘지않기")
    void split3() {
        System.out.println("--abc--");
        String a = "abc";
        assertThatThrownBy(() -> a.charAt(5))   // 에러만들기
                .isInstanceOf(StringIndexOutOfBoundsException.class)    // 해당 에러가 떳을때 패스
                .hasMessageContaining("out of range: 5");   // 에러의 메세지와 같은지 체크
    };






}


