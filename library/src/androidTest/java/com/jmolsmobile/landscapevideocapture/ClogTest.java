package com.jmolsmobile.landscapevideocapture;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Jeroen Mols on 12/12/15.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class ClogTest {

    @Test
    public void instantiateClassForCodeCoverage() throws Exception {
        new CLog();
    }
}
