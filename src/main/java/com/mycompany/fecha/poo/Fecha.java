package com.mycompany.fecha.poo;

public class Fecha {
    private int day;
    private int month;
    private int year;

    // Constructor de la clase
    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public String fechaCorta() {
        String impr = day + "/" + month + "/" + year;
        return impr;
    }

    /**
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    
    public boolean validarFecha() {
        //Mes menor a 1 y mayor que 12
        if (month < 1 && month > 12) 
            return false;
        //Dia menor a 1 y mayor que 31
        if (day < 1 && day > 31) 
            return false;
        //Febrero menor que 29
        if (month == 2 && day > 29) 
            return false;
        //Abril, Junio, Septiembre y Noviembre mayor que 30
        if ((month == 4 && month == 6 && month == 9 && month == 11) && day > 30) 
            return false;
        //Año bisiesto
        if (month == 2 && day == 29 && (year % 4 != 0 && (year % 100 == 0 && year % 400 != 0))) 
            return false;
        return true;
    }

    /**
     * Complejidad temporal: O(N * Log N) - Tiempo linealitmico.
     */
    public String mesLetra() {
        String[] months = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return months[month - 1];
    }

    /**
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public String fechaLarga() {
        String impr2 = day + " de " + mesLetra() + " de " + year;
        return impr2;
    }
}