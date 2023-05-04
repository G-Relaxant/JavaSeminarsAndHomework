package lesson2;

public class Main {
    public static void main(String[] args) {
//        printChars();
//        task2();
//        returnLengthN();
        stringCompression();
        strCompresVar2();
        strCompresVar3();
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
        StringBuilder a = new StringBuilder("a");  // vrode kak menshiy rashod pamyati (bolee effektivno)
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

    private static void stringCompression() {
        String str = "aaaabbbcdd";
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count > 1) {
                    res.append(str.charAt(i)).append(count);
                } else {
                    res.append(str.charAt(i));
                }
                count = 1;
            }
        }
        res.append(str.charAt(str.length() - 1)).append(count);
        System.out.println(res);
    }

    private static void strCompresVar2() {
        String str = "aaaabbbccdeefff";
        StringBuilder res = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length()-1; i++) {
            if (count == 1 & str.charAt(i) != str.charAt(i+1)) {    // если символ не повторяется, то 1 не пишется (d)
                res.append(str.charAt(i));
            }
            else if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            }
            else {
                res.append(str.charAt(i)).append(count);
                count=1;
            }
        }
        res.append(str.charAt(str.length()-1)).append(count);

        System.out.println(res);
    }

    private static void strCompresVar3() {
        String str = "aaaabbbcddr";
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                res.append(str.charAt(i));
                if (count > 1) {
                    res.append(count);
                }
                count = 0;
            }
            count++;
        }
        res.append(str.charAt(str.length() - 1));
        res.append(count > 1 ? count : "");             // тернарный оператор | ? - if yes | : - if no(else) |
        System.out.println(res);
    }
}
