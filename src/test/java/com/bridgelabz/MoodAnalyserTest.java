package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_Should_ReturnSad() throws MoodAnalyserException {
        MoodAnalyser analyzer = new MoodAnalyser("this Sad is message");
        String mood = analyzer.analyseMood();
        Assert.assertEquals("Sad", mood);
    }

    @Test
    public void givenMessage_WhenAny_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser analyzer = new MoodAnalyser("I am in any mood");
        String mood = analyzer.analyseMood();
        Assert.assertEquals("Happy", mood);

    }

    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser analyzer = new MoodAnalyser("NULL");
        String mood = analyzer.analyseMood();
        Assert.assertEquals("Happy", mood);
    }

    @Test
    public void givenMessage_WhenNull_ShouldReturnMoodAnalyserException() {
        MoodAnalyser analyzer = new MoodAnalyser(null);
        try {
            analyzer.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenMessage_WhenEmpty_ShouldReturnMoodAnalyserException() {
        MoodAnalyser analyser = new MoodAnalyser("");
        try {
            analyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void givenMoodAnalyserClass_WhenProper_ShouldReturnObject() throws MoodAnalyserException {
        Constructor<?> constructor = null;
        MoodAnalyser moodAnalyser = MoodAnalyserReflector.createMoodAnalyser(constructor);
        Assert.assertEquals(new MoodAnalyser("I am in happy mood"), moodAnalyser);
    }

    @Test
    public void givenMoodAnalyserClass_WhenNotProper_ReturnMoodAnalyserException() {
        try {
            Constructor<?> constructor = null;
            MoodAnalyser moodAnalyser = MoodAnalyserReflector.createMoodAnalyser(constructor);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NO_SUCH_CLASS, e.type);
        }
    }

    @Test
    public void givenMoodAnalyserConstructor_WhenNotProper_ReturnMoodAnalyserException() {
        try {
            Constructor<?> constructor = null;
            MoodAnalyser moodAnalyser = MoodAnalyserReflector.createMoodAnalyser(constructor);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NO_SUCH_METHOD, e.type);
        }

    }

    @Test
    public void givenMoodAnalyserClassParam_whenProper_ShouldReturnObject() throws MoodAnalyserException {
        Constructor<?> constructor = null;
        MoodAnalyser moodAnalyser = MoodAnalyserReflector.createMoodAnalyser(constructor);
        Assert.assertEquals(new MoodAnalyser("I am in happy mood"), moodAnalyser);
    }

    @Test
    public void givenMoodAnalyserClassParam_whenImproper_ReturnMoodAnalyserException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            MoodAnalyserReflector.createMoodAnalyser("I am in happy mood");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NO_SUCH_CLASS, e.type);
        }
    }

    @Test
    public void givenMoodAnalyserClassParam_improperConstructor_ReturnMoodAnalyserException() {

        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            MoodAnalyserReflector.createMoodAnalyser("I am in happy mood");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NO_SUCH_METHOD, e.type);
        }
    }

    @Test
    public void givenMessageUsingReflection_whenProper_ReturnHappy() {
        try {
            MoodAnalyser ReflectObject = MoodAnalyserReflector.createMoodAnalyser("I am in very Happy Mood");
            Object mood = MoodAnalyserReflector.invokeMethod(ReflectObject, "analyseMood");
            Assert.assertEquals("Happy", mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenHappyMessage_ImproperMethodName_ReturnMoodAnalyseException() {
        try {
            MoodAnalyser ReflectObject = MoodAnalyserReflector.createMoodAnalyser("I am in Happy Mood");
            Object mood = MoodAnalyserReflector.invokeMethod(ReflectObject, "analyseMood123");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NO_SUCH_METHOD, e.type);
        }
    }

    @Test
    public void givenHappyMessage_withReflector_ShouldReturnHappy() {
        try {
            Constructor<?> constructor = MoodAnalyserReflector.getConstructor();
            MoodAnalyser mood = MoodAnalyserReflector.createMoodAnalyser(constructor);
            MoodAnalyserReflector.setField(mood,"message","I am in Happy Mood");
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenField_whenImproper_ShouldThrowException() {
        try {
            Constructor<?> constructor = MoodAnalyserReflector.getConstructor();
            MoodAnalyser mood = MoodAnalyserReflector.createMoodAnalyser(constructor);
            MoodAnalyserReflector.setField(mood,"improperMessage","I am in Happy mood");
        } catch (MoodAnalyserException e) {
           Assert.assertEquals(MoodAnalyserException.ExceptionType.NO_SUCH_FIELD,e.type);
        }
    }

    @Test
    public void givenNullMessage_withReflector_ShouldThrowException() {
        try {
            Constructor<?> constructor = MoodAnalyserReflector.getConstructor();
            MoodAnalyser mood = MoodAnalyserReflector.createMoodAnalyser(constructor);
            MoodAnalyserReflector.setField(mood,"message",null);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }

    }
}
