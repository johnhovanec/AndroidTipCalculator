package com.example.jah.tipcalculator;


import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.PerformException;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityCalculationTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("100.00"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.editText), withText("100.00"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText3.perform(pressImeActionButton());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(replaceText("2"), closeSoftKeyboard());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.splitNumber), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText5.perform(pressImeActionButton());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.tenPercent), withText("10%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(R.id.totalView), withText("$55.0 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView.check(matches(withText("$55.0 each.")));

    }

    @Test
    public void baseCaseTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("21.50"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

        ViewInteraction textView = onView(
                allOf(withId(R.id.textView), withText("$3.23"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView.check(matches(withText("$3.23")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.tipAndTotalView), withText("$24.73"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        textView2.check(matches(withText("$24.73")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.totalView), withText("$24.73 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView3.check(matches(withText("$24.73 each.")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.totalView), withText("$24.73 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView5.check(matches(withText("$24.73 each.")));

    }

    @Test(expected = NoMatchingViewException.class)
    public void p1_IsNotPositiveTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("-21.50"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

        ViewInteraction textView = onView(
                allOf(withId(R.id.textView), withText("$3.23"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView.check(matches(withText("$3.23")));

    }

    @Test
    public void p1_NumOfRepeatedChars_1_Test() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("22.50"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

        ViewInteraction textView = onView(
                allOf(withId(R.id.textView), withText("$3.38"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView.check(matches(withText("$3.38")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.tipAndTotalView), withText("$25.88"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        textView2.check(matches(withText("$25.88")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.totalView), withText("$25.88 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView3.check(matches(withText("$25.88 each.")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.totalView), withText("$25.88 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView5.check(matches(withText("$25.88 each.")));

    }

    @Test
    public void p1_NumOfRepeatedChars_2_Test() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("12.11"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

        ViewInteraction textView = onView(
                allOf(withId(R.id.textView), withText("$1.82"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView.check(matches(withText("$1.82")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.tipAndTotalView), withText("$13.93"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        textView2.check(matches(withText("$13.93")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.totalView), withText("$13.93 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView3.check(matches(withText("$13.93 each.")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.totalView), withText("$13.93 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView5.check(matches(withText("$13.93 each.")));

    }

    @Test
    public void p1_NumOfRepeatedChars_3_Test() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("121.11"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

        ViewInteraction textView = onView(
                allOf(withId(R.id.textView), withText("$18.17"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView.check(matches(withText("$18.17")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.tipAndTotalView), withText("$139.28"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        textView2.check(matches(withText("$139.28")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.totalView), withText("$139.28 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView3.check(matches(withText("$139.28 each.")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.totalView), withText("$139.28 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView5.check(matches(withText("$139.28 each.")));

    }

    @Test(expected = PerformException.class)
    public void p1_IsEmptyTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText(""), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

    }

    @Test(expected = PerformException.class)
    public void p1_NumberOfChars_0_Test() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText(""), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

//        ViewInteraction textView = onView(
//                allOf(withId(R.id.textView), withText("$18.17"),
//                        childAtPosition(
//                                childAtPosition(
//                                        withId(android.R.id.content),
//                                        0),
//                                7),
//                        isDisplayed()));
//        textView.check(matches(withText("$18.17")));
//
//        ViewInteraction textView2 = onView(
//                allOf(withId(R.id.tipAndTotalView), withText("$139.28"),
//                        childAtPosition(
//                                childAtPosition(
//                                        withId(android.R.id.content),
//                                        0),
//                                9),
//                        isDisplayed()));
//        textView2.check(matches(withText("$139.28")));
//
//        ViewInteraction textView3 = onView(
//                allOf(withId(R.id.totalView), withText("$139.28 each."),
//                        childAtPosition(
//                                childAtPosition(
//                                        withId(android.R.id.content),
//                                        0),
//                                11),
//                        isDisplayed()));
//        textView3.check(matches(withText("$139.28 each.")));
//
//        ViewInteraction textView5 = onView(
//                allOf(withId(R.id.totalView), withText("$139.28 each."),
//                        childAtPosition(
//                                childAtPosition(
//                                        withId(android.R.id.content),
//                                        0),
//                                11),
//                        isDisplayed()));
//        textView5.check(matches(withText("$139.28 each.")));

    }

    @Test
    public void p1_NumberOfChars_1_Test() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

        ViewInteraction textView = onView(
                allOf(withId(R.id.textView), withText("$0.15"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView.check(matches(withText("$0.15")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.tipAndTotalView), withText("$1.15"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        textView2.check(matches(withText("$1.15")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.totalView), withText("$1.15 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView3.check(matches(withText("$1.15 each.")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.totalView), withText("$1.15 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView5.check(matches(withText("$1.15 each.")));

    }

    @Test
    public void p1_NumberOfChars_2_Test() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("12"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

        ViewInteraction textView = onView(
                allOf(withId(R.id.textView), withText("$1.80"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView.check(matches(withText("$1.80")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.tipAndTotalView), withText("$13.80"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        textView2.check(matches(withText("$13.80")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.totalView), withText("$13.80 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView3.check(matches(withText("$13.80 each.")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.totalView), withText("$13.80 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView5.check(matches(withText("$13.80 each.")));

    }

    @Test
    public void p1_NumberOfChars_3_Test() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("123"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

        ViewInteraction textView = onView(
                allOf(withId(R.id.textView), withText("$18.45"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView.check(matches(withText("$18.45")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.tipAndTotalView), withText("$141.45"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        textView2.check(matches(withText("$141.45")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.totalView), withText("$141.45 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView3.check(matches(withText("$141.45 each.")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.totalView), withText("$141.45 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView5.check(matches(withText("$141.45 each.")));

    }

    @Test
    public void p1_NumberOfChars_4_Test() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("120.34"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

        ViewInteraction textView = onView(
                allOf(withId(R.id.textView), withText("$18.05"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView.check(matches(withText("$18.05")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.tipAndTotalView), withText("$138.39"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        textView2.check(matches(withText("$138.39")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.totalView), withText("$138.39 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView3.check(matches(withText("$138.39 each.")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.totalView), withText("$138.39 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView5.check(matches(withText("$138.39 each.")));

    }

    @Test
    public void p1_IsNotFloatTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("1234"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

        ViewInteraction textView = onView(
                allOf(withId(R.id.textView), withText("$185.10"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView.check(matches(withText("$185.10")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.tipAndTotalView), withText("$1419.10"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        textView2.check(matches(withText("$1419.10")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.totalView), withText("$1419.10 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView3.check(matches(withText("$1419.10 each.")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.totalView), withText("$1419.10 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView5.check(matches(withText("$1419.10 each.")));

    }

    @Test(expected = PerformException.class)
    public void p1_IsNotNumberTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("abcd"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

//        ViewInteraction textView = onView(
//                allOf(withId(R.id.textView), withText("$185.10"),
//                        childAtPosition(
//                                childAtPosition(
//                                        withId(android.R.id.content),
//                                        0),
//                                7),
//                        isDisplayed()));
//        textView.check(matches(withText("$185.10")));
//
//        ViewInteraction textView2 = onView(
//                allOf(withId(R.id.tipAndTotalView), withText("$1419.10"),
//                        childAtPosition(
//                                childAtPosition(
//                                        withId(android.R.id.content),
//                                        0),
//                                9),
//                        isDisplayed()));
//        textView2.check(matches(withText("$1419.10")));
//
//        ViewInteraction textView3 = onView(
//                allOf(withId(R.id.totalView), withText("$1419.10 each."),
//                        childAtPosition(
//                                childAtPosition(
//                                        withId(android.R.id.content),
//                                        0),
//                                11),
//                        isDisplayed()));
//        textView3.check(matches(withText("$1419.10 each.")));
//
//        ViewInteraction textView5 = onView(
//                allOf(withId(R.id.totalView), withText("$1419.10 each."),
//                        childAtPosition(
//                                childAtPosition(
//                                        withId(android.R.id.content),
//                                        0),
//                                11),
//                        isDisplayed()));
//        textView5.check(matches(withText("$1419.10 each.")));

    }

    @Test(expected = NoMatchingViewException.class)
    public void p2_IsNotPositiveTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("21.50"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("-1"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

    }

    @Test
    public void p2_NumOfRepeatedChars_1_Test() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("94.50"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.splitNumber),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("11"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.fifteenPercent), withText("15%"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.splitNumber), withText("11"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

        ViewInteraction textView = onView(
                allOf(withId(R.id.textView), withText("$14.18"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView.check(matches(withText("$14.18")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.tipAndTotalView), withText("$108.68"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        textView2.check(matches(withText("$108.68")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.totalView), withText("$9.88 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView3.check(matches(withText("$9.88 each.")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.totalView), withText("$9.88 each."),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        textView5.check(matches(withText("$9.88 each.")));

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }


}
