package parcial_1;

import java.util.List;
import java.util.ArrayList;

public class Parcial_1 {

    public static void main(String[] args) {
        GremioAventureros gremio = new GremioAventureros("Guardianes de Eldoria");

        gremio.agregarAventurero(new Guerreros("G-01", "Arin", Rangos.ORO, 30));
        gremio.agregarAventurero(new Magos("M-02", "Lyra", Rangos.PLATA, 45));
        gremio.agregarAventurero(new Arqueros("A-03", "Nox", Rangos.BRONCE, 18));
        gremio.agregarAventurero(new Guerreros("G-04", "Borin", Rangos.PLATA, 20));
        gremio.agregarAventurero(new Magos("G-01", "Arin", Rangos.BRONCE, 99));

        System.out.println("Aventureros registrados:");
        mostrarAventureros(gremio.obtenerAventureros());
        System.out.println("\nAtaques:");
        mostrarAtaques(gremio.obtenerAventureros());
        System.out.println("\nEntrenamientos:");
        mostrarEntrenamientos(gremio.obtenerAventureros());
        System.out.println("\nPoder de combate:");
        mostrarPoderes(gremio.obtenerAventureros());
        System.out.println("\nAventureros de rango PLATA:");
        mostrarAventureros(gremio.filtrarPorRango(Rangos.PLATA));
        System.out.println("\nAventureros con poder >= 55:");
        mostrarAventureros(gremio.obtenerAventurerosPoderosos(55));
    }

    private static void mostrarAventureros(List<Aventurero> aventureros) {
        for (Aventurero a : aventureros) {
            System.out.println("Codigo:" + a.getCodigo() + " Nombre:" + a.getNombre() + " Rango:" + a.getRango());
        }
    }

    private static void mostrarAtaques(List<Aventurero> aventureros) {
        for (Aventurero a : aventureros) {
            a.realizarAtaque();
        }
    }

    private static void mostrarEntrenamientos(List<Aventurero> aventureros) {
        for (Aventurero a : aventureros) {
            if (a instanceof Entrenamientos){
                ((Entrenamientos) a).entrenar();
            }
        }
    }

    private static void mostrarPoderes(List<Aventurero> aventureros) {
        for (Aventurero a : aventureros){
            a.calcularPoder();
        }
    }
}
