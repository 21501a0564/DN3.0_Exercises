package com.example.taskmanagement;

public class TaskManagementTest {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task("T001", "Design Homepage", "In Progress");
        Task task2 = new Task("T002", "Implement Login", "Not Started");
        Task task3 = new Task("T003", "Write Documentation", "Completed");

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        System.out.println("Task List:");
        manager.traverseTasks();

        System.out.println("\nSearching for task T002:");
        Task found = manager.searchTask("T002");
        System.out.println(found != null ? found : "Task not found.");

        System.out.println("\nDeleting task T001:");
        manager.deleteTask("T001");
        manager.traverseTasks();
    }
}
