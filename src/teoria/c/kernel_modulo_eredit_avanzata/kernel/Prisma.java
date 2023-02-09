package teoria.c.kernel_modulo_eredit_avanzata.kernel;

public class Prisma {
    private Poligono base;
    private double altezza;
    public Prisma(Poligono base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    public double getVolume() {
        return base.getArea()*altezza;
    }
}