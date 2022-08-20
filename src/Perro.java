import java.util.Random;

public class Perro {
    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    private  String apodo;

    Random rand = new Random();

    public float getAnimo() {
        return animo;
    }

    public void setAnimo(float animo) {
        this.animo = animo;
    }
    private float animo;

    public float getUmbral() {
        return umbral;
    }

    public void setUmbral(float umbral) {
        this.umbral = umbral;
    }
    private float umbral;

    public void psican(Persona p){
        this.animo = (1.0f/p.getConfiabilidad()) * (rand.nextFloat()-0.5f) * 10 + this.animo;
        if (p.tieneGalleta()){
            p.darGalleta();
            this.animo += (1.0/p.getConfiabilidad()) * (rand.nextInt(2));
        }
        System.out.println("Mi nuevo animo es: " + animo);
    }
}