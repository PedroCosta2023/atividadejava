import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] n = new int[10];
        n[0] = -1;
        n[1] = 8;
        n[2] = 9;
        n[3] = -5;
        n[4] = -6;
        n[5] = -7;
        n[6] = -8;
        n[7] = -9;
        n[8] = -1;
        n[9] = 10;

        String[] palavras = new String[]{"p", "pa", "pal", "pala", "palav", "palavr", "palavra", "palavras"};

        Numeros.getNumerosPositivos(new int[]{-1, 2, 3, 4,-6});

        System.out.println(Arrays.toString(Numeros.getNumerosPositivos(new int[]{-1, 2, 3, 4,-6})));

        System.out.println(Numeros.getMaiorNumero(n));

        System.out.println(Numeros.maiorPalavra(palavras));



    }
}