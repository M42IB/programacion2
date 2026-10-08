public final class TanqueDeCombustible {

    private double capacidad;
    private double nivel;

    public TanqueDeCombustible(double capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0");
        }
        this.capacidad = capacidad;
        this.nivel = 0.0;
    }

    public double capacidad() {
        return capacidad;
    }

    public double nivel() {
        return nivel;
    }

    public boolean estaVacio() {
        return nivel == 0.0;
    }

    public double porcentaje() {
        return (nivel / capacidad) * 100.0;
    }

    public double llenar(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        if (nivel + cantidad > capacidad) {
            double sobrante = (nivel + cantidad) - capacidad;
            nivel = capacidad;
            return sobrante;
        } else {
            nivel += cantidad;
            return 0.0;
        }
    }

    public boolean consumir(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        if (cantidad <= nivel) {
            nivel -= cantidad;
            return true;
        }
        return false;
    }
}
