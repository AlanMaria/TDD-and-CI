package com.ontrack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaskStatusCheckerTest {

    @Test
    public void testSubmittedTaskStatus() {

        TaskStatusChecker checker =
                new TaskStatusChecker();

        assertEquals(
                "Submitted",
                checker.getTaskStatus("SIT707-1.1P")
        );
    }

    @Test
    public void testReviewedTaskStatus() {

        TaskStatusChecker checker =
                new TaskStatusChecker();

        assertEquals(
                "Reviewed",
                checker.getTaskStatus("SIT707-2.1P")
        );
    }

    @Test
    public void testResubmissionRequiredTaskStatus() {

        TaskStatusChecker checker =
                new TaskStatusChecker();

        assertEquals(
                "Resubmission Required",
                checker.getTaskStatus("SIT707-3.1P")
        );
    }

    @Test
    public void testNotSubmittedTaskStatus() {

        TaskStatusChecker checker =
                new TaskStatusChecker();

        assertEquals(
                "Not Submitted",
                checker.getTaskStatus("SIT707-4.1P")
        );
    }

    @Test
    public void testCompletedTaskStatus() {

        TaskStatusChecker checker =
                new TaskStatusChecker();

        assertEquals(
                "Complete",
                checker.getTaskStatus("SIT707-5.1P")
        );
    }

    @Test
    public void testInvalidTaskId() {

        TaskStatusChecker checker =
                new TaskStatusChecker();

        assertEquals(
                "Task Not Found",
                checker.getTaskStatus("INVALID")
        );
    }

    @Test
    public void testEmptyTaskId() {

        TaskStatusChecker checker =
                new TaskStatusChecker();

        assertEquals(
                "Task Not Found",
                checker.getTaskStatus("")
        );
    }

    @Test
    public void testNullTaskId() {

        TaskStatusChecker checker =
                new TaskStatusChecker();

        assertEquals(
                "Task Not Found",
                checker.getTaskStatus(null)
        );
    }

    @Test
    public void testLowercaseTaskId() {

        TaskStatusChecker checker =
                new TaskStatusChecker();

        assertEquals(
                "Task Not Found",
                checker.getTaskStatus("sit707-1.1p")
        );
    }

    @Test
    public void testTaskIdWithSpaces() {

        TaskStatusChecker checker =
                new TaskStatusChecker();

        assertEquals(
                "Submitted",
                checker.getTaskStatus(" SIT707-1.1P ")
        );
    }
}