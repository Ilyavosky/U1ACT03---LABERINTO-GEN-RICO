public class BuscadorDeLaberinto<T> {
    private T[][] laberinto;
    private T tesoro;
    private T pared;
    private T camino;
    private T caminoVisitado;


    public BuscadorDeLaberinto() {
    }

    public BuscadorDeLaberinto(T[][] laberinto, T tesoro, T pared, T camino ,T caminoVisitado) {
        this.laberinto = laberinto;
        this.tesoro = tesoro;
        this.pared = pared;
        this.camino = camino;
        this.caminoVisitado = caminoVisitado;

    }

    public boolean resolver(int filaInicio, int colInicio){
        return buscarCamino(filaInicio, colInicio);
    }

    private boolean buscarCamino(int fila, int col){
        if (fila < 0 || fila >= laberinto.length || col <0 || col >= laberinto[0].length) {
            return false;
        } else if (laberinto[fila][col].equals(pared) || laberinto[fila][col].equals(caminoVisitado)) {
            return false;
        } else if (laberinto[fila][col].equals(tesoro)) {
            return true;
        }
        laberinto[fila][col] = caminoVisitado;

        boolean encontrado = buscarCamino(fila + 1, col);

        if (!encontrado){
            encontrado = buscarCamino(fila, col + 1);
        }
        if (!encontrado) {
            encontrado = buscarCamino(fila - 1, col);
        }
        if (!encontrado) {
            encontrado = buscarCamino(fila, col - 1);
        }
        if (!encontrado) {
            laberinto[fila][col] = camino;
        }
        return encontrado;
    }
}
