package projava;

public class MethodSample {
    public static void main(String[] args) {
        var result = twice(3);
        var result2 = MethodSample.twice(4); // 同じ
        System.out.println(result);
        System.out.println(result2);
    }

    static int twice(int x) {
        return x * 2;
    }
}
