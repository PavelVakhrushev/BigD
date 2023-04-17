package Lesson_3_10;

public class Alchemy {
    public static void main(String[] args) {
        if (args.length == 0 || args.length % 2 != 0) {
            System.out.println("Неверное количество аргументов");
        }
        connectElements(createNatureElements(args));
    }

    private static NatureElement[] createNatureElements(String[] args) {
        NatureElement[] elems = new NatureElement[args.length];
        for (int i = 0; i < args.length; i++) {
            elems[i] = NatureElement.create(args[i]);
            if (elems[i] == null) {
                System.out.println("Неизвестный элемент: " + args[i]);
            }
        }
        return elems;
    }

    private static NatureElement[] connectElements(NatureElement[] elems) {
        NatureElement[] result = new NatureElement[elems.length / 2];
        int j = 0;
        for (int i = 0; i < elems.length; i += 2) {
            NatureElement connected = elems[i].connect(elems[i + 1]);
            if (connected != null) {
                result[j++] = connected;
            }
        }
        return result;
    }
}
