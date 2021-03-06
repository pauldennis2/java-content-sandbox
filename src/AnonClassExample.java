import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonClassExample {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(40000, "Sam", 24));
        employeeList.add(new Employee(50000, "Bob", 5));
        employeeList.add(new Employee(80000, "Carol", 35));
        employeeList.add(new Employee(20000, "Alex", 20));

        //Sort by salary
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getSalary() > e2.getSalary()) {
                    return 1;
                } else if (e2.getSalary() > e1.getSalary()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(employeeList);

        //Sort by name
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
        System.out.println(employeeList);
    }
}

class Employee {
    private int salary;
    private String name;
    private int age;

    public Employee(int salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString () {
        return name + ", Salary: " + salary;
    }
}