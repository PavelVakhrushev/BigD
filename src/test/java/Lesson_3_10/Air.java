package Lesson_3_10;

class Air extends NatureElement {
    boolean connect(NatureElement elem) {
        if (elem instanceof Air) {
            System.out.println("Air + Air = Pressure");
            return true;
        } else if (elem instanceof Earth) {
            System.out.println("Air + Earth = Dust");
            return true;
        } else if (elem instanceof Water) {
            System.out.println("Air + Water = Rain");
            return true;
        } else if (elem instanceof Fire) {
            System.out.println("Air + Fire = Energy");
            return true;
        }
        return false;
    }
}
