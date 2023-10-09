class A {
    void show() {
        System.out.println("This is class A");
    }
}

interface B {
    public void show1();
}

class C extends A implements B {
    void show() {
        System.out.println("I am using Class A in Class C");
    }

    public void show1() {
        System.out.println("I am using Interface Class");
    }
}

class MultipleInheritance {
    public static void main(String args[]) {
        A a = new A();
        a.show();
        B b;
        b = new C();
        b.show1();
        C c = new C();
        c.show();

    }
}