
class Person{
    String name;
    String id;

    public Person(String name){
        this.name = name;
    }

    public Person(){

    }
}

class Student extends Person{
    String grade;
    String departments;

    public Student(String name){
        super(name);
    }
}
public class CH04_UpCasting {

    public static void main(String[] args) {
        Person person;
        Student student = new Student("이재문");
        person = student;  // 업캐스팅

        System.out.println(person.name);
        System.out.println(student.grade);

    }
}
