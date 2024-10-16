class MyClass {
    void display() {
        System.out.println("This is parent class");
    }
}

class Child extends MyClass {
    void display() {
        System.out.println("This is child class");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();

        Child childObj = new Child();
        childObj.display();
    }
}
