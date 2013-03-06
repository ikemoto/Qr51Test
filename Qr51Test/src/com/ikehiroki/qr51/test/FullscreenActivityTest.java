package com.ikehiroki.qr51.test;

import com.ikehiroki.qr51.FullscreenActivity;

import android.test.ActivityInstrumentationTestCase2;

public class FullscreenActivityTest extends ActivityInstrumentationTestCase2<FullscreenActivity> {

	private FullscreenActivity targetActivity;
	
	public FullscreenActivityTest() {
		super(FullscreenActivity.class);
	}

	@Override
    protected void setUp() throws Exception {
        super.setUp();
        targetActivity = getActivity();
    }
	
	public void testGetTest() {
        assertEquals(targetActivity.getTest(), "test");
    }

}
