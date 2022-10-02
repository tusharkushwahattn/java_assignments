
/*Create class Employee with attributes name,age,designation and use
 instances of these class as keys in a Map and their salary as value */
import java.util.*;

class Employee {
    int age;
    String name;
    String designation;

    Employee(int age, String name, String designation) {
        this.age = age;
        this.name = name;
        this.designation = designation;
    }

    public String toString() {
        return "(age is->" + age + "," + "name is->" + name + "," + "desination is->" + designation + ")";
    }

}

public class FouthProgram {

    public static void main(String args[]) {
        Employee e1 = new Employee(20, "A", "trainee");
        Employee e2 = new Employee(28, "B", "manager");
        Employee e3 = new Employee(27, "C", "director");
        Employee e4 = new Employee(38, "D", "CEO");

        Map<Employee, Integer> map = new LinkedHashMap<>();

        map.put(e1, 15000);
        map.put(e2, 2000);
        map.put(e3, 3882);
        map.put(e4, 1855232);
        for (Employee key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
