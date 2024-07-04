package parcial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class SistemaDeBicicletas {
    private List<Estacion> estaciones;

    public SistemaDeBicicletas() {
        estaciones = new ArrayList<>();
    }

    public void agregarEstacion(Estacion estacion) {
        estaciones.add(estacion);
    }

    public List<Estacion> consultarEstacionesConBicicletasDisponibles() {
        return estaciones.stream()
                         .filter(Estacion::tieneBicicletasDisponibles)
                         .collect(Collectors.toList());
    }

    public List<Estacion> consultarEstacionesConEstacionamientosDisponibles() {
        List<Estacion> estacionesConEstacionamientos = new ArrayList<>();
        estaciones.stream()
                  .filter(Estacion::tieneEstacionamientosDisponibles)
                  .forEach(estacionesConEstacionamientos::add);
        return estacionesConEstacionamientos;
    }
}
