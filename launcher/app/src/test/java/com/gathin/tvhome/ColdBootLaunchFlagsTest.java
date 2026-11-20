package com.gathin.tvhome;

import static org.junit.Assert.assertEquals;

import android.content.Intent;

import org.junit.Test;

public class ColdBootLaunchFlagsTest {

    @Test
    public void regularLaunchHasResetTaskIfNeeded() {
        int expected = Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED;
        assertEquals(expected, AppAdapter.launchFlags(false));
    }

    @Test
    public void coldBootLaunchHasClearTask() {
        int expected = Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK;
        assertEquals(expected, AppAdapter.launchFlags(true));
    }
}
