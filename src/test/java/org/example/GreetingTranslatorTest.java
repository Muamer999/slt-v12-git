package org.example;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTranslatorTest {
    @Test
    void when_localeGerman_then_GreetingHallo(){
        //Arrange
        GreetingTranslator greetingTranslator = new GreetingTranslator();

        Locale locale = Locale.GERMAN;

        //Act
        String greeting = greetingTranslator.getGreeting(locale);

        //Assert
        assertEquals("Hallo", greeting);
    }
    @Test
    void when_localeEnglish_then_GreetingHallo(){
        //Arrange
        GreetingTranslator greetingTranslator = new GreetingTranslator();

        Locale locale = Locale.ENGLISH;

        //Act
        String greeting = greetingTranslator.getGreeting(locale);

        //Assert
        assertEquals("Hello", greeting);
    }
    @Test
    void when_localeFrance_then_GreetingHallo(){
        //Arrange
        GreetingTranslator greetingTranslator = new GreetingTranslator();

        Locale locale = Locale.FRANCE;

        //Act
        String greeting = greetingTranslator.getGreeting(locale);

        //Assert
        assertEquals("Bonjour", greeting);
    }

    @Test
    void when_localeNotSupported_then_IllegalArgumentException(){
        GreetingTranslator greetingTranslator = new GreetingTranslator();

        assertThrows(IllegalArgumentException.class, () -> greetingTranslator.getGreeting(Locale.ITALY));
    }

}