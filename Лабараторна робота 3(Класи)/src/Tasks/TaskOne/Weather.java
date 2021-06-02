package Tasks.TaskOne;

import java.util.Scanner;

/*
* 11. Описати клас для бази зданих з інформацією про метеорологічні спостереження протягом місяця у форматі:
* дата, температура повітря, атмосферний тиск.
* Визначити дні з атмосферним тиском, більшим від середнього начення цього показника за весь період.
* Результат вивести на екран у формі таблиці.
* */

public class Weather {
    WeatherDate date;       //дата
    double temperature;     //температура
    double pressure;        //атмосферний тиск

    public Weather() {
        date = new WeatherDate();
        temperature = 0;
        pressure = 0;
    }

    public Weather(int day, int month, int years, double temperature, double pressure) {
        this.date = new WeatherDate(day, month, years);
        this.temperature = temperature;
        this.pressure = pressure;
    }


    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дані про метеорологічні спостереження :");
        date.enterDate();
        System.out.print("Температура : ");
        temperature = scanner.nextDouble();
        System.out.print("Атмосферний тиск : ");
        pressure = scanner.nextDouble();
    }


    @Override
    public String toString() {
        return date.toString() +
                "\t" + temperature +
                "\t\t\t" + pressure;
    }

    //гетери
    public WeatherDate getDate() {return date;}
    public double getTemperature() {return temperature;}
    public double getPressure() {return pressure;}

    //сетери
    public void setDate(WeatherDate date) {this.date = date;}
    public void setName(double temperature) {this.temperature = temperature;}
    public void setPressure(double pressure) {this.pressure = pressure;}
}