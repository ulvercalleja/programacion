package empresa.empresaAlimentos;

import java.time.LocalDate;

public class ProductosRefrigerados extends Productos {
    
    // Constructor que inicializa los valores de las variables de instancia utilizando el constructor de la superclase
    public ProductosRefrigerados(String fechaCaducidad, String numLote, String paisOrigen,
    String fechaEnvasado, float tempMantenimiento, String codigoSupervision) {
        // Llama al constructor de la superclase para inicializar las variables de instancia heredadas
        super(fechaCaducidad, numLote, paisOrigen, fechaEnvasado);
        this.fechaEnvasado = LocalDate.parse(fechaEnvasado);
        this.tempMantenimiento = tempMantenimiento;
        this.codigoSupervision = codigoSupervision;
    }

    float tempMantenimiento;
    String codigoSupervision;
}