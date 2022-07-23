package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split1() {
        String num = "1,2";
        String[] numList = num.split(",");
        System.out.println("---");
        assertThat(numList[0]).contains("1");
    }

    @Test
    void split2() {
        String str = "(1,2)";
        String aaa = str.substring(1, 4);
        System.out.println(aaa);
        assertThat(aaa).contains("1,2");
    }

    @Test
    @DisplayName("abc위치값 넘지않기")
    void split3() {
        String abc = "abc";
        try {
            abc.charAt(5);
        } catch (StringIndexOutOfBoundsException e) {
            e.getMessage();
        }
    }

}


