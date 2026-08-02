class Student{
    // variables
    String name;
    int score;

    // constructor
    public Student(String name, int score){
        this.name=name;
        this.score=score;
    }

    // method
    public void printResult(){
        if(score>=40) System.out.println(name + ": Passed");
        else System.out.println(name + ": Failed");
    }
}

public class Students{
    public static void main(String args[])
    {
        Student s1 = new Student("Walter", 99);
        Student s2 = new Student("Tuco", 33);
        s1.printResult();
        s2.printResult();
    }
}
