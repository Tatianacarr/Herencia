public class DocenteInvestigador extends Docente {

    private int publicaciones;

    public void setPublicaciones(int publicaciones) {
        if (publicaciones >= 0) {
            this.publicaciones = publicaciones;
        }
    }

    @Override
    public double calcularPago() {
        double base = super.calcularPago();
        double bono = publicaciones * 20;
        return base + bono;
    }

    // SOBRECARGA
    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente investigador con producción académica.");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Publicaciones: " + publicaciones);
    }
}