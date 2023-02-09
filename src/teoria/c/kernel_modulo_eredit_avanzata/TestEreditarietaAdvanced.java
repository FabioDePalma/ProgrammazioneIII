package teoria.c.kernel_modulo_eredit_avanzata;

import teoria.c.kernel_modulo_eredit_avanzata.kernel.Prisma;
import teoria.c.kernel_modulo_eredit_avanzata.modulo.Rettangolo;
import teoria.c.kernel_modulo_eredit_avanzata.modulo.Triangolo;

public class TestEreditarietaAdvanced {
    public static void main(String[] args) {
        Prisma p1 = new Prisma(new Triangolo(2, 3), 4);
        System.out.println("volume del prisma: " + p1.getVolume());
        Prisma p2 = new Prisma(new Rettangolo(2, 3), 4);
        System.out.println("volume del prisma: " + p2.getVolume());
    }
}
