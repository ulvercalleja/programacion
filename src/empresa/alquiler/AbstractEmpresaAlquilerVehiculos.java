package empresa.alquiler;

import java.util.ArrayList;

abstract public class AbstractEmpresaAlquilerVehiculos {
  String nombre;
  String nif;
  ArrayList<AbstractCliente> clientes;
  ArrayList<AbstractVehiculoAlquiler> vehiculos;
  ArrayList<AbstractAlquiler> alquileres;

  public AbstractEmpresaAlquilerVehiculos(String nombre, String nif) {
    this.nombre = nombre;
    this.nif = nif;
    clientes = new ArrayList<AbstractCliente>();
    vehiculos = new ArrayList<AbstractVehiculoAlquiler>();
    alquileres = new ArrayList<AbstractAlquiler>();
  }

  @Override
  abstract public String toString();

}
