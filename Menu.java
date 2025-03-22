
import java.util.Scanner;
import java.util.Stack;

public class Menu {

    //Parcial entregado por Cristian Camilo González Carmona

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Stack<Banco> pila = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1. Registrar usuario");
            System.out.println("2. Mostrar usuarios");
            System.out.println("3. Modificar usuarios");
            System.out.println("4. Vender crédito");

            System.out.println("5. Salir");
            System.out.println("Ingrese una opción:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    metodos.registraUsuario(pila);
                    break;
                case 2:
                    metodos.mostrarUsuario(pila);
                    break;
                case 3:
                    metodos.modificarUsuario(pila);
                    break;
                case 4:
                    metodos.venderCredito(pila);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 5);
        sc.close();
    }
}