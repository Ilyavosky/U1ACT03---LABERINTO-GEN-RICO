public class BuscadorDeLaberinto<T> {
    private T[][] laberinto;
    private T tesoro;
    private T pared;
    private T caminoVisitado;

    public BuscadorDeLaberinto() {
    }

    public BuscadorDeLaberinto(T[][] laberinto, T tesoro, T pared, T caminoVisitado) {
        this.laberinto = laberinto;
        this.tesoro = tesoro;
        this.pared = pared;
        this.caminoVisitado = caminoVisitado;
    }

    public boolean resolver(int filaInicio, int colInicio){

    }

    private boolean buscarCamino(int fila, int col){
        if (fila < 0 || fila >= laberinto.length) {
            return false;
        } else if (laberinto[fila][col].equals(pared)) {
            return false;
        } else if (laberinto[fila][col].equals(caminoVisitado)) {
            return false;
        } else if (laberinto[fila][col].equals(tesoro)) {
            return true;
        } else if () {

        }
    }
}
