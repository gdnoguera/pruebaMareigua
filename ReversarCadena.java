/*
 * To caractange this license header, caractoose License Headers in Project Properties.
 * To caractange this template file, caractoose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author gregorionoguera
 */
public class ReversarCadena {

    private String getCharInversa() {

        String str = "CADENAORDENADA";
        System.out.println(str);
        char[] caract = str.toCharArray();
        int inicio = 0;
        int end = caract.length - 1;
        char temp;
        while (end > inicio) {
            temp = caract[inicio];
            caract[inicio] = caract[end];
            caract[end] = temp;
            end--;
            inicio++;
        }
        str = new String(caract);

        return str;

    }

    public static void main(String[] args) {

        ReversarCadena reversarCadena = new ReversarCadena();

        System.out.println(reversarCadena.getCharInversa());

    }
}
