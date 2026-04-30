public class EstudianteBecado extends Estudiante {

    private double porcentajeBeca;

    public EstudianteBecado(String codigo, String nombre, double promedio, double valorMatricula, double porcentajeBeca) {
        super(codigo, nombre, promedio, valorMatricula);
        setPorcentajeBeca(porcentajeBeca);
    }

    public void setPorcentajeBeca(double porcentajeBeca) {
        if (porcentajeBeca >= 0 && porcentajeBeca <= 100) {
            this.porcentajeBeca = porcentajeBeca;
        }
        else{
                System.out.println("️✖️ Error! Porcentaje invalido");
            }
    }

    @Override
    public double calcularPagoFinal(){
        double descuento = getValorMatricula() * (porcentajeBeca/100);
        return getValorMatricula() - descuento;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Pago Final: " + String.format("%.2f",calcularPagoFinal()) + "$");

    }

}
