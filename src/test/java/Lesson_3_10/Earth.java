package Lesson_3_10;

class Earth extends NatureElement {
    boolean connect(NatureElement elem) {
        if (elem instanceof Air) {
            System.out.println("Earth + Air = Dust");
            return true;
        } else if (elem instanceof Earth) {
            System.out.println("Earth + Earth = Pressure");
            return true;
        } else if (elem instanceof Water) {
            System.out.println("Earth + Water = Mud");
            return true;
        } else if (elem instanceof Fire) {
            System.out.println("Earth + Fire = Lava");
            return true;
        }
        return false;
    }
}
