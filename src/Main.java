import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("En este momento, ¿qué operación matemática deseas realizar? ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int b = scanner.nextInt();
                    System.out.println("El resultado de la suma es: " + calc.sumar(a, b));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("El resultado de la resta es: " + calc.restar(a, b));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("El resultado de la multiplicación es: " + calc.multiplicar(a, b));
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    try {
                        System.out.println("El resultado de la división es: " + calc.dividir(a, b));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Finalizando la ejecución");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
        while (opcion != 5);
    }
}
