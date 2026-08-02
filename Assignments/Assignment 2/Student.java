class Student {
    String name;
    int rollNo;

    Student() {
        this.name = "Unknown";
        this.rollNo = 0;
    }

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice", 101);

        s1.display();
        s2.display();
    }
}