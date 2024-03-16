package projava;

public class IfSample {
    public static void main(String[] args) {
        var a = 2;
        if (a < 3) {
            System.out.println("Small");
        } else if (a < 7) {
            System.out.println("Middle");
        } else {
            System.out.println("Big");
        }
    }
}
