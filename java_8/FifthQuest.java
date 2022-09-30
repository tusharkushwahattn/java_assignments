interface Clickable {
    default void click() {
        System.out.println("click");
    }
}

interface Accessible {
    default void access() {
        System.out.println("access");
    }
}

public class FifthQuest implements Clickable, Accessible {

    public static void main(String[] args) {
        FifthQuest button = new FifthQuest();
        button.click();
        button.access();
    }
}
