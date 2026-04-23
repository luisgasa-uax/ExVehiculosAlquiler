public class Moto extends Vehiculo {

    public Moto(String matricula, String marca, int km) {
        super(matricula, marca, km);
    }

    @Override
    public String toString() {
        return "Moto{" +
                super.toString() +
                "}";
    }

    @Override
    public double calcularKilometros() {
        return getKm() * 1.5;
    }
}
