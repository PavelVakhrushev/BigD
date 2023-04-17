package Lesson_3_10;

public class Fire extends NatureElement {

    @Override
    NatureElement connect(NatureElement element) {
        if (element instanceof Fire) {
            System.out.println("Fire + Fire не производит новый элемент");
            return null;
        }
        if (element instanceof Air) {
            System.out.println("Fire + Air = Energy");
            return new Energy();
        }
        if (element instanceof Earth) {
            System.out.println("Fire + Earth = Lava");
            return new Lava();
        }
        if (element instanceof Water) {
            System.out.println("Fire + Water = Steam");
            return new Steam();
        } else {
            System.out.println("Неизвестный элемент");
            return null;
        }
    }

}
