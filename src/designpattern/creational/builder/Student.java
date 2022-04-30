package designpattern.creational.builder;

public class Student {
    private String name;
    private int age;
    private String email;
    private int mobile;
    private int salary;

    private Student(){};

    public String getName() {
        return name;
    }

    public static StudentBuilder getStudentBuilder(){
        return new StudentBuilder();
    }



    public static class StudentBuilder{
        private Student student = new Student();

        public StudentBuilder setName(String name){
            student.name = name;
            return this;
        }

        public StudentBuilder setAge(int age){
            student.age = age;
            return this;
        }

        public StudentBuilder setSalary(int salary){
            student.salary = salary;
            return this;
        }

        public Student clone(Student student){
            Student newStudent = new Student();
            newStudent.name = student.name;
            newStudent.age = student.age;
            newStudent.email = student.email;
            newStudent.salary = student.salary;
            newStudent.mobile = student.mobile;

            return newStudent;
        }

        public Student build(){
            if(student.salary < 1000){
                throw new RuntimeException("salary less than 1000");
            }
            if(student.age < 18 ){
                throw new RuntimeException("age less than 18");
            }

            return clone(student);
        }
    }
}
