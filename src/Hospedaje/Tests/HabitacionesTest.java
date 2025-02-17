package Hospedaje.Tests;

import Hospedaje.Habitaciones.Gestion_Habitaciones;
import Hospedaje.Habitaciones.Habitacion;

import java.util.List;

public class HabitacionesTest {
    public static void main(String[] args) {
        Gestion_Habitaciones gestion_habitaciones = new Gestion_Habitaciones();
        // Habitaciones Totales
        List<Habitacion> habitaciones = gestion_habitaciones.getHabitaciones();
        System.out.println("Habitaciones totales: " + habitaciones.size());
        habitaciones.forEach(habitacion -> {
            System.out.println(habitacion.getInfo());
        });
    }
}
