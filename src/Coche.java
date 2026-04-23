public class Coche extends Vehiculo {

    public Coche(String matricula, String marca, int km) {
        super(matricula, marca, km);
    }

    @Override
    public double calcularKilometros() {
        return this.getKm();
    }

    @Override
    public String toString() {
        return "Coche{" +
                super.toString() +
                "}";
    }
}
