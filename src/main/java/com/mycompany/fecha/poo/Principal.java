package com.mycompany.fecha.poo;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el día:");
        int day = sc.nextInt();
        System.out.println("Ingrese el mes:");
        int month = sc.nextInt();
        System.out.println("Ingrese el año:");
        int yar = sc.nextInt();

        Fecha fecha = new Fecha(day, month, year);
        if (fecha.validarFecha()) {
            System.out.println("La fecha es válida.");
            System.out.println("Fecha corta: " + fecha.fechaCorta());
            System.out.println("Fecha larga: " + fecha.fechaLarga());
        } else {
            System.out.println("Fecha no válida.");
        }
    }
}
