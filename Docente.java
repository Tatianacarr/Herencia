public class Docente extends PersonaAcademica {

    protected int horasClase;
    protected double valorHora;

    public void setHorasClase(int horasClase) {
        if (horasClase >= 1 && horasClase <= 40) {
            this.horasClase = horasClase;
        }
    }

    public void setValorHora(double valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;
        }
    }

    public int getHorasClase() {
        return horasClase;
    }

    @Override
    public double calcularPago() {
        return horasClase * valorHora;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente.");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Horas de clase: " + horasClase);
        System.out.println("Valor por hora: " + valorHora);
    }
}