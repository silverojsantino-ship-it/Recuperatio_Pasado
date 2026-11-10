package parcial_1;

public class Guerreros extends Aventurero implements Entrenamientos {

    private int fuerza;

    public Guerreros(String codigo, String nombre, Rangos rango, int fuerza) {
        super(codigo, nombre, rango);
        this.fuerza = fuerza;
    }

    @Override
    public void realizarAtaque() {
        System.out.println("El guerrero realiza un ataque");
    }

    @Override
    public double calcularPoder() {
        return fuerza * 2;
    }

    private void validarFuerza(int fuerza) {
        if (fuerza <= 0) {
            throw new IllegalArgumentException("La fuerza debe ser mayor a 0");
        }
    }
    
    
    @Override
    public void entrenar(){
        System.out.println("El guerrero esta entrenando");
    }
    
    
}
