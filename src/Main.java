public class Main {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 30;
        int n3 = 40;
        int resultado = sumaTres(n1, n2, n3);
        System.out.println("El resultado de la suma es " + resultado);

        coche miCoche = new coche();
        miCoche.plusPuertas();
    }

    public static int sumaTres (int a, int b, int c){
        return  a + b + c;
    }

    static class coche{
        int puertas = 0;
        public void plusPuertas(){
            this.puertas++;
            System.out.println(puertas);
        }
    }


}