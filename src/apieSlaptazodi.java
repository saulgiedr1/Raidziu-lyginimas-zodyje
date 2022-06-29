import java.util.Scanner;
public class apieSlaptazodi {
    public static void main(String[] args) {


        String slaptazodis;
        String slaptazodis1;

        Scanner skaitytuvas = new Scanner(System.in);

        System.out.println("Įveskite slaptažodį: ");
        slaptazodis = skaitytuvas.nextLine();
        System.out.println("Slaptažodis yra:" + slaptazodis);

        System.out.println("Įveskite slaptažodį: ");
        slaptazodis1 = skaitytuvas.nextLine();
        System.out.println("Slaptažodis yra:" + slaptazodis1);



        if (slaptazodis.equals(slaptazodis1)) {
            System.out.println("gerai");
        }

       

    }
}
