public class PersonaAcademica {

    protected String codigo;
    protected String nombre;
    protected int edad;

    public PersonaAcademica(String codigo, String nombre, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        setEdad(edad);
    }

    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida, se asigna 18 por defecto.");
            this.edad = 18;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void describirRol() {
        System.out.println("Rol: Persona académica.");
    }

    public double calcularPago() {
        return 0;
    }
}