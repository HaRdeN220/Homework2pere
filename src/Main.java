//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        short mass1 = 250;
        short mass2 = 500;
        short massAll = 7 * 1000;
        System.out.println("Если спортсмен будет худеть на 250 грамм за день у него уйдет " +
                (massAll/mass1) + " дней");
        System.out.println("Если спортсмен будет худеть на 500 грамм за день у него уйдет " +
                (massAll/mass2) + " дней");
        System.out.println("Если спортсмен будет худеть в среднем у него уйдет " +
                (((massAll/mass1) + (massAll/mass2))/2) + " дня");
        }
    }
