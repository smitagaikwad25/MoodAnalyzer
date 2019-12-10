package com.bridgelabz;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

//
//    @Test
//    public void givenMessage_WhenSad_Should_ReturnSad() throws MoodAnalyserException {
//        MoodAnalyser analyzer = new MoodAnalyser("this Sad is message");
//        String mood = analyzer.analyseMood();
//        Assert.assertEquals("Sad", mood);
//    }
//
//    @Test
//    public void givenMessage_WhenAny_ShouldReturnHappy() throws MoodAnalyserException {
//        MoodAnalyser analyzer = new MoodAnalyser("I am in any mood");
//        String mood = analyzer.analyseMood();
//        Assert.assertEquals("Happy", mood);
//
//    }
//
//    @Test
//    public void givenMessage_WhenNull_ShouldReturnHappy() throws MoodAnalyserException {
//        MoodAnalyser analyzer = new MoodAnalyser("NULL");
//        String mood = analyzer.analyseMood();
//        Assert.assertEquals("Happy", mood);
//    }
//
//    @Test
//    public void givenMessage_WhenNull_ShouldReturnMoodAnalyserException() {
//        MoodAnalyser analyzer = new MoodAnalyser(null);
//        try {
//            analyzer.analyseMood();
//        } catch (MoodAnalyserException e) {
//            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
//        }
//    }
//
//    @Test
//    public void givenMessage_WhenEmpty_ShouldReturnMoodAnalyserException() {
//        MoodAnalyser analyser = new MoodAnalyser("");
//        try {
//            analyser.analyseMood();
//        } catch (MoodAnalyserException e) {
//            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
//        }
//    }
//
//    @Test
//    public void givenMoodAnalyserClass_whenProper_ShouldReturnObject() throws MoodAnalyserException {
//        MoodAnalyser moodAnalyser = MoodAnalyserFactory.createMoodAnalyser();
//        Assert.assertEquals(new MoodAnalyser("I am in happy mood"), moodAnalyser);
//    }

    @Test
    public void givenMoodAnalyserClass_whenNotProper_ReturnMoodAnalyserException() {
        try {
            MoodAnalyser moodAnalyser = MoodAnalyserFactory.createMoodAnalyser();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NO_SUCH_CLASS,e.type);
        }

    }

    @Test
    public void givenMoodAnalyserConstructor_WhenNotProper_ReturnMoodAnalyserException() {
        try {
            MoodAnalyser moodAnalyser = MoodAnalyserFactory.createMoodAnalyser();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NO_SUCH_METHOD,e.type);
        }

    }
}
