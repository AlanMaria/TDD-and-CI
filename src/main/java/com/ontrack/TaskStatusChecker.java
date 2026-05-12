package com.ontrack;

import java.util.HashMap;
import java.util.Map;

public class TaskStatusChecker {

    private Map<String, String> taskStatusMap;

    public TaskStatusChecker() {

        taskStatusMap = new HashMap<>();

        taskStatusMap.put("SIT707-1.1P", "Submitted");
        taskStatusMap.put("SIT707-2.1P", "Reviewed");
        taskStatusMap.put("SIT707-3.1P", "Resubmission Required");
        taskStatusMap.put("SIT707-4.1P", "Not Submitted");
        taskStatusMap.put("SIT707-5.1P", "Complete");
    }

    public String getTaskStatus(String taskId) {

        if (taskId == null) {
            return "Task Not Found";
        }

        String cleanedTaskId = taskId.trim();

        return taskStatusMap.getOrDefault(
                cleanedTaskId,
                "Task Not Found"
        );
    }
}