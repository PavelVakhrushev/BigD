package Lesson_3_10;

class Fire extends NatureElement {
    boolean connect(NatureElement elem) {
        if (elem instanceof Air) {
            System.out.println("Fire + Air = Energy");
            return true;
        } else if (elem instanceof Earth) {
            System.out.println("Fire + Earth = Lava");
            return true;
        } else if (elem instanceof Water) {
            System.out.println("Fire + Water = Steam");
            return true;
        } else if (elem instanceof Fire) {
            System.out.println("Не производит новый элемент");
            return true;
        }
        return false;
    }
}
