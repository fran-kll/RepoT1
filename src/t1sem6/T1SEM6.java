/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1sem6;

import java.util.Scanner;

/**
 *
 * @author UCA40418
 */
public class T1SEM6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        // Sistema de registro t1
        //Comentario para hacer un commit porque me falta 1 para los 6
        Scanner sc = new Scanner(System.in);
        AlumnoController ac = new AlumnoController();
        System.out.println("Ingrese el nombre:");
        String n = sc.nextLine();
        System.out.println("Ingrese el apellido paterno:");
        String ap = sc.nextLine();
        System.out.println("Ingrese el apellido materno:");
        String am = sc.nextLine();
        System.out.println("Ingrese el tipo de documento:");
        String td = sc.nextLine();
        System.out.println("Ingrese el número de documento:");
        String nd = sc.nextLine();
        
        while(td.equalsIgnoreCase("DNI") && nd.length() != 8)
        {
            System.out.println("DNI inválido, debe tener 8 dígitos.");
            System.out.println("Ingrese nuevamente el número de documento:");
            nd = sc.nextLine();
        }
        System.out.println("Ingrese el nivel socioeconómico (A, B o C):");
        String ns = sc.nextLine();
        while(!ns.equalsIgnoreCase("A") &&
              !ns.equalsIgnoreCase("B") &&
              !ns.equalsIgnoreCase("C"))
        {
            System.out.println("Nivel inválido. Ingrese A, B o C:");
            ns = sc.nextLine();
        }
        System.out.println("Ingrese el tipo de beca (Parcial o Total):");
        String tb = sc.nextLine();
        while(!tb.equalsIgnoreCase("Parcial") &&
              !tb.equalsIgnoreCase("Total"))
        {
            System.out.println("Beca inválida. Ingrese Parcial o Total:");
            tb = sc.nextLine();
        }
        Alumno a = new Alumno(n, ap, am, td, nd, ns, tb);

        a.validarIdentidad();
        a.validarNivelSocial();
        a.validarBeca();

        ac.agregarAlumno(a);

        System.out.println(" Alumno registrado correctamente");
        ac.listarAlumnos();
    }
    
}
