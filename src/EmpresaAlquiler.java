import java.util.ArrayList;
import java.util.List;

public class EmpresaAlquiler {

    private List<Vehiculo> flota;

    public EmpresaAlquiler() {
        this.flota = new ArrayList<>();
    }

    /*
    ◦ void agregarVehiculo(Vehiculo v)
◦ Vehiculo buscarVehiculo(String matricula)
◦ boolean eliminarVehiculo(String matricula)
◦ double calcularKilometrosTotales() → debe recorrer la lista y usar calcularKilometros()
     */

    public Vehiculo buscarVehiculo(String matriculaBuscada) {
        Vehiculo vehiculoEncontrado = null;
        Vehiculo temporal;
        int posicion = 0;
        int cantidad = flota.size();

        while( cantidad > 0 && vehiculoEncontrado == null && posicion < cantidad ){
            temporal = flota.get(posicion);
            if( temporal.getMatricula().equalsIgnoreCase( matriculaBuscada )) {
                vehiculoEncontrado = temporal;
            }
            posicion++;
        }

        return vehiculoEncontrado;
    }

    public boolean agregarVehiculo(Vehiculo vehiculoNuevo){
        //Vehiculo temporal = null;
        boolean resultado = false;

        //temporal = buscarVehiculo(vehiculoNuevo.getMatricula());

        //if( temporal == null ){
        if( buscarVehiculo(vehiculoNuevo.getMatricula()) == null ){
            flota.add(vehiculoNuevo);
            resultado = true;
        }

        return resultado;
    }

    public Vehiculo eliminarVehiculo(String matricula) {
        Vehiculo resultado;

        resultado = buscarVehiculo(matricula);

        if( resultado != null ){
            flota.remove(resultado);
        }

        return resultado;
    }

    public double calcularKilometrosTotales(){
        double totalKm = 0;

        for (Vehiculo v : flota ){
            totalKm += v.getKm();
        }

        return totalKm;
    }
}
