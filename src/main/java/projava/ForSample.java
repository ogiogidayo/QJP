package projava;

public class ForSample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Skip");
                continue;
            }
            System.out.println(i);
        }
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("finish");
                break;
            }
            System.out.println(i);
        }
    }
}
