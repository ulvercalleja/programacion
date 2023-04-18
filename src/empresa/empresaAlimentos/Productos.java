package empresa.empresaAlimentos;

public abstract class Productos {
    String fechaCaducidad;
    int numLote;
    String paisOrigen;
    public Productos(String fechaCaducidad, int numLote, String paisOrigen) {
        this.fechaCaducidad = fechaCaducidad;
        this.numLote = numLote;
        this.paisOrigen = paisOrigen;
    }

    
}