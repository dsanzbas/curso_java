package Capitulo_5.Ex5_10_11;

public class Multiplicar_Arrays {
    int[] a1 = new int[10];
    int[] a2 = new int[10];
    int[] multiplicacion = new int[10];
    int me_llevo, i = 0;

    public Multiplicar_Arrays(int[] a1, int[] a2) {
        this.a1 = a1;
        this.a2 = a2;
    }
    // Obtener array suma resultante
    public int[] getMulti() {
        return multiplicacion;
    }

    //Matriz multiplicación
    int[][] resultado = new int[a1.length][(a1.length * 2)];

    // Multiplicar arrays
    public void multiplicar_arrays () {
        int i, multi, multiplica = 0;
        int[] dec_uni = new int[2];

        for (i = (a1.length - 1); i >= 0; i--) {
            multiplica = 0;

            for (int j = (a1.length - 1); j >= 0; j-- ) {
                multi = (a2[j] * a1[i]) + me_llevo;
                dec_uni = decUni(multi);
                me_llevo = 0;
                if (dec_uni[1] > 0) {
                    me_llevo = dec_uni[1];
                }
                matriz(dec_uni[2], i, j);
            }
        }
    }
    //Extraer Decenas y Unidades
    public int[] decUni (int i) {
        int unidades = 0;
        int decenas  = 0;
        int [] uniDec = new int[2];

        for (i=0; i < 2; i++) {
            uniDec[i] = 0;
        }

        unidades = (int) i%100;
        decenas  = (int) (i%10);

        uniDec[0] = decenas;
        uniDec[1] = unidades;

        return uniDec;
    }
    //Rellenar matriz
    public void matriz (int i, int fila, int columna) {
        resultado[fila][columna] = i;
    }
}