public class Main {
    public static void main(String[] args) {
        // ========== Laberinto de Caracteres ==========
        System.out.println("--- Probando Laberinto de Caracteres ---");

        Character pared = '#';
        Character camino = '.';
        Character tesoro = 'T';
        Character inicio = 'I';
        Character visitado = '*';

        Character[][] laberintoChar = {
                {inicio, camino, pared,  camino},
                {pared,  camino, pared,  camino},
                {camino, camino, camino, pared},
                {camino, pared,  tesoro, camino}
        };


        BuscadorDeLaberinto<Character> buscadorChar = new BuscadorDeLaberinto<>(
                laberintoChar, tesoro, pared, camino, visitado
        );

        boolean solucionEncontrada = buscadorChar.resolver(0, 0);

        if (solucionEncontrada) {
            System.out.println("¡Se encontró un camino al tesoro!");
            imprimirLaberinto(laberintoChar);
        } else {
            System.out.println("No se encontró un camino.");
        }

        // ========== Laberinto de Enteros ==========
        System.out.println("--- Probando Laberinto de Enteros ---");
        Integer paredInt = 1;
        Integer caminoInt = 0;
        Integer tesoroInt = 2;
        Integer inicioInt = 3;
        Integer visitadoInt = 4;

        Integer[][] laberintoInteger = {
                {inicioInt, caminoInt, paredInt, caminoInt},
                {paredInt, caminoInt, paredInt, caminoInt},
                {caminoInt, caminoInt, caminoInt, paredInt},
                {caminoInt, paredInt, tesoroInt, caminoInt}
        };

        BuscadorDeLaberinto<Integer> buscadorInteger = new BuscadorDeLaberinto<>(
                laberintoInteger, tesoroInt, paredInt, caminoInt, visitadoInt
        );

        solucionEncontrada = buscadorInteger.resolver(0, 0);

        if (solucionEncontrada) {
            System.out.println("¡Se encontró un camino al tesoro!");
            imprimirLaberinto(laberintoInteger);
        } else{
            System.out.println("No se encontró un camino.");
        }


    }




    public static <T> void imprimirLaberinto(T[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}