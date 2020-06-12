import java.util.Scanner;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 23:21
 * @category View
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Numero numero = new Numero();

        System.out.println(numero.mostrarNumerosZeroAVinte());
        System.out.println(numero.mostrarNumerosParesZeroAVinte());
        System.out.println(numero.mostrarNumerosImparesZeroAVinte());

        System.out.println("Digite o inicio:");
        int inicio = scanner.nextInt();
        System.out.println("Digite o fim:");
        int fim = scanner.nextInt();

        System.out.println(numero.mostrarNumerosConformeIntervalo(inicio, fim));

        System.out.println("Digite o inicio:");
        int inicio1 = scanner.nextInt();
        System.out.println("Digite o fim:");
        int fim1 = scanner.nextInt();
        System.out.println("Digite o step:");
        int step = scanner.nextInt();
        System.out.println(numero.mostrarNumerosConformeIntervaloStep(inicio, fim, step));

    }
}
