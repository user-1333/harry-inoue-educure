package test;

import main.Divider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
        assertEquals(5.0,divider.divide(-10.0,-2.0),0.0001,"-10 ÷ -2 は 5 になるはず");
    }

    @Test
    void testExceptionDivision() {
        Divider divider = new Divider();
        assertThrows(IllegalArgumentException.class, () -> {
            divider.divide(5.0, 0.0);
        }, "ゼロで除算はできません");
        assertThrows(IllegalArgumentException.class, () -> {
            divider.divide(-3.0, 0.0);
        }, "ゼロで除算はできません");
        assertThrows(IllegalArgumentException.class, () -> {
            divider.divide(0.0, 0.0);
        }, "ゼロで除算はできません");
    }
}
