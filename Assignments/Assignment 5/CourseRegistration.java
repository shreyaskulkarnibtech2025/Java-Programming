import java.util.ArrayList;
import java.util.Scanner;

class CourseRegistration {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Course Registration Menu ---");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. View Courses");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter course name to add: ");
                    String courseToAdd = scanner.nextLine();
                    courses.add(courseToAdd);
                    System.out.println("Course added successfully.");
                    break;

                case 2:
                    System.out.print("Enter course name to remove: ");
                    String courseToRemove = scanner.nextLine();
                    if (courses.remove(courseToRemove)) {
                        System.out.println("Course removed successfully.");
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;

                case 3:
                    StringBuffer sb = new StringBuffer();
                    sb.append("\n--- Registered Courses ---\n");
                    if (courses.isEmpty()) {
                        sb.append("No courses registered.\n");
                    } else {
                        for (int i = 0; i < courses.size(); i++) {
                            sb.append((i + 1)).append(". ").append(courses.get(i)).append("\n");
                        }
                    }
                    System.out.println(sb);
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
        scanner.close();
    }
}