package com.example;

import java.util.Scanner;

public class compracondescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nombre del cliente
        System.out.println("Por favor ingrese su nombre: ");
        String nombre = sc.nextLine();

        // El precio original de un producto

        System.out.println("Por favor ingrese el monto de la compra: ");
        double monto = sc.nextDouble();

        // Cantidad de productos a comprar

        System.out.println("Por favor ingrese la cantidad de productos a comprar: ");
        int cantidad = sc.nextInt();

        // Miembro de de la tienda

        System.out.println("¿Eres miembro de la tienda? (true o false): ");
        boolean miembro = sc.nextBoolean();

        // Operacion

        double totalsindescuento = monto * cantidad;
        double descuento = 0;

        if (totalsindescuento > 100 && miembro == true) {
            descuento = totalsindescuento * 0.15;
        } else if (totalsindescuento > 50 && miembro == false) {
            descuento = totalsindescuento * 0.05;
        } else {
            System.out.println("No hay descuento");

        }

        // Resultados

        System.out.println("Hola " + nombre);
        System.out.format("El total original de la compra es: $%,.0f%n", totalsindescuento);
        System.out.format("El descuento es: $%,.0f%n", descuento);
        System.out.format("El total a pagar es: $%,.0f%n", (totalsindescuento - descuento));

    }
}