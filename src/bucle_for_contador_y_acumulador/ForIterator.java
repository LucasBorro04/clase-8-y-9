package bucle_for_contador_y_acumulador;

public class ForIterator {
    public static void main(String args[]) {
        int contador;
        int suma= 0;
        for(contador = 0; contador <= 5; contador++) {
            System.out.println("contador:[" + contador + "]");
            suma = suma + contador;
        }
        System.out.println("La suma del acumulador es:" + suma);
    }
}
