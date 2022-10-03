// 11)use record to create an immutable represent of student(name, id, age) and use its 
//  constructor for initialization, equals to compare 2 students methods.
//   Also keep a static counter to keep the count of objects created.
record Student(String name, Integer id, Integer age) {

    static int counter = 0;

    static void incrementCounter() {
        counter++;
    }

    Student {
        incrementCounter();
    }
}

public class Quest11 {
    public static void main(String[] args) {

        Student student1 = new Student("sal", 21, 24);
        Student student2 = new Student("raj", 23, 22);

        System.out.println(student2.equals(student1));

        System.out.println(Student.counter);
    }
}
