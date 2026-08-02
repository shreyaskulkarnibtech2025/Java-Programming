import java.util.ArrayList;

class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        
        tasks.add("Complete Java Assignment");
        tasks.add("Buy Groceries");
        tasks.add("Prepare Presentation");

        StringBuffer taskDisplay = new StringBuffer();
        taskDisplay.append("--- To-Do List ---\n");

        for (int i = 0; i < tasks.size(); i++) {
            taskDisplay.append((i + 1)).append(". ").append(tasks.get(i)).append("\n");
        }

        System.out.println(taskDisplay);
    }
}