/*
 * Descripción: Nodo no terminal sustracción
 * Fecha: 6/03/2020
 * Versión: 1.0
 */

package interpreter;

/**
 *
 * @author David Armando Rodríguez Varón, Juan Sebastián Sánchez Tabares
 */
public class Substraction implements Expression{

    private Expression num1;
    private Expression num2;

    public Substraction(Expression num1, Expression num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
        
    @Override
    public float interpreter() {
        return this.num1.interpreter()-this.num2.interpreter();
    }

}
