package empresa.empresaAlimentos;

public abstract class ProductosCongelados extends Productos{
    
    // Constructor que inicializa los valores de las variables de instancia utilizando el constructor de la superclase
    public ProductosCongelados(String fechaCaducidad, String numLote, String paisOrigen, String fechaEnvasado,
    float tempMantenimiento) {
        // Llama al constructor de la superclase para inicializar las variables de instancia heredadas
        super(fechaCaducidad, numLote, paisOrigen, fechaEnvasado);
        this.tempMantenimiento = tempMantenimiento;
    }
    float tempMantenimiento;
}