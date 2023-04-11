package com.example.library;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;

@RunWith(RobolectricTestRunner.class)
public class AnotherTest {

    @Test
    public void clickingLogin_shouldStartLoginActivity() {
    //    try (ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class)) {
//            controller.setup(); // Moves Activity to RESUMED state
//            MainActivity activity = controller.get();
//
//            activity.findViewById(R.id.login).performClick();
////            Intent expectedIntent = new Intent(activity, LoginActivity.class);
////            Intent actual = shadowOf(RuntimeEnvironment.application).getNextStartedActivity();
////            assertEquals(expectedIntent.getComponent(), actual.getComponent());
    //    }
    }
}
