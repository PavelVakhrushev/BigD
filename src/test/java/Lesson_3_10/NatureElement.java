package Lesson_3_10;

abstract  public class NatureElement {
    abstract boolean connect(NatureElement elem);

    public static NatureElement create(String elementName) {
        switch (elementName) {
            case "Fire":
                return new Fire();
            case "Air":
                return new Air();
            case "Earth":
                return new Earth();
            case "Water":
                return new Water();
            default:
                System.out.println("Неизвестный элемент");
                return null;
        }
    }
}

