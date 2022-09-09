

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Automovil automovil = new Automovil();
        Hija hija = new Hija();
        Esposa esposa = new Esposa();
        Perro perro = new Perro();

        persona.setEdad(37);
        persona.setNombre("Michel Montero");
        persona.setTelefono(981432456);

        System.out.println("Mi edad es :" + persona.getEdad());
        System.out.println("Mi nombre es :" + persona.getNombre());
        System.out.println("Mi telefono es :" + persona.getTelefono());
        System.out.println("_________________________________________");

        esposa.setNombre("Karen Rodrgiguz");
        esposa.setEdad(33);
        esposa.setProfesion("Enfermera");

        System.out.println("El nombre de mi esposa es : " + esposa.getNombre());
        System.out.println("Ella tiene : " + esposa.getEdad() + " Años ");
        System.out.println("Ella es : " + esposa.getProfesion());
        System.out.println("__________________________________________________");

        hija.setNombre("Celeste Montero");
        hija.setEdad(8);
        hija.setAltura(1.21f);
        hija.setCurso("3° C");

        System.out.println("El nombre de mi hija es : " + hija.getNombre());
        System.out.println("La edad de mi hija es :" + hija.getEdad());
        System.out.println("La altura de mi hija es : " + hija.getAltura() + " metros.");
        System.out.println("Mi hija va en : " + hija.getCurso());
        System.out.println("__________________________________________________");

        perro.setNombre("Manchis o Manchas");
        perro.setEdad(4);
        perro.setRaza("Quiltro");
        perro.setColor("Manchado con blanco y negro");

        System.out.println("Tengo un perro se llama : " + perro.getNombre());
        System.out.println("Tiene : " + perro.getEdad() + "Años humanos");
        System.out.println("No tiene raza por eso es : " + perro.getRaza());
        System.out.println("Su color es : " + perro.getColor());
        System.out.println("__________________________________________________");


        automovil.setModelo("Hatchback Sport");
        automovil.setMarca("Nissan Tiida");
        automovil.setAño(2012);

        System.out.println("El modelo de mi auto es :" + automovil.getModelo());
        System.out.println("La marca de mi auto es :" + automovil.getMarca());
        System.out.println("EL año de este es de el :" + automovil.getAño());

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
