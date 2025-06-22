//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args){
            int salaryMasha1 = 67760;
            float salaryMasha2 = salaryMasha1 * 1.1f;
            int salaryDenis1 = 83690;
            float salaryDenis2 = salaryDenis1 * 1.1f;
            int salaryKristina1 = 76230;
            float salaryKristina2 = salaryKristina1 * 1.1f;
            System.out.println("Маша теперь получает " + salaryMasha2 + " рублей. Годовой доход вырос на " + ((salaryMasha2 - salaryMasha1)*12) +
                    " рублей.");
            System.out.println("Денис теперь получает " + salaryDenis2 + " рублей. Годовой доход вырос на " + ((salaryDenis2 - salaryDenis1)*12) +
                    " рублей.");
            System.out.println("Кристина теперь получает " + salaryKristina2 + " рублей. Годовой доход вырос на " + ((salaryKristina2 - salaryKristina1)*12) +
                    " рублей.");
        }
    }
