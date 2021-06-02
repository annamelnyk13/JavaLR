package Tasks;

import Tasks.TaskOne.Weather;
import Tasks.TaskOne.WeatherDate;
import Tasks.TaskTwo.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1.Перше завдання." + "\n" +
                    "2.Друге завдання." + "\n" +
                    "3.Вихід." + "\n" +
                    "Введіть число : ");
            int nomer = scanner.nextInt();

            switch (nomer) {
                case 1:
                    TaskOne();
                    break;
                case 2:
                    TaskTwo();
                    break;
                case 3:
                    return;
                default:
                    System.err.println("Не вірно введене число! Введіть ще раз :");
                    break;
            }
        }
    }


    /*
     * 11. Описати клас для бази зданих з інформацією про метеорологічні спостереження протягом місяця у форматі:
     * дата, температура повітря, атмосферний тиск.
     * Визначити дні з атмосферним тиском, більшим від середнього начення цього показника за весь період.
     * Результат вивести на екран у формі таблиці.
    * */
    public static void TaskOne(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Weather> list = new ArrayList<Weather>();
        list.add(new Weather(1, 1, 2021, -10, 990.3));
        list.add(new Weather(2, 1, 2021, -15, 998.6));
        list.add(new Weather(3, 1, 2021, -12, 1001.8));
        list.add(new Weather(4, 1, 2021, -9, 1007));
        list.add(new Weather(5, 1, 2021, -5, 1001.8));
        list.add(new Weather(6, 1, 2021, -13, 985.6));
        list.add(new Weather(7, 1, 2021, -1, 993.1));
        list.add(new Weather(8, 1, 2021, 4, 986.1));
        list.add(new Weather(9, 1, 2021, 7, 990.8));
        list.add(new Weather(10, 1, 2021, 5, 994.0));

        double average = 0;
        System.out.println("\nСписок інформацією про метеорологічні спостереження :");
        System.out.println("Дата :" + "\t\t" + "Температура :" + "\t" + "Атмосферний тиск");
        for (Weather weather : list) {
            System.out.println(weather.toString());
            average += weather.getPressure();
        }

        System.out.println("\nДні в яких атмосферний тиск був більший за середній(" + String.format("%.2f", (average/list.size())) + ") :");
        for (Weather weather : list) {
            if(weather.getPressure() > average/list.size())
                System.out.println(weather.toString());
        }
    }

    public static void TaskTwo() {
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            try {
            Task task = new Task();
            System.out.print("\nВведіть команду : ");
            String command = scanner.nextLine();
                switch (command) {
                    case "add":
                        task.add();
                        break;
                    case "edit":
                        task.edit();
                        break;
                    case "print":
                        task.print();
                        break;
                    case "search":
                        task.search();
                        break;
                    case "sort":
                        task.sort();
                        break;
                    case "delete":
                        task.delete();
                        break;
                    case "exit":
                        return;
                    case "help":
                        System.out.println("\nadd - додати користувача" + "\n" +
                                "edit - редагувати " + "\n" +
                                "print - висести список користувачів" + "\n" +
                                "search - пошук користувача за прізвищем2" + "\n" +
                                "sort - сортування " + "\n" +
                                "delete - видалити користувача" + "\n" +
                                "exit - вихід");
                        break;
                    default:
                        System.err.print("Не вірно введена команда(help - допомога)! Введіть ще раз :");
                        break;
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
