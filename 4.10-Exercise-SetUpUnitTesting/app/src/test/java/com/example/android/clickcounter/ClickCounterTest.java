package com.example.android.clickcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClickCounterTest {

    private ClickCounter mCounter;

    @Before
    public void setUpCounter() {
        mCounter = new ClickCounter();
    }

    @Test
    public void verifyInitialCount() {
        assertEquals(mCounter.getCount(), 0);
    }

    @Test
    public void verifyIncrement() {
        int previousCount = mCounter.getCount();
        mCounter.increment();
        int postCount = mCounter.getCount();
        assertEquals(previousCount + 1, postCount);
    }
}
