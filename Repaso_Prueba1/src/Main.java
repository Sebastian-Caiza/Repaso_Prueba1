import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el codigo unico: ");
        String codigo = sc.nextLine();
        System.out.print("Ingrese el promedio: ");
        double promedio = sc.nextDouble();
        System.out.print("Ingrese el valor de la matricula: ");
        double valorMatricula = sc.nextDouble();
        System.out.print("Ingrese el pocentaje de la beca: ");
        double descuentBeca = sc.nextDouble();
        sc.nextLine();

        Estudiante e1 = new EstudianteBecado(nombre, codigo, promedio, valorMatricula, descuentBeca);
        e1.mostrarDatos();

    }
}