/*Write a class with FirstName, LastName & age field.
  Print Firstname, LastName & age using static block, static method & static variable respectively.*/

public class FirstProgram {
    static String firstName = "Tushar";
    static String lastName = "Kushwaha";
    static int age = 22;

    public static void method() {
        System.out.println("In static method");
        System.out.println(firstName + ' ' + lastName + ' ' + age);
    }

    public static void main(String[] args) {
        System.out.println("In static main");
        System.out.println(firstName + ' ' + lastName + ' ' + age);
        method();
    }

    static {
        System.out.println("In static block");
        System.out.println(firstName + ' ' + lastName + ' ' + age);
    }

}
