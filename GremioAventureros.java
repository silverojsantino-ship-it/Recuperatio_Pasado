package parcial_1;

import java.util.ArrayList;
import java.util.List;

public class GremioAventureros {
    private String nombre;
    private ArrayList<Aventurero> aventureros;

    public GremioAventureros(String nombre) {
        this.nombre = nombre;
        this.aventureros = new ArrayList<>();
    }
    
    
    public void agregarAventurero (Aventurero aventurero){
        aventurero.validarParametros();
        
        if (aventureros.contains(aventurero)){
            throw new AventureroDuplicado("No pueden haber aventureros duplicados");
        } else{
            aventureros.add(aventurero);
        }
    }
    
    public ArrayList<Aventurero> obtenerAventureros(){
        return aventureros;
    }
    
    public ArrayList<Aventurero> filtrarPorRango(Rangos rango) {
    ArrayList<Aventurero> filtrados = new ArrayList<>();

    for (Aventurero a : aventureros) {
        if (a.getRango() == rango) {
            filtrados.add(a);
        }
    }

    return filtrados;
}
    
    public ArrayList<Aventurero> obtenerAventurerosPoderosos(int poder){
        ArrayList<Aventurero> filtrados = new ArrayList<>();
        
        for (Aventurero a : aventureros){
            if (a.calcularPoder() >= poder){
                filtrados.add(a);
            }
        }
        return filtrados;
    }
    
    

    
    
    
}
