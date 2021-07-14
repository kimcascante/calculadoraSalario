package Semana2;

import java.io.PrintStream;

/**
 * Nombre del programa: Ejercicio 1 Semana 2
 * Descripcion: Calcular el salario diario de una persona que gana 25 dólares la hora y trabaja un turno
    de 8 horas al día. 
 * Autor: Kimberly C.
 * Fecha de creacion: 9-6-2020
 * Modificado por:
 * fecha de modificacion:
 */

public class ej1w2 {

    public static PrintStream imprimir = System.out;

    public static void main(String[] args) {
    
    //Definicion de variables
    float salario;
    float horasTrabajadas;
    float salarioHora;

    //Definicion de datos
    salarioHora = 25;
    horasTrabajadas = 8;
    salario = (salarioHora * horasTrabajadas);

    //Imprime el salario diario del empleado
    imprimir.println(salario);

    }
}