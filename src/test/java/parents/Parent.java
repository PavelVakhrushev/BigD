package parents;

class Parent {
    protected int value = 0;

    Parent() {
        this.value++;
    }

    protected int getValue() {
        return value;
    }

    protected void setValue(int v) {
        this.value = v;
        modify();
    }

    protected void modify() {
        this.value += 4;
    }
}

class Child extends Parent {
    Child() {
        this.value++;
    }

    protected void modify() {
        this.value -= 4;
    }
}

class Test {

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.setValue(c.getValue());
        c.setValue(p.getValue());
        System.out.println(p.getValue());
        System.out.println(c.getValue());
    }
}
