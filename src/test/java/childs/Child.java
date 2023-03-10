package childs;

import parents.*;

public class Child extends Parent {
    Child() {
        id = "212";
    }

    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();

        System.out.println(c.id);
        p.printId();
    }
}