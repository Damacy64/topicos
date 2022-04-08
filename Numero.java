package topicos;

/**
 *
 * @author pzx64
 */
public class Numero {

    int n;

    Numero(int n) {
        this.n = n;
    }

    int mide() {
        int copian = n, c = 0;

        for (; copian > 0; copian /= 10) {
            c++;
        }

        return c;
    }

    int contar(int ncuenta) {
        int copian = n, c = 0;
        do {
            if (copian % 10 == ncuenta) {
                c++;
            }

            copian /= 10;
        } while (copian > 0);

        return c;
    }

    int voltea() {
        int r = 0, m = mide() - 1, copian = n;

        for (; copian > 0; copian /= 10, m--) {
            r += (copian % 10) * Math.pow(10, m);
        }
        return r;
    }

    int cambia(int a, int b) {
        int r = 0, m = 0, copian = n;

        while (copian > 0) {
            if (copian % 10 == a) {
                r += b * Math.pow(10, m);
                m++;
            } else {
                r += (copian % 10) * Math.pow(10, m);
                m++;
            }
            copian /= 10;
        }
        return r;
    }

    int envuelve(int a, int b) {
        int copian = n, r = 0, m = 0;

        while (copian > 0) {

            if (copian % 10 == a) {

                r += b * Math.pow(10, m);

                m++;

                r += (copian % 10) * Math.pow(10, m);

                m++;

                r += b * Math.pow(10, m);

                m++;

                copian /= 10;

            } else {
                r += (copian % 10) * Math.pow(10, m);
                m++;
                copian /= 10;

            }
        }
        return r;
    }

    int determinar(int n, int m) {
        int posición = 0, r = 0, vn = n, vm = m;
        while (vn > 0 && vm > 0) {
            if (vn % 10 == vm % 10) {
                r += vn % 10 * Math.pow(10, posición);
                posición++;
            }
            vn /= 10;
            vm /= 10;
        }
        return r;
    }
    public static void main(String[] args) {
        Numero numero = new Numero(154935);
        System.out.println("El numero es: " + numero.n);
        System.out.println("Mide: " + numero.mide());
        System.out.println("Contar: " + numero.contar(5));
        System.out.println("Voltear: " + numero.voltea());
        System.out.println("Cambiar: " + numero.cambia(9, 3));
        System.out.println("Envolver: " + numero.envuelve(5, 1));
        System.out.println("Determinar: " + numero.determinar(4254, 4287));
    }
}
