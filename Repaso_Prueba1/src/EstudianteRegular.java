public class EstudianteRegular extends Estudiante {

    private int numeroMaterias;

    public EstudianteRegular(String codigo, String nombre, double promedio, double valorMatricula, int numeroMaterias) {
        super(codigo, nombre, promedio, valorMatricula);
        setNumeroMaterias(numeroMaterias);
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        if (numeroMaterias > 0) {
            this.numeroMaterias = numeroMaterias;
        } else {
            System.out.println("✖️ Error! El número de materias debe ser mayor a 0");
        }
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() + (numeroMaterias * 10);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de Materias: " + numeroMaterias);
        System.out.println("Pago Final: " + String.format("%.2f", calcularPagoFinal()) + "$");
    }
}