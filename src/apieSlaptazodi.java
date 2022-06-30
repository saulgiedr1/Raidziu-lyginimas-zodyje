import java.util.Scanner;
public class apieSlaptazodi {
    public static void main(String[] args) {


        String slaptazodis;


        Scanner skaitytuvas = new Scanner(System.in);

        System.out.println("Įveskite slaptažodį: ");
        slaptazodis = skaitytuvas.nextLine();
        System.out.println("Slaptažodis yra:" + slaptazodis);

        String palyginimoRezultatas = zodzioLyginimas(slaptazodis);
        System.out.println("palyginimoRezultatas = " + palyginimoRezultatas);


    }
    public static String gaunamasZodis (String a ){
            int zodis=0;
        for(int i=0; i<a.length(); i++){
            if(a.equals(zodis)){
                return "true";
            }
            else return "false";
        }

        return a;
    }
    public static String zodzioLyginimas(String a,String b){
        for (int i=0; i < a.length(); i++) {
            if(gaunamasZodis(a.equals(b)))
        }
}
