public class Sumatorias {

    public int practico1(int cantidad) {
        int aux = 3;
        int acumulador = 0;
        for (int i = 0; i < cantidad; i++) {
            //System.out.print(aux + ", ");
            acumulador = acumulador + aux;
            aux = aux * 2;
        }
        return acumulador;
    }

    public int practico2(int cantidad) {
        int aux = 1;
        int acumulador = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print(aux + ", ");
            acumulador = acumulador + aux;
            aux = aux + 2;
        }
        return acumulador;
    }
}
