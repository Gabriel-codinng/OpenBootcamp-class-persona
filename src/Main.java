public class Main {
    public static void main(String[] args) {
        Persona miPersona = new Persona();

        miPersona.setEdad(22);
        miPersona.setTelefono(666666666);
        miPersona.setNombre("Gabriel");

        System.out.println("Me llamo: " + miPersona.getNombre());
        System.out.println("Tengo " + miPersona.getEdad() + " años");
        System.out.println("Mi número de teléfono es: " + miPersona.getTelefono());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    // GETTERS

    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getTelefono(){
        return this.telefono;
    }
}

