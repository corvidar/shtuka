package pfrrtt;
import java.util.Scanner;
public class Pfrrtt {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите ваш вес[кг]: ");
        int ves = scn.nextInt();
        System.out.print("Введите ваш рост[см]: ");
        int rost = scn.nextInt();

        System.out.println("Ваш идеальный вес[кг]: "+ ((rost-100)-(rost-150)/2));
        
        if (ves == ((rost-100)-(rost-150)/2)) {
            System.out.println("Вы в хорошей форме");
        }
        
        else if (ves < ((rost-100)-(rost-150)/2)) {
            System.out.println("Надо немного поправится");
        }
        
        else if (ves > ((rost-100)-(rost-150)/2)) {
            System.out.println("Надо немного похудеть");
        }
    }
    }
