public class RegularConRecargo extends EstudianteRegular {
    private double recargoPendiente;

    public RegularConRecargo(String codigo, String nombre, double promedio, double valorMatricula, int numeroMaterias, double recargoPendiente) {
        super(codigo, nombre, promedio, valorMatricula, numeroMaterias);
        setRecargoPendiente(recargoPendiente);
    }

    public void setRecargoPendiente(double recargoPendiente) {
        if (recargoPendiente >= 0) {
            this.recargoPendiente = recargoPendiente;
        } else {
            System.out.println("✖️ Error! El recargo no puede ser negativo");
        }
    }

    @Override
    public double calcularPagoFinal() {
        return super.calcularPagoFinal() + recargoPendiente;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Recargo Aplicado: " + recargoPendiente + "$");
    }
}