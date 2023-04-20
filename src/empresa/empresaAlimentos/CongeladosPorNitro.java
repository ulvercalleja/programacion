package empresa.empresaAlimentos;

public class CongeladosPorNitro extends ProductosCongelados{

    // Constructor que inicializa los valores de las variables de instancia utilizando el constructor de la superclase
    public CongeladosPorNitro(String fechaCaducidad, String numLote, String paisOrigen, String fechaEnvasado,
    float tempMantenimiento) {
        // Llama al constructor de la superclase para inicializar las variables de instancia heredadas
        super(fechaCaducidad, numLote, paisOrigen, fechaEnvasado, tempMantenimiento);
    }
    String métodoCongelación;
    String tiempoExposición;
}
