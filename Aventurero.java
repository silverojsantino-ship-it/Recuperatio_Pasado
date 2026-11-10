package parcial_1;

public abstract class Aventurero {

    private String codigo;
    private String nombre;
    private Rangos rango;

    public Aventurero(String codigo, String nombre, Rangos rango) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.rango = rango;
    }

    public abstract void realizarAtaque();

    public abstract double calcularPoder();
    
    
    private void validarCodigoyNombre(String codigo, String nombre){
        if ((codigo == null || codigo.isBlank()) ||
            (nombre == null || nombre.isBlank())){
            throw new IllegalArgumentException("No pueden haber espacios vacios");
        }
    }
    
    private void validarRango(Rangos rango){
        if (rango == null){
            throw new IllegalArgumentException("El rango debe ser obligatorio");
        }
    }
    
    public void validarParametros(){
        validarCodigoyNombre(codigo, nombre);
        validarRango(rango);
    }

    public Rangos getRango() {
        return rango;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
