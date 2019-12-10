package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_Should_ReturnSad() throws MoodAnalyserException {
        MoodAnalyser analyzer = new MoodAnalyser("this Sad is message");
        String mood = analyzer.analyseMood();
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMessage_WhenAny_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser analyzer = new MoodAnalyser("I am in any mood");
        String mood = analyzer.analyseMood();
        Assert.assertEquals("Happy",mood);

    }

    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy() throws MoodAnalyserException {
            MoodAnalyser analyzer = new MoodAnalyser("NULL");
            String  mood = analyzer.analyseMood();
            Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenMessage_WhenNull_ShouldReturnMoodAnalyserException() {
        MoodAnalyser analyzer = new MoodAnalyser(null);
        try {
            analyzer.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenMessage_WhenEmpty_ShouldReturnMoodAnalyserException() {
        MoodAnalyser analyser = new MoodAnalyser("");
        try {
            analyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,e.type);
        }


    }
}
