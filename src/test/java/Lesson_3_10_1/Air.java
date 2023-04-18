package Lesson_3_10_1;

public class Air extends NatureElement {
    @Override
    NatureElement connect(NatureElement element) {
        if (element instanceof Air) {
            System.out.println("Air + Air = Pressure");
            return new Pressure();
        }
        if (element instanceof Earth) {
            System.out.println("Air + Earth = Dust");
            return new Dust();
        }
        if (element instanceof Fire) {
            System.out.println("Air + Fire = Energy");
            return new Energy();
        }
        if (element instanceof Water) {
            System.out.println("Air + Water = Rain");
            return new Rain();
        } else {
            System.out.println("Неизвестный элемент");
            return null;
        }
    }
}
