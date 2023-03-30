import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stop = 0;
        while (stop != 1) {
            System.out.println("Ingrese la cadena: ");
            String cadena = sc.next();
            validarAutomata(cadena);
            System.out.println("Si desea detener el programa oprima 1, de lo contrario oprima otro número: ");
            stop = sc.nextInt();
            System.out.println("-------------------------///-------------------------");
        }
    }

    public static void validarAutomata(String cadena) {
        int contA = 0;
        int contB = 0;
        boolean val = false;

        for (int i=0; i<cadena.length(); i++) {
            char carac = cadena.charAt(i);
            if (carac == 'a' && val == false) {
                contA++;
            } else if (carac == 'b') {
                contB++;
                val = true;
            } else {
                System.out.println("La cadena es inválida.");
                return;
            }
        }

        if ((contA>=2 && contA%2==0) && (contB>=3 && contB%2!=0)) {
            System.out.println("La cadena es válida.");
        } else if (cadena.isEmpty() || (contA%2==0 && contA>=2) || (contB%2!=0 && contB>=3)) {
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena es inválida.");
        }
    }
}
