package Lesson_3_10;

public class Water extends NatureElement {
    @Override
    NatureElement connect(NatureElement element) {
        if (element instanceof Water) {
            System.out.println("Water + Water = Sea");
            return new Sea();
        }
        if (element instanceof Fire) {
            System.out.println("Water + Fire = Steam");
            return new Steam();
        }
        if (element instanceof Earth) {
            System.out.println("Water + Earth = Mud");
            return new Mud();
        }
        if (element instanceof Air) {
            System.out.println("Water + Air = Rain");
            return new Rain();
        } else {
            System.out.println("Неизвестный элемент");
            return null;
        }
    }
}
