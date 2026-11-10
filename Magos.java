
package parcial_1;


public class Magos extends Aventurero{
    private int mana;

    public Magos(String codigo, String nombre, Rangos rango, int mana) {
        super(codigo, nombre, rango);
        this.mana = mana;
    }

    
    
    @Override
    public void realizarAtaque(){
        System.out.println("El mago tira una bola de fuego");
    }
    
    @Override
    public double calcularPoder(){
        return mana + 10;
    }
    
    private void validarMana(int mana){
        if (mana <= 0){
            throw new IllegalArgumentException("EL mana debe ser mayor a 0");
        }
    }
    
    
    
}
