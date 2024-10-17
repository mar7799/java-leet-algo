package functionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class demoStreams{

    public static class Employee {
        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Integer getSalary() {
            return salary;
        }

        public void setSalary(Integer salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Employee(String name, String address, int salary) {
            this.name =name;
            this.address = address;
            this.salary = salary;
        }
        String name;
        String address;
        Integer salary;
    }

    public static void main(String[] args) {

        CopyOnWriteArrayList list1 = new CopyOnWriteArrayList();
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
//        list.stream().forEach(e -> System.out.println(e.toUpperCase()));
        List<Integer> sal = Arrays.asList(100,1000,900,700,600,750);
        sal.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().ifPresent(System.out::println);

        List<Employee> employees = Arrays.asList(
                new Employee("A","ABC",10),
                new Employee("A","BCCC",110),
                new Employee("B","BCD",20)
        );

        employees.stream()
                .findFirst()
                .ifPresent(e -> System.out.println(e.getName()));

        employees.stream()
                .map(e->e.getName())
                .filter(e -> e.contains("C"))
                .forEach(System.out::println);
    }
}
