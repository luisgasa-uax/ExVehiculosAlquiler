public abstract class Vehiculo {

    private String matricula;
    private String marca;
    private int km;

    public Vehiculo(String matricula, String marca, int km) {
        this.matricula = matricula;
        this.marca = marca;
        this.km = km;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", km=" + km;
    }

    public abstract double calcularKilometros();
}
