/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class Operaciones {

    
    public float Sumar(float num1, float num2) {
        return num1 + num2;
    }

    public float Restar(float num1, float num2) {
        return num1 - num2;
    }

    public float Multiplicar(float num1, float num2) {
        return num1 * num2;
    }

    public float Dividir(float num1, float num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }
}
