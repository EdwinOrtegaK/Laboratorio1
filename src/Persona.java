public class Persona {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String nombre;

    public float getConfiabilidad() {
        return confiabilidad;
    }

    public void setConfiabilidad(float confiabilidad) {
        this.confiabilidad = confiabilidad;
    }
    private float confiabilidad;

    public int galleta() {
        return galleta;
    }

    public void setGalleta(int galleta) {
        this.galleta = galleta;
    }
    private int galleta = 1;
    public boolean tieneGalleta(){
        return 0 < galleta;
    }
    public void darGalleta(){
        galleta -= 1;
    }
}