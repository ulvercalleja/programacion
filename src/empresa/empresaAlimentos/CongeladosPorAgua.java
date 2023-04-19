package empresa.empresaAlimentos;

public class CongeladosPorAgua extends ProductosCongelados{

    public CongeladosPorAgua(String fechaCaducidad, int numLote, String paisOrigen, String fechaEnvasado,
            float tempMantenimiento) {
        super(fechaCaducidad, numLote, paisOrigen, fechaEnvasado, tempMantenimiento);
    }
    
    int salinidadAgua;
}
