package projava;

import java.util.List;

public class InheritSample {
    static class User {
        String name;

        public String getName() {
            return name;
        }
    }

    static class Student extends User {
        int score;

        Student(String name, int score) {
            // super(); が省略されている
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }
    }

    static class Teacher extends User {
        String subject;

        Teacher(String name, String subject) {
            // super(); が省略されている
            this.name = name;
            this.subject = subject;
        }

        public String getSubject() {
            return subject;
        }
    }

    public static void main(String[] args) {
        List<User> people = List.of(
                new Student("kis", 80),
                new Teacher("hosoya", "math"));
        for (var p :people) {
            System.out.println("こんにちは%sさん".formatted(p.getName()));
            System.out.println(p);
        }
    }
}
