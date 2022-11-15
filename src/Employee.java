
public class Employee {

    int id = 4;
    String name = "dhf";
    static String company = "virturl IT";

    public Employee(int i, String n) {
        id = i;
        name = n;
    }

    public static void change() {
        company = "change";
    }

    public void show() {
        System.out.println("Id: " + id + " Name: " + name + " Company: " + company);
    }

    public static void main(String[] args) {
        Employee.change();

        Employee em2 = new Employee(34, "hello");

        em2.show();
    }
}
