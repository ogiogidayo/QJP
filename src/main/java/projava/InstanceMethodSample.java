package projava;

public class InstanceMethodSample {
    record Student(String name, int englishScore, int mathScore) {
        int average() {
            return (this.englishScore() + this.mathScore()) / 2;
        }

        public int maxScore() {
            return Math.max(englishScore(), mathScore());
        }
    }

    public static void main(String[] args) {
        var kis = new Student("kis", 60, 80);
        var a = kis.average();
        int max = kis.maxScore();
        System.out.println("平均点は%d点です".formatted(a));
        System.out.println("最高点は%d点です".formatted(max));
    }
}
