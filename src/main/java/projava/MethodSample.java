package projava;

public class MethodSample {
    public static void main(String[] args) {
        var result = twice(3);
        var result2 = MethodSample.twice(3); // 同じ
        System.out.println(result);
    }

    static int twice(int x) {
        return x * 2;
    }
}
