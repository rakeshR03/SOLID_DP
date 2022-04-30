package designpattern.creational.builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getStudentBuilder().setName("Raj").setAge(18).setSalary(18000).build();

        System.out.println(student.getName());
    }
}
