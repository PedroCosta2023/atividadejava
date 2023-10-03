public class Numeros {

    static int[] getNumerosPositivos(int[] numero){
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > 0){
                numero[i] = numero[i];
            }else {
                 numero[i] = 0;
            }
        }
        return numero;
    }

    static int getMaiorNumero(int[] numeros){
        int maiorNumero = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
            }

        }
        return maiorNumero;
    }

    static int soma(int[] numeros){
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
    }

    static String maiorPalavra(String[] palavras){
        String maiorPalavra = "p";
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() > maiorPalavra.length()){
                maiorPalavra = palavras[i];
            }
        }
        return maiorPalavra;
    }

}
