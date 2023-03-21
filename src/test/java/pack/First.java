package pack;

class First {
    private Second elem;

    public void setElem(Second e) {
        elem = e;
    }
}

class Second {
    private First elem;

    public void setElem(First e) {
        elem = e;
    }
}

class Test {
    public static void main(String[] args) {
        First a = new First();
        Second b = new Second();
        a.setElem(b);
        b.setElem(a);
        a = null;
        First temp = method(b);
        b = null;
        /*(x)*/     System.out.println("end");
    }

    static First method(Second b) {
        First a = new First();
        a.setElem(b);
        return a;
    }
}
