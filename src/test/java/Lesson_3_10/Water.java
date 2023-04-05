package Lesson_3_10;

class Water extends NatureElement {
    boolean connect(NatureElement elem) {
        if (elem instanceof Air) {
            System.out.println("Water + Air = Rain");
            return true;
        } else if (elem instanceof Earth) {
            System.out.println("Water + Earth = Mud");
            return true;
        } else if (elem instanceof Water) {
            System.out.println("Water + Water = Sea");
            return true;
        } else if (elem instanceof Fire) {
            System.out.println("Water + Fire = Steam");
            return true;
        }
        return false;
    }
}

