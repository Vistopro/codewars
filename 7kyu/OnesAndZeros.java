//Given an array of ones and zeroes, convert the equivalent binary value to an integer.

import java.util.ArrayList;
import java.util.List;

public class OnesAndZeros {

    public static void main(String[] args) {
        // Crear una lista de enteros y añadir valores a la misma
        List<Integer> lista= new ArrayList<>();
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);

        // Imprimir el valor entero equivalente a la lista binaria utilizando el método de la clase BinaryArrayToNumber
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(lista));
    }
}

class BinaryArrayToNumber {
    // Método para convertir una lista de enteros binarios en un número entero
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Inicializar un contador para el valor entero
        int n=0;

        // Recorrer la lista de enteros binarios
        for (int i = 0; i < binary.size(); i++) {
            // Si el valor en la posición i es igual a 1, agregar el valor de la posición i a la suma
            if(binary.get(i)==1){
                // Calcular el valor decimal de la posición i y agregarlo a la suma
                n+= Math.pow(2,(binary.size()-i-1));
            }
        }

        // Devolver el valor entero resultante
        return n;
    }
}
