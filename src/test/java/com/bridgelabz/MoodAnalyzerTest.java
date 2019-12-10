package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSad_Should_ReturnSad(){
        MoodAnalyzer analyzer = new MoodAnalyzer("this Sad is message");
        String mood = analyzer.analyseMood();
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMessage_WhenAny_ShouldReturnHappy(){
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in any mood");
        String mood = analyzer.analyseMood();
        Assert.assertEquals("Happy",mood);

    }

    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy(){
            MoodAnalyzer analyzer = new MoodAnalyzer("Null");
            String  mood = analyzer.analyseMood();
            Assert.assertEquals("Happy",mood);
    }
}
