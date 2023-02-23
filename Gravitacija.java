public class Gravitacija {
    public static void izpis(double visina) {
        System.out.prinf("Gravitacijski pospešek na %.2f km nadmorske višine je %.2f m/s^2\n",
		visina, izracunGravitacije(visina * 1000));
    }