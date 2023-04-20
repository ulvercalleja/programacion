package empresa.empresaAlimentos;

import java.time.LocalDate;

public abstract class Productos {
    LocalDate fechaCaducidad;
    String numLote;
    String paisOrigen;
    LocalDate fechaEnvasado;
    
    // Constructor que inicializa los valores de las variables de instancia
    public Productos(String fechaCaducidad, String numLote, String paisOrigen, String fechaEnvasado) {
        // Convierte las cadenas String a objetos LocalDate y los asigna a las variables de instancia
        this.fechaCaducidad = LocalDate.parse(fechaCaducidad);
        this.numLote = numLote;
        this.paisOrigen = paisOrigen;
        this.fechaEnvasado = LocalDate.parse(fechaEnvasado);
    }

    
}