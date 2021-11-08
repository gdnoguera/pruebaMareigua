/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author gregorionoguera
 */
public class EnteroPositivo {

    private Integer getNumMayor() {
        Integer[] arreglo = new Integer[]{24, 53, 60, 468, 220, 8, 93,
            54, 5, 34, 67, 7, 34, 343, 465, 227, 78, 9, 44, 100, 153};
        Integer mayor = arreglo[0];
        for (int x = 1; x < arreglo.length; x++) {
            if (arreglo[x] > mayor) {
                mayor = arreglo[x];
            }
        }

        return mayor;
    }

    public static void main(String args[]) {
        EnteroPositivo enteroPositivo = new EnteroPositivo();

        System.out.println("El mayor es: " + enteroPositivo.getNumMayor());

    }

}
