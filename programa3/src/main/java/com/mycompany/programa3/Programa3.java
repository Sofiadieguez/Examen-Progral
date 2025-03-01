/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa3;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Programa3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();
        
        
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        
        scanner.close();
    }
}
