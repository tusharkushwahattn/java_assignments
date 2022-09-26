public class FirstProgram {
    static String firstName = "Tushar";
    static String lastName = "Kushwaha";
    static int age = 22;

    public static void method() {
        System.out.println("In static method");
        System.out.println("Tushar Kushwaha 22");
    }

    public static void main(String[] args) {
        System.out.println("In static main");
        System.out.println(firstName + ' ' + lastName + ' ' + age);
        method();
    }

    static {
        System.out.println("In static block");
        System.out.println("Tushar Kushwaha 22");
    }

}
