package teoria.i.sincThread.a.interferenze.c.accessoAVariabile;

class C {
    public int i = 0;

    public void m() {
        for (int k = 0; k < 100000; k++)
            i++;
        for (int k = 0; k < 100000; k++)
            i--;
    }
}
