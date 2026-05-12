package com.ontrack;

public class TaskStatusChecker {

    public String getTaskStatus(String taskId) {

        if (taskId == null) {
            return "Task Not Found";
        }

        String cleanedTaskId = taskId.trim();

        if (cleanedTaskId.equals("SIT707-1.1P")) {
            return "Submitted";
        }

        if (cleanedTaskId.equals("SIT707-2.1P")) {
            return "Reviewed";
        }

        return "Task Not Found";
    }
}