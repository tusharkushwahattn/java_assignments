public class SecondQuest {

    static void display() {
        int a = 5;
        int b = 10;
        int mul = a * b;
        System.out.println("Static method returns multiplication:" + mul);
    }

    void display2() {
        int a = 30;
        int b = 20;
        int sum = a + b;
        int sub = a - b;
        System.out.println("Instance add method returns sum:" + sum + "and returns substraction:" + sub);

    }

    public static void main(String[] args) {
        MethodReferenceInterface methodreferenceinterface = SecondQuest::display;
        methodreferenceinterface.print();

        SecondQuest methodreference = new SecondQuest();
        MethodReferenceInterface methodreferenceinterface1 = methodreference::display2;
        methodreferenceinterface1.print();
    }
}

interface MethodReferenceInterface {
    void print();
}
