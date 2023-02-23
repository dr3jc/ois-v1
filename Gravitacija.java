public class Gravitacija {
    
    public static double izracunGravitacije(double visina) {
		double C = 6.674e-11;
		double M = 5.972e24;
		double r = 6.371e6;
		return (C * M) / Math.pow(r + visina, 2.0);
        
    }
}