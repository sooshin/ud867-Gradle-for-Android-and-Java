package com.example.android.clickcounter;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ClickCounterAndroidTest {

    @Rule
    public ActivityTestRule<ClickActivity> mActivityTestRule
            = new ActivityTestRule<>(ClickActivity.class);

    @Test
    public void clickButton_IncrementsValue() {
        // Check the initial value is zero
        onView(withId(R.id.click_count_text_view)).check(matches(withText("0")));

        // Click on the button
        onView(withId(R.id.click_button)).perform(click());

        // Verify that the button increments the value displayed
        onView(withId(R.id.click_count_text_view)).check(matches(withText("1")));
    }
}
