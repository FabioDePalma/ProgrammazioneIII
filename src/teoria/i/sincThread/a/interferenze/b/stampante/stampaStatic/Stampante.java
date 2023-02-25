package teoria.i.sincThread.a.interferenze.b.stampante.stampaStatic;

class Stampante {

    public static void stampa(String[] a) {
        for (int i = 0; i < a.length; i++) {
            try {
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(a[i]);
        }
    }
}
