import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Stack<Banco> registraUsuario(Stack<Banco> pila) {
        boolean continuar = true;
        while (continuar) {
            Banco banco = new Banco();
            System.out.println("Ingrese el nombre: ");
            banco.setNombre(sc.next());
            System.out.println("Ingrese la cédula: ");
            banco.setCedula(sc.nextInt());
            System.out.println("Ingrese el tipo de crédito: 1) Libre inversión 2) Educación 3) Vivienda: ");
            banco.setCredito(sc.nextInt());
            System.out.println("Ingrese la cantidad de dinero a prestar: ");
            banco.setCantidad(sc.nextDouble());
            pila.push(banco);

            System.out.println("¿Desea registrar más usuarios? S/N: ");
            String agregar = sc.next();
            if (agregar.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }
        return pila;
    }

    public void mostrarUsuario(Stack<Banco> pila) {
        for (Banco banco : pila) {
            System.out.println("Nombre: " + banco.getNombre());
            System.out.println("Cédula: " + banco.getCedula());
            System.out.println("Tipo de crédito 1) Libre inversión 2) Educación 3) Vivienda: " + banco.getCredito());
            System.out.println("Cantidad de dinero: " + banco.getCredito());
        }

    }

    public Stack<Banco> venderCredito(Stack<Banco> pila) {
        Stack<Banco> pilaAux = new Stack<>();
        pilaAux = pila;
        System.out.println("Ingrese el tipo de crédito 1) Libre inversión 2) Educación 3) Vivienda ");
        int credito = sc.nextInt();
        System.out.println("Ingrese la cédula del usuario: ");
        int cedula = sc.nextInt();
        System.out.println("Ingrese cantidad de dinero: ");
        Double cantidad = sc.nextDouble();

        boolean encontrado = false;
        for (Banco banco : pila) {
            if (banco.getCredito() == credito && banco.getCedula() == cedula) {
                encontrado = true;
                banco.setCantidad(banco.getCantidad() + cantidad);
                System.out.println("Nuevo saldo del usuario: " + cantidad);
            } else {
                System.out.println("...");
            }
            

            if (!encontrado) {
                System.out.println("...");
            }

        }
                return pilaAux;
                
    }

    public void modificarUsuario(Stack<Banco> pila) {
        System.out.println("Modificar por: 1) Nombre 2) Cedula ");
        int opcion = sc.nextInt();
        boolean encontrado = false;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese  el nombre del usuario a modificar: ");
                String nombre = sc.next();
                for (Banco banco : pila) {
                    System.out.println("Ingrese el nuevo nombre: ");
                    banco.setNombre(sc.next());
                    System.out.println("Ingrese la nueva cédula: ");
                    banco.setCedula(sc.nextInt());
                    System.out
                            .println("Ingrese el nuevo tipo de crédito: 1) Libre inversión 2) Educación 3) Vivienda: ");
                    banco.setCredito(sc.nextInt());
                    System.out.println("Ingrese la nueva cantidad de dinero a prestar: ");
                    banco.setCantidad(sc.nextDouble());
                    encontrado = true;
                    break;

                }
                if (!encontrado) {
                    System.out.println("...");
                }
                break;

            case 2:
                System.out.println("Ingrese  la cédula del usuario a modificar: ");
                int cedula = sc.nextInt();
                for (Banco banco : pila) {
                    System.out.println("Ingrese el nuevo nombre: ");
                    banco.setNombre(sc.next());
                    System.out.println("Ingrese la nueva cédula: ");
                    banco.setCedula(sc.nextInt());
                    System.out
                            .println("Ingrese el nuevo tipo de crédito: 1) Libre inversión 2) Educación 3) Vivienda: ");
                    banco.setCredito(sc.nextInt());
                    System.out.println("Ingrese la nueva cantidad de dinero a prestar: ");
                    banco.setCantidad(sc.nextDouble());
                    encontrado = true;
                    break;

                }

        }
    }

}// Fin Clase
