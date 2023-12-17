import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        // Прочитайте некоторое количество строк в консоли.
        // Далее выведите длину каждой из строк различными способами консольного вывода.
        String str = "My name is Kiryl";
        String str2 = "I love Java!";

        System.out.println("String 1 = " + str);
        System.out.println("String 1 содержит = " + str.length() + " Символов");

        int count = 0;
        for (int i = 0; i < str2.length(); i++) {
            count++;
        }
        System.out.println("String 2 = " + str2);
        System.out.println("String 2 содержит = " + count + " Символов");
    }
}