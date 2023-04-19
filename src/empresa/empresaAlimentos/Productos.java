package empresa.empresaAlimentos;

import java.time.LocalDate;

public abstract class Productos {
    LocalDate fechaCaducidad;
    int numLote;
    String paisOrigen;
    LocalDate fechaEnvasado;

    public Productos(String fechaCaducidad, int numLote, String paisOrigen, String fechaEnvasado) {
        this.fechaCaducidad = LocalDate.parse(fechaCaducidad);
        this.numLote = numLote;
        this.paisOrigen = paisOrigen;
        this.fechaEnvasado = LocalDate.parse(fechaEnvasado);
    }

    
}