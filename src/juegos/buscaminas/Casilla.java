package juegos.buscaminas;

public class Casilla {
    boolean estaDescubierta;
    boolean esMina;
    boolean tieneBandera;
    int numMinasAdyacentes;

    /**
     * Devuelve caracteres que representan la Casilla como un asterisco
     * (*).
     * Esto se utiliza para mostrar el tablero cuando se imprime en
     * la consola, si no imprimia la direccion de memoria ("Casilla@27973e9b...").
     */
    public String toString() {
        
        if (estaDescubierta=true){
            return Integer.toString(numMinasAdyacentes);
        }else return "*";
    }
    
    public boolean getEsMina() {
        return esMina;
    }

    public void setEsMina(boolean esMina) {
        this.esMina = esMina;
    }

    public int getNumMinasAdyacentes() {
        return numMinasAdyacentes;
    }

    public void setNumMinasAdyacentes(int numMinasAdyacentes) {
        this.numMinasAdyacentes = numMinasAdyacentes;
    }

    public boolean getEstaDescubierta() {
        return estaDescubierta;
    }

    public void setEstaDescubierta(boolean estaDescubierta) {
        this.estaDescubierta = estaDescubierta;
    }

    
}