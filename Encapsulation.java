public class Encapsulation {

    public static void main(String[] args) {

        Person person = new Person();

        person.setCity("Monrovia");

        person.setName("Dr Tarkeshwar Barua");

        person.setPhone("4545454");

        System.out.println(person.getName());
        System.out.println(person.getPhone());
        System.out.println(person.getCity());

    }

}