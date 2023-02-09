package teoria.c.kernel_modulo_eredit_avanzata.modulo;

import teoria.c.kernel_modulo_eredit_avanzata.kernel.Poligono;

public class Rettangolo implements Poligono {
    private double base;
    private double altezza;
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    public double getArea() {
        return base * altezza;
    }
}
