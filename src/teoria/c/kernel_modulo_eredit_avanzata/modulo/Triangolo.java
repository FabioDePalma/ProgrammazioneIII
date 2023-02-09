package teoria.c.kernel_modulo_eredit_avanzata.modulo;

import teoria.c.kernel_modulo_eredit_avanzata.kernel.Poligono;

public class Triangolo implements Poligono {
    private double base;
    private double altezza;
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    public double getArea() {
        return base * altezza / 2;
    }
}
