import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        File file = new File("Users.txt");
        Scanner fc = new Scanner(file);
        PrintWriter wr = new PrintWriter("Users.txt");
        Users us = new Users();

        int i = 0;
        while(i == 0) {
            System.out.println("1.Login\n2.Rejestracja \n3.Wyjście");
            int a = sc.nextInt();
            sc.nextLine();
            if (a == 2) {
                System.out.print("Podaj login: ");
                String login = sc.nextLine();
                System.out.print("Podaj haslo: ");
                String pass = sc.nextLine();
                us.setNick(login);
                us.setPass(pass);
                wr.println(login);
                wr.println(pass);
                wr.close();
            } else if (a == 1) {
                System.out.print("Podaj login: ");
                String login = sc.nextLine();
                System.out.print("Podaj haslo: ");
                String pass = sc.nextLine();
                String clogin = fc.nextLine();
                String cpass = fc.nextLine();
                if(login == clogin || pass == cpass){
                    System.out.println("Poprawnie zalogowano!");
                }
                else{
                    System.out.println("Wystapil blad podczas pruby zalogowania!");
                }
            } else if (a == 3) {
                System.out.println("KONIEC PROGRAMU");
                i = 1;
            }
        }
    }
}
