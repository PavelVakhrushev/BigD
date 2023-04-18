package Lesson_3_10;

class Alchemy {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Введите другие элементы");
        }
        //проверяем что для всех переданных аргументов возможно создать элемент
        NatureElement[] elements = new NatureElement[args.length];
        for (int i = 0; i < args.length; i++) {
            NatureElement.create(args[i]);
            elements[i] = NatureElement.create(args[i]);
        }

        //Разбиваем массив на пары
        if (elements.length % 2 == 0) {
            for (int i = 0; i < elements.length; i += 2) {
                assert elements[i] != null;
                elements[i].connect(elements[i + 1]);
            }
        } else {
            //Если нечёт. количество элементов последний не учитываем
            for (int i = 0; i < elements.length - 1; i += 2) {
                assert elements[i] != null;
                elements[i].connect(elements[i + 1]);
            }
        }
    }
}
