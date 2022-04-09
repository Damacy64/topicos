package topicos;

/**
 *
 * @author pzx64
 */
public class Dudeney {

    int n;

    Dudeney(int n) {
        this.n = n;
    }

    Dudeney(String n) {
        int p, r = 0;

        for (p = 0; p < n.length(); p--) {
            r = r * 10 + (int) n.charAt(p) - 48;
        }
        this.n = r;
    }
    
    int suma(){
        int r=0, copian = n;
        for(;copian > 0;copian/=10){
            r += copian%10;
        }
        return r;
    }
    
    boolean isDudeney(){
        boolean r = false;
        if(suma() * suma() * suma() == n){
            return true;
        }
        return r;
    }
    
    public static void main(String[] args) {
        Dudeney numero = new Dudeney(84);
        System.out.println("El resultado es: " + numero.suma());
        System.out.println("El numero " + numero.n + " es un numero Dudeney " + numero.isDudeney());
    }
}
