package com.example.a5laboratorinis;

import androidx.test.filters.MediumTest;
import androidx.test.rule.ActivityTestRule;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onData;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.anything;
/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@MediumTest
public class InstrumentedTest
{
    @Rule
    public ActivityTestRule<MainActivity> activityScenarioRule
            = new ActivityTestRule<>(MainActivity.class);
    @Test
    public void test_When_StringIsCorrect_then_showComplete() {
        final String givenString = "USD";
        final String expectedResult = "Complete";

        onView(withId(R.id.inputCurrency)).perform(click(), replaceText(givenString), closeSoftKeyboard());
        onView(withId(R.id.btnDownload)).perform(click());
        onView(withId(R.id.tvContent)).check(matches(withText(expectedResult)));

    }
    @Test
    public void test_When_StringIsNull_then_showComplete() {
        final String givenString = null;
        final String expectedResult = "Complete";

        onView(withId(R.id.inputCurrency)).perform(click(), replaceText(givenString), closeSoftKeyboard());
        onView(withId(R.id.btnDownload)).perform(click());
        onView(withId(R.id.tvContent)).check(matches(withText(expectedResult)));

    }
}