package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSad_Should_ReturnSad() throws MoodAnalyzerException {
        MoodAnalyzer analyzer = new MoodAnalyzer("this Sad is message");
        String mood = analyzer.analyseMood();
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMessage_WhenAny_ShouldReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in any mood");
        String mood = analyzer.analyseMood();
        Assert.assertEquals("Happy",mood);

    }

    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy() throws MoodAnalyzerException {
            MoodAnalyzer analyzer = new MoodAnalyzer("NULL");
            String  mood = analyzer.analyseMood();
            Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenMessage_WhenNull_ShouldReturnMoodAnalyserException() {
        MoodAnalyzer analyzer = new MoodAnalyzer(null);
        try {
            analyzer.analyseMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL,e.type);
        }


    }
}
