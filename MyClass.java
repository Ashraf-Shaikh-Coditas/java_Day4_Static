package Week2.Day4;

public class MyClass {
    private static int x = 10;

    static {
        x++;  // 11
    }

    static {
        ++x; // 12
    }


     {
        x--;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        System.out.println(x);
    }
}

// First static initialization block is executed . So x becomes 11.
// Second static initialization block is executed . So x becomes 12.

// Then for first obj 'obj' object initialization block executes . So x becomes 11
//Then for second obj 'obj2' object initialization block executes . So x becomes 10
//Then for third  obj 'obj3' object initialization block executes . So x becomes 9

/*  OUTPUT.

9

* */