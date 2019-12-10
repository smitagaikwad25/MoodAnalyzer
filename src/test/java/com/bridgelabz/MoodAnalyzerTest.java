package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_Shoud_ReturnSad()
    {
        MoodAnalyzer analyzer = new MoodAnalyzer();
        String mood = analyzer.analyseMood("this Sad is message");
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMessage_WhenAny_ShoudReturnHappy()
    {
        MoodAnalyzer analyzer = new MoodAnalyzer();
        String mood = analyzer.analyseMood("I am in any mood");
        Assert.assertEquals("Happy",mood);

    }
}
