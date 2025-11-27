import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        
        double Pe, Pr;

        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuántas personas son?");
        Pe = leer.nextDouble();

        if (Pe > 200 && Pe <= 300) {
            Pr = Pe * 85;

        } else if (Pe > 300) {
            Pr = Pe * 75;

        } else {
            Pr = Pe * 95;
        }

        System.out.println("El total por el banquete es de " + Pr);
    }
}
