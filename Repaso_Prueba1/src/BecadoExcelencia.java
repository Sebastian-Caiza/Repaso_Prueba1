public class BecadoExcelencia extends EstudianteBecado {

    private double bonoExcelencia;

    public BecadoExcelencia(String codigo, String nombre, double promedio, double valorMatricula, double porcentajeBeca, double bonoExcelencia) {
        super(codigo, nombre, promedio, valorMatricula, porcentajeBeca);
        setBonoExcelencia(bonoExcelencia);
    }

    public double getBonoExcelencia() {
        return bonoExcelencia;
    }

    public void setBonoExcelencia(double bonoExcelencia) {
        if (bonoExcelencia >= 0) {
            this.bonoExcelencia = bonoExcelencia;
        } else {
            System.out.println("✖️ Error! El bono no puede ser negativo");
        }
    }

    @Override
    public double calcularPagoFinal() {
        double pagoConBeca = super.calcularPagoFinal();
        double total = pagoConBeca - bonoExcelencia;
        return Math.max(0, total);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Bono Excelencia: " + bonoExcelencia + "$");
    }
}