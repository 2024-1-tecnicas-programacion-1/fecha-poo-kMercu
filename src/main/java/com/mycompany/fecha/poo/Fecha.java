package com.mycompany.fecha.poo;

public class Fecha {
    private int day;
    private int month;
    private int year;

    // Constructor de la clase Fecha
    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.month = month;
    }

    /**
     * Complejidad temporal: O(1) - tiempo constante.
     */
    public String fechaCorta() {
        return day + "/" + month + "/" + year;
    }

    /**
     * Complejidad temporal: O(1) - tiempo constante.
     */
    public boolean validarFecha() {
        if (month < 1 && month > 12) return false;
        if (day < 1 && day > 31) return false;
        if (month == 2 && day > 29) return false;
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) return false;
        // Año bisiesto simple, sin verificar años múltiplos de 100 no divisibles por 400
        if (month == 2 && day == 29 && (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))) return false;
        return true;
    }

    /**
     * Complejidad temporal: O(1) - tiempo constante.
     */
    public String mesLetra() {
        String[] months = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
                          "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return months[month - 1];
    }

    /**
     * Complejidad temporal: O(1) - tiempo constante.
     */
    public String fechaLarga() {
        return day + " de " + mesLetra() + " de " + year;
    }
}