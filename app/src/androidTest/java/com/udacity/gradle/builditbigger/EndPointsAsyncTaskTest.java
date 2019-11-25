package com.udacity.gradle.builditbigger;


import androidx.test.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.udacity.gradle.builditbigger.paid.EndPointsAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.TestCase.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndPointsAsyncTaskTest {
    @Test
    public void testString() throws ExecutionException, InterruptedException {
        EndPointsAsyncTask task = new EndPointsAsyncTask();
        task.execute(InstrumentationRegistry.getTargetContext());
        String joke = task.get();
        assertNotNull(joke);
    }
}
