package pfrrtt;
import java.math.BigDecimal;
import java.util.Scanner;
public class Pfrrtt {
    public static void main(String[] args) {
        System.out.println("Данная программа написана онли для женщин)" + "\n");
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите ваш вес[кг]: ");
        int ves = scn.nextInt();
        System.out.print("Введите ваш рост[см]: ");
        int rost = scn.nextInt();
        System.out.print("Введите ваш возраст: ");
        int let = scn.nextInt();
        scn.close();

        System.out.println("\n" + "Ваш идеальный вес[кг]: "+ ((rost-100)-(rost-150)/2));
        
        if (ves == ((rost-100)-(rost-150)/2)) {
            System.out.println("Вы в хорошей форме");
        }
        
        else if (ves < ((rost-100)-(rost-150)/2)) {
            System.out.println("Надо немного поправится");
        }
        
        else if (ves > ((rost-100)-(rost-150)/2)) {
            System.out.println("Надо немного похудеть");
        }
        
        final double metr = 0.01;
        double m = rost * metr;
        
        System.out.println("\n" + "Индекс массы тела: " + BigDecimal.valueOf(ves/(m*m)).setScale(2, BigDecimal.ROUND_HALF_UP));
        
        
        if ((ves/(m*m))<=16) {
            System.out.println("У вас выраженный дефицит массы тела");
        }
        
        else if ((ves/(m*m))>16 && (ves/(m*m))<=18.5) {
            System.out.println("У вас недостаточная масса тела");
        }
        
        else if ((ves/(m*m))>18.5 && (ves/(m*m))<=25) {
            System.out.println("Ваша масса тела в норме");
        }
        
        else if ((ves/(m*m))>25 && (ves/(m*m))<=30) {
            System.out.println("У вас избыточная масса тела");
        }
        
        else if ((ves/(m*m))>30) {
            System.out.println("У вас ожирение");
        }
        
        
        System.out.println("\n" + "Норма калорий в день: " + (447.6+(9.2*ves)+(3.1*rost)-(4.3*let)));
        
    }
}
