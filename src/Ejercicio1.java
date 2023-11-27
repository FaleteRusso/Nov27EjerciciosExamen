public class Ejercicio1 {
    public static void main(String[] args) {


        double cambio = 200 - 163.27;
        int[] billetes = {500, 200, 100, 50, 20, 10, 5};
        double[] monedas = {2, 1,0.5,0.2,0.1,0.05,0.02,0.01};
        int[] numBilletes = new int[billetes.length];
        double[] numMonedas = new double[monedas.length];
        int i = 0;
        while (cambio > 0) {
            if (cambio >= billetes[i]) {
                numBilletes[i]++;
                cambio -= billetes[i];
            } else if (cambio >= monedas[i]) {
                numMonedas[i]++;
                cambio -= monedas[i];
            } else {
                i++;
            }
        }
        System.out.println("Billetes: ");
        for (int j = 0; j < billetes.length; j++) {
            if (numBilletes[j] > 0) {
                System.out.println(numBilletes[j] + " billetes de " + billetes[j] + " euros");
            }
        }
        System.out.println("Monedas: ");
        for (int j = 0; j < monedas.length; j++) {
            if (numMonedas[j] > 0) {
                System.out.println(numMonedas[j] + " monedas de " + monedas[j] + " céntimos");
            }
        }
    }
}

