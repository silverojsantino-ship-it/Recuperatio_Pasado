package parcial_1;


public class Arqueros extends Aventurero implements Entrenamientos{
    private int precision;

    public Arqueros(String codigo, String nombre, Rangos rango, int precision) {
        super(codigo, nombre, rango);
        this.precision = precision;
    }

    @Override
    public void realizarAtaque(){
        System.out.println("El arquero tira una flecha");
    }
    
    @Override
    public double calcularPoder(){
        return precision * 3;
    }
    
    private void validarPrecision(int precision){
        if (precision <= 0){
            throw new IllegalArgumentException("La precision debe ser mayor a 0");
        }
    }
    
    @Override
    public void entrenar(){
        System.out.println("El arquero esta entrenando");
    }
    
    
    
}
