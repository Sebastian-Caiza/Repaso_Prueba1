public class Estudiante {

    private String codigo, nombre;
    private double promedio, valorMatricula;

    public Estudiante(String codigo, String nombre, double promedio, double valorMatricula){
        setCodigo(codigo);
        setNombre(nombre);
        setPromedio(promedio);
        setValorMatricula(valorMatricula);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo != null && !codigo.trim().isEmpty()){
            this.codigo = codigo;
        }
        else{
            System.out.println("✖️ Error! El codigo no puede estar vacio");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }
        else{
            System.out.println("✖️ Error! El nombre no puede estar vacio");
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio >=0 && promedio <=10 ){
            this.promedio = promedio;
        }
        else{
            System.out.println("✖️ Error! Promedio invalido");
        }
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula){
        if (valorMatricula > 0){
            this.valorMatricula = valorMatricula;
        }
        else {
            System.out.println("✖️ Error! Matricula invalida");
        }
    }


    public boolean validarPromedio(){
        return promedio >=0 && promedio <=10;
    }

    public double calcularPagoFinal(){
        return valorMatricula;
    }

    public double calcularPagofinal(double descuentoExtra){
     return calcularPagoFinal() - descuentoExtra;
    }

    public void mostrarDatos(){
        System.out.println("===========");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matricula: " + String.format("%.2f", valorMatricula ) + "$");

    }


}
