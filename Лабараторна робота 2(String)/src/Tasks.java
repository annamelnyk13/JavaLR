import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Tasks {
    /*
     * 11. а) підраховує кількість слів у кожному реченні;
     * б) виводить на екран найдовше речення.
     * */
    public static void task1() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок : ");
        String str = scanner.nextLine();

        if (str.length() == 0) {
            throw new IOException("Не був введений рядок!");
        }

        System.out.println("\nРезультат :");
        task1_1(str);
    }

    //а) підраховує кількість слів у кожному реченні; б) виводить на екран найдовше речення.
    private static void task1_1(String str){
        String[] sentence = str.split("[.?!]");

        System.out.println("a)Кількість слів у реченнях : ");
        int max = 0, index = 0;
        for(int i =0;i<sentence.length;i++) {
            String p = sentence[i];
            p = p.replaceAll("[.?!'\"]", "");
            String[] words = p.split("[\\s]+");
            if(words.length > max){
                max = words.length;
                index = i;
            }
            System.out.print(words.length + " ");
        }
        System.out.println();

        System.out.println("б)Найдовше речення = " + sentence[index]);
    }



}
