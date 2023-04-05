package Lesson_3_10;

public class Alchemy {
    public static void main(String[] args) {
        if (args.length == 0 || args.length % 2 != 0) {
            System.out.println("Неверное количество аргументов");
        }
        NatureElement[] elems = createNatureElements(args);
        NatureElement[] result = connectElements(elems);
        printResultElements(result);
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
            if (elems[i].connect(elems[i + 1])) {
                result[j++] = NatureElement.create(elems[i].getClass().getSimpleName() + elems[i + 1].getClass().getSimpleName());
            }
        }
        return result;
    }

    private static void printResultElements(NatureElement[] result) {
        for (NatureElement elem : result) {
            if (elem != null) {
                System.out.println(elem.getClass().getSimpleName());
            }
        }
    }
}