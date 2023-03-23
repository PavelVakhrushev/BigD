package Stack;

public class Stack {
    private int stck[];
    private int tos;


    // выделить память под стек и инициализировать его
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }
    // разметить элемент в стеке
    void push(int item) {
        if (tos == stck.length - 1) // использовать член длины массива
            System.out.println("Стэк заполнен");
        else
            stck[++tos] = item;
    }

    int pop() { // извлечь элемент из стека
        if (tos < 0) {
            System.out.println("Стэк не загружен");
        }
        else
            return stck[tos--];
        return 0;
    }
}

class TestStack2 {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);
        System.out.println("Стэк в mystack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());
        System.out.println("Стэк в mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}

