package empresa.empresaAlimentos;

import java.time.LocalDate;

public class ProductosFrescos extends Productos{

    public ProductosFrescos(String fechaCaducidad, int numLote, String paisOrigen, String fechaEnvasado) {
        super(fechaCaducidad, numLote, paisOrigen, fechaEnvasado);
        this.fechaEnvasado = LocalDate.parse(fechaEnvasado);
    }

}