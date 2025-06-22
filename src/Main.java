//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        short paint = 120;
        short whiteColour = 2;
        short brownColour = 4;
        System.out.println("В школе, где " + (paint/(whiteColour + brownColour)) + " классов, нужно " +
                ((paint/(whiteColour + brownColour))*whiteColour)+" банок белой краски и "+ ((paint/(whiteColour + brownColour))*brownColour) +
                " банок коричневой краски");
        }
    }
