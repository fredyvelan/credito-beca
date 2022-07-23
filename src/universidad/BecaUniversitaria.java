package universidad;

public class BecaUniversitaria {

    private double pMonto;
    private double pInteres;
    private int pTiempo;

    public BecaUniversitaria() {
        this.pMonto = 0;
        this.pInteres = 0;
        this.pTiempo = 0;
    }

    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres ) {
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        this.pTiempo = pTiempo;
    }

    public String compararInversion(int pTiempo, double pMonto, double pInteres){
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        this.pTiempo = pTiempo;
        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $"+ diferencia;
    }

    public String compararInversion(){
        if (pMonto != 0 && pInteres != 0 && pTiempo != 0) {
            double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $"+ diferencia;
        }
        return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
    }

    public double calcularInteresSimple(){
        double simple = pMonto * (pInteres / 100) * pTiempo;
        return Math.round(simple);
    }

    public double calcularInteresCompuesto(){
        double base = 1 + (pInteres / 100);
        double compuesto = pMonto * (Math.pow(base, pTiempo) - 1);
        return Math.round(compuesto);
    }

}
