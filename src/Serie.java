public class Serie {
    // generar los primero numero dado n = 5 //  1,2,3,4,5

    public void generarNNumeros(int numero) {
        for (int i = 1; i <= numero; i++) {
            System.out.println(i + ", ");
        }
    }

    public void generarNPares(int numero) {
        for (int i = 1; i <= numero; i++) {
            int par = i * 2;
            System.out.println(par + ", ");
        }
    }
}
