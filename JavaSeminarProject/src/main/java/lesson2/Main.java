package lesson2;

public class Main {
    public static void main(String[] args) {
//        printChars();
//        task2();
        returnLengthN();
    }

    private static void printChars() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append("i: ").append(i).append(" -> ").append((char)i).append(System.lineSeparator());
        }
        System.out.println(sb.toString());
    }

    private static void task2() {
        int n = 7;
        StringBuilder c1 = new StringBuilder("a");
        StringBuilder c2 = new StringBuilder("b");
        System.out.println(c1);
        System.out.println(c2);
    }

    private static void returnLengthN() {
        int n = 11;
        StringBuilder a = new StringBuilder("a"); // vrode kak menshiy rashod pamyati (bolee effektivno)
//        StringBuilder b = new StringBuilder("b"); // vrode kak menshiy rashod pamyati (bolee effektivno)
//        String a = "a";
        String b = "b";
        StringBuilder c = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                c.append(a);
            } else {
                c.append(b);
            }
        }
        System.out.println(c);
    }
}
