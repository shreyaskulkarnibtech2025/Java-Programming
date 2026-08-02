import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        String m1Str = scanner.nextLine();
        System.out.print("Enter Mark 2: ");
        String m2Str = scanner.nextLine();

        Integer mark1 = Integer.valueOf(m1Str);
        Integer mark2 = Integer.valueOf(m2Str);

        int total = mark1 + mark2;

        System.out.println("Total Marks: " + total);
        scanner.close();
    }
}