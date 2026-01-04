package test;

import main.RPGCharacter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RPGCharacterTest {
    @Test
    void testInitialStatus() {
        // ここに初期ステータステストを書く
        RPGCharacter rpgCharacter = new RPGCharacter();
        assertEquals(1, rpgCharacter.getLevel(), "初期レベルは1であるべき");
        assertEquals(100, rpgCharacter.getHP(), "初期HPは100であるべき");
        assertEquals(50, rpgCharacter.getMP(), "初期MPは50であるべき");
    }

    @Test
    void testNormalLevelUp() {
        // ここに通常のレベルアップテストを書く
        RPGCharacter rpgCharacter = new RPGCharacter();
        rpgCharacter.levelUp();
        assertEquals(2, rpgCharacter.getLevel(), "レベルアップ後のレベルは2であるべき");
        assertEquals(110, rpgCharacter.getHP(), "レベルアップ後のHPは110であるべき");
        assertEquals(55, rpgCharacter.getMP(), "レベルアップ後のMPは55であるべき");
    }

    @Test
    void testMaxLevel() {
        // ここに境界値のテストを書く
        RPGCharacter rpgCharacter = new RPGCharacter();
        for (int i = 1; i < 99; i++) {
            rpgCharacter.levelUp();
        }
        try {
            rpgCharacter.levelUp();
            fail("最大レベルに達した場合、例外が発生するはず");
        } catch (IllegalStateException e) {
            assertEquals("最大レベルに達しています", e.getMessage());
        }
    }
}
