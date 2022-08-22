package Week2.Day4;

public class Demo {
    void m1(Demo d) {
        System.out.println("Instance method");
    }

    static void m1(Demo d) {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1(d);
    }
}

// In case of static functions method resolving takes place at compile time .
// So , it becomes ambiguous for compiler to resolve normal as well as static method with same name
// and same signature.
// So , code will not run .