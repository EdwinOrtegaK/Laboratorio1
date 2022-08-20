import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;
public class DriverProgram {
    static boolean supmenu;
    Persona amigos;
    Perro perros;
    public static void main(String[] args) {
        supmenu = true;
        while (supmenu) {
            System.out.println("===Bienvenido a la Perrera===");
            System.out.println("¿Qué quieres realizar?\n1. Nuevo Amigo\n2. Nuevo Perro\n3. Dar Galleta\n4. Interactuar\n5. Salir");
            Scanner ktp = new Scanner(System.in);
            int opcion = ktp.nextInt();
            ktp.close();
            if (opcion == 1) {
                amigo();
            } if (opcion == 2){
                perro();
            } if (opcion == 3){
                galleta(amigo(), perro());
            } if (opcion == 4){
                interactuar(amigo(), perro());
            } if (opcion == 5){
                salir();
                supmenu = false;
            }
        }
    }
    public static Persona amigo() {
        Scanner pop = new Scanner(System.in);
        Persona amigos = new Persona();
        System.out.println("Ingrese el nombre del nuevo amigo:");
        String gop = pop.nextLine();
        amigos.setNombre(gop);
        pop.close();
        return amigos;
    }
    public static Perro perro(){
        Scanner jop = new Scanner(System.in);
        Perro perros = new Perro();
        System.out.println("Ingrese el nombre del nuevo perro:");
        String fop = jop.nextLine();
        perros.setApodo(fop);
        jop.close();
        return perros;
    }
    public static void galleta(Persona personas, Perro perros){
        if (personas.galleta() == 1){
            System.out.println("La persona le dará una galleta al perro");
            perros.setAnimo(perros.getAnimo() + 3);
            System.out.println("El animo del perro ahora es: " + perros.getAnimo());
            personas.darGalleta();
        } if (personas.galleta() != 1){
            System.out.println("La persona no tiene galleta para darle al perro");
        }
    }
    public static void interactuar(Persona personas, Perro perros){
        perros.psican(personas);
        if (perros.getAnimo() < perros.getUmbral()){
            System.out.println("El perro a mordido al voluntario");
        } if((perros.getAnimo()<0)&&(perros.getAnimo()>perros.getUmbral())){
            System.out.println("El perro le ha ladrado al voluntario");
        } if (perros.getAnimo() > 0){
            System.out.println("El perro se encuentra feliz y mueve la cola");
        }
    }
    public static void salir(){
        System.out.println("Gracias por trabajar con nosotros");
    }
}