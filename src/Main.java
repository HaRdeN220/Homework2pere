//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        short time = 2;
        short bottle = 16;
        int perfomance = bottle / time;
        System.out.println("За 20 минут машина произвела " + (perfomance*20) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (perfomance*60*24) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (perfomance*60*24*3) + " штук бутылок");
        System.out.println("За месяц машина произвела " + (perfomance*60*24*30) + " штук бутылок");
        }
    }
