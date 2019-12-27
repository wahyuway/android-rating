package com.wahyuway.android.rating;

import android.net.Uri;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Unit test for {@link com.wahyuway.android.rating.UriHelper}
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class UriHelperTest {
    private static final String GOOGLE_PLAY = "https://play.google.com/store/apps/details?id=";

    @Test
    public void testGetGooglePlayUri() {
        {
            Uri uri = UriHelper.getGooglePlay("");
            assertEquals(uri.toString(), GOOGLE_PLAY);
        }
        {
            Uri uri = UriHelper.getGooglePlay(null);
            assertNull(uri);
        }
        {
            final String packageName = "com.wahyuway.android.rating";
            Uri uri = UriHelper.getGooglePlay(packageName);
            assertEquals(uri.toString(), GOOGLE_PLAY + packageName);
        }
    }
}