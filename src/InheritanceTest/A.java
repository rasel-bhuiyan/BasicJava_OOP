package InheritanceTest;

public class A extends B {

    void DisplayA() {
        System.out.println("This is A class");
    }

    public static void main(String[] args) {

        A a = new A();
        a.DisplayB();
        a.DisplayC();

    }

}
