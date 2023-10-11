// Program to compare two strings
public class MyString {
    public static void main(String args[]) {
        String s1 = "I love";
        String s = "My India";
        if (s1.compareTo(s) > 0)
            // System.out.println(s1 + " is greater than " + s); // prints the dynamic value
            System.out.println("s1" + " is greater than " + "s"); // Prints the static statement present
        else if (s1.compareTo(s) < 0)
            System.out.println(s1 + " is less than " + s);
        else
            System.out.println(s1 + " is equal to " + s);
    }
}
