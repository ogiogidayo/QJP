package projava;

public class SwitchSample {
    public static void main(String[] args) {
        var a = 3;
        switch (a) {
            case 1, 2 -> System.out.println("one-two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            default -> System.out.println("other");
        }
        System.out.println(switch (a) {
            case 1, 2 -> "one-two";
            case 3 -> "three";
            case 4 -> "four";
            default -> "other";
        });
    }
}
