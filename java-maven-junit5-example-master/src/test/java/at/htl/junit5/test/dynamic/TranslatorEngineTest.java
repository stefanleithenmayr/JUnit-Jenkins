package at.htl.junit5.test.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TranslatorEngineTest {

    private TranslatorEngine translatorEngine;
    @BeforeEach
    @DisplayName("Before run test case to init resource -> TranslatorEngine")
    void init() {
        translatorEngine = new TranslatorEngine();
    }

    @Test
    public void testTranlsateHello() {
        assertEquals("你好", translatorEngine.tranlate("Hello"));
    }

    @Test
    public void testTranlsateYes() {
        assertEquals("是", translatorEngine.tranlate("Yes"));
    }

    @Test
    public void testTranlsateNo() {
        assertEquals("否", translatorEngine.tranlate("No"));
    }

    //... other test case
}