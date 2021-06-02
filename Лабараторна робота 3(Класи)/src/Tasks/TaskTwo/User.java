package Tasks.TaskTwo;
import java.util.Scanner;

/*
Варіант 11
Клас : Користувачі локальної мережі
Поля : Прізвище, група, обліковий запис, тип облікового запису.
Параметр сортування : Тип облікового запису
Параметр пошуку : Прізвище
* */

public class User {
    String lastname;
    String group;
    String account;
    String type_account;

    public User() {
        lastname = "";
        group = "";
        account = "";
        type_account = "";
    }

    public User(String lastname, String group, String account, String type_account) {
        this.lastname = lastname;
        this.group = group;
        this.account = account;
        this.type_account = type_account;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Прізвище : ");
        lastname = scanner.nextLine();
        System.out.print("Група : ");
        group = scanner.nextLine();
        System.out.print("Обліковий запис : ");
        account = scanner.nextLine();
        System.out.print("Тип облікового запису : ");
        type_account = scanner.nextLine();
    }

    public void print() {
        System.out.println("Прізвище - " + lastname);
        System.out.println("Група - " + group);
        System.out.println("Обліковий запис - " + account);
        System.out.println("Тип облікового запису - " + type_account);
    }

    @Override
    public String toString() {
        return "Movies{" +
                "lastname='" + lastname + '\'' +
                ", group='" + group + '\'' +
                ", account='" + account + '\'' +
                ", type_account='" + type_account + '\'' +
                '}';
    }

    public String to_string() {
        return lastname + '\n' +
                group + '\n' +
                account + '\n' +
                type_account + '\n';
    }

   //гетери
    public String getLastname() { return lastname; }
    public String getGroup() { return group; }
    public String getAccount() { return account; }
    public String getType_account() { return type_account; }

    //сетери
    public void setLastname(String lastname) { this.lastname = lastname; }
    public void setGroup(String group) { this.group = group; }
    public void setAccount(String account) { this.account = account; }
    public void setType_account(String type_account) { this.type_account = type_account; }
}
