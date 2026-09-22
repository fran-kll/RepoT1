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
        
        
    }
    
}
