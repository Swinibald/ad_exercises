package ch.hslu.ad.Week_11;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DEATest {

    @Test
    void testisWordLanguageTrue1(){
        DEA dea = new DEA();
        String word = "0";
        assertTrue(dea.isWordLanguage(word));
    }
    @Test
    void testisWordLanguageTrue2(){
        DEA dea = new DEA();
        String word = "010";
        assertTrue(dea.isWordLanguage(word));
    }
    @Test
     void testisWordLanguageTrue3(){
        DEA dea = new DEA();
        String word = "0101010";
        assertTrue(dea.isWordLanguage(word));
    }
    
    @Test
    void testisWordLanguageTrue4(){
        DEA dea = new DEA();
        String word = "0111010";
        assertTrue(dea.isWordLanguage(word));
    }

    @Test
    void testisWordLanguageFalse1(){
        DEA dea = new DEA();
        String word = "123";
        assertFalse(dea.isWordLanguage(word));
    }

    @Test
    void testisWordLanguageFalse2(){
        DEA dea = new DEA();
        String word = "01110100";
        assertFalse(dea.isWordLanguage(word));
    }


}
