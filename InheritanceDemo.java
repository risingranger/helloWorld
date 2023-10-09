public class InheritanceDemo {

    public static void main(String[] args) {
        Student student = new Student();
        student.setCity("Agra");
        student.setName("Dr Tarkeshwar Barua");
        student.setClassroom("5");
        System.out.println(student.getCity());
        System.out.println(student.getName());
        System.out.println(student.getClassroom());
        System.out.println(student.getPhone());
        System.out.println(student.getRollno());
        System.out.println("My name is " + student.getName());
    }
}
