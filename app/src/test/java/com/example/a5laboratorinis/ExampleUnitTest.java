package com.example.a5laboratorinis;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Given_InvalidString_When_getRateFromECBIsCalled_Then_ReturnErrorMessage() throws IOException {
        final String givenString = "USDA";

        final String expectedResult = "There is no information about this currency";
        final String actualResult = DataManager.getRateFromECB(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Given_SpaceString_When_getRateFromECBIsCalled_Then_ReturnErrorMessage() throws IOException {
        final String givenString = "";

        final String expectedResult = "There is no information about this currency";
        final String actualResult = DataManager.getRateFromECB(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Given_Null_When_getRateFromECBIsCalled_Then_ReturnErrorMessage() throws IOException {
        final String givenString = null;

        final String expectedResult = "There is no information about this currency";
        final String actualResult = DataManager.getRateFromECB(givenString);

        assertEquals(expectedResult, actualResult);
    }
}