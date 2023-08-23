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

    //60, 1, 58, 3, 56, 5, 54, 7, 52, 9, 50, 11
    public void practico2(int cantidad) {
        int impar = 60;
        int par = 1;
        for (int i = 1; i <= cantidad; i++) {
            if (i % 2 != 0 ){
                System.out.print(impar + ", ");
                impar = impar -2;
            } else {
                System.out.print(par + ", ");
                par = par + 2;
            }
        }
    }
    public void practico4(int cantidad) {
        int aux = 1;
        for (int i = 0; i < cantidad; i++) {
            int resultado = i * aux;
            System.out.print(resultado + ", ");
            aux = aux + 1;
        }
    }
}
