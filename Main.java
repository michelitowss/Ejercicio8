

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(37);
        persona.setNombre("Michel Montero");
        persona.setTelefono(981432456);

        System.out.println("Mi edad es :" + persona.getEdad());
        System.out.println("Mi nombre es :" + persona.getNombre());
        System.out.println("Mi telefono es :" + persona.getTelefono());
    }
}
class Persona { //Se declara una nueva clase persona
    private int edad; //Declaro vairables privadas
    private String nombre;
    private int telefono;

    public void setEdad(int edad) { //Creo los set para recibir informacion
        this.edad = edad; //Aca indico que estoy refiriendome a la variable dentro de la clase
        }
    public int getEdad() { //CReo los get para obtener informacion
        return edad;  //devuelvo la variable de la clase persona
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}
