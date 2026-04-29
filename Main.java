import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DocenteInvestigador obj = new DocenteInvestigador();

        System.out.print("Código: ");
        obj.setCodigo(sc.nextLine());

        System.out.print("Nombre: ");
        obj.setNombre(sc.nextLine());

        System.out.print("Edad: ");
        obj.setEdad(sc.nextInt());

        System.out.print("Horas de clase: ");
        obj.setHorasClase(sc.nextInt());

        System.out.print("Valor por hora: ");
        obj.setValorHora(sc.nextDouble());

        System.out.print("Publicaciones: ");
        obj.setPublicaciones(sc.nextInt());

        // 🔥 POLIMORFISMO
        PersonaAcademica persona = obj;

        System.out.println("\n--- RESULTADO ---");

        persona.mostrarDatos();
        persona.describirRol();

        System.out.println("Pago final: $" + persona.calcularPago());

        // método sobrecargado
        System.out.println("Pago con bono extra: $" + obj.calcularPago(50));
    }
}
