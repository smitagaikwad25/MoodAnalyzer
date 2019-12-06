package com.birdgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_Shoud_ReturnSad()
    {
        MoodAnalyzer analyzer = new MoodAnalyzer();
        String mood = analyzer.analyseMood("this Sad is message");
        System.out.println("Mood"+ mood);
        Assert.assertEquals("Sad",mood);
    }
}
