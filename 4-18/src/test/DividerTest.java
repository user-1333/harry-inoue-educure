package test;

import main.Divider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class DividerTest {
    @Test
    void testNormalDivision() {
        Divider divider = new Divider();
        // 正の数の除算テスト
        assertEquals(3.0, divider.divide(6.0, 2.0), 0.0001, "6 ÷ 2 は 3 になるはず");

        // ここに他のテストケースを追加
        // 負の数の除算テスト
        assertEquals(-2.0, divider.divide(-6.0, 3.0), 0.0001, "-6 ÷ 3 は -2 になるはず");
        // 小数の除算テスト
        assertEquals(2.5, divider.divide(5.0, 2.0), 0.0001, "5 ÷ 2 は 2.5 になるはず");
    }

    @Test
    void testExceptionDivision() {
        Divider divider = new Divider();
        try {
            divider.divide(5.0, 0.0);
            fail("ゼロ除算で例外が発生するはず");
        } catch (IllegalArgumentException e) {
            assertEquals("ゼロで除算はできません", e.getMessage());
        }
    }
}
