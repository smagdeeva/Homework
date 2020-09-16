package lesson2.Student;

public class Main {
    public static void main(String[] args) {
        Student[] students;
        students = new Student[]{
                new Student("", "", "", 5),
                new Aspirant("", "", "", 81)
        };
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getScholarship());
        }
    }
}