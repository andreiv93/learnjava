public class Exercises {

    /*
    * 1. o functie care returneaza restul impartirii a doua numere intregi
    * 2. o functie care primeste 1 nr intreg si verifica daca e par, folosind fct scrisa la 1.
    * 3. o fct care primeste 2 nr intregi a si b, si verifica daca a este multiplu de b, folosind fct de la 1.
    * 4. o fct care primeste 1 nr intreg si retuneaza suma nr pare din intervalul [0, param)
    * 5. o fct care primeste 1 nr intreg si verifica daca produsul nr impare din intervalul [0, param] este par, folosind fct de la 2.
    * 6. vct nr. intregi, sortare descrescator (sort paharelor)
    * 7. max dintre 2 nr.
    * 8.max din vct cu fct de la 7.
    * 9.suma elem diagon principala a unei matrici
    * 10.prod elem de sub diag secund
    * 11.inversul unui nr (cu recurs?)
    * 12.nr. palindrom?
    *
    * */

    public static void main(String[] args) {
        System.out.println(restImp(10,2));
        System.out.println(restImp(11,3));
        par(18);
        par(13);
        multiplu(15, 3);
        multiplu(20, 6);
        System.out.println(sumaPar(12));
        verifProd(10);
        int[] v = new int[5];
        v[0] = 10;
        v[1] = 5;
        v[2] = 6;
        v[3] = 9;
        v[4] = 30;
        int[][] mat = new int[3][3];
        mat[0][0] = 15;
        mat[0][1] = 12;
        mat[0][2] = 1;
        mat[1][0] = 9;
        mat[1][1] = 16;
        mat[1][2] = 5;
        mat[2][0] = 3;
        mat[2][1] = 2;
        mat[2][2] = 7;
        System.out.println();
        System.out.println("Maximul dintre cele doua numere este "+maxNr(10, 5));
        System.out.println("Maximul din vector este " +maxVct(v));
        sortVect(v);
        System.out.println();
        System.out.println("Suma este "+sumDiag(mat));
        System.out.println("Produsul este "+prodDiag(mat));
        System.out.println(inversNumar(123));
        palindrom(131);


    }

    private static void palindrom(int i) {
        if (inversNumar(i) == i) {
            System.out.println("Numarul este palindrom");
        } else {
            System.out.println("Numarul nu este palindrom");
        }
    }

    private static int inversNumar(int i) {
        int k = 0;
        while (i != 0) {
            k = k*10 + i%10;
            i = i/10;
        }
        return k;
    }

    private static int prodDiag(int[][] m) {
        int p = 1;
        for (int i=0; i<m.length; i++) {
            for(int j=0; j<m[i].length; j++) {
                if( i+j > m.length - 1) {
                    p *= m[i][j];
                }

            }
        }
        return p;
    }

    private static int sumDiag(int[][] m) {
        int s = 0;
        for(int i=0; i<m.length; i++) {
            for(int j=0; j<m[i].length; j++) {
                if (i == j) {
                    s += m[i][j];
                }
            }
        }
        return s;
    }

    private static float maxVct(int[] v) {
        float m = v[0];
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                m = maxNr(v[i], v[j]);
                if (maxNr(v[i], v[j]) > m) {
                    m = maxNr(v[i], v[j]);
                }
            }
        }
       return m;
    }

    private static float maxNr(float i, float j) {
        if (i>j) {
            return i;
        }
        return j;
    }

    private static void sortVect(int[] n) {
        int temp;
        for(int i=0; i<n.length-1; i++) {
            for(int j=i+1; j<n.length; j++){
                if (n[i]<n[j]) {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }

            }
        }
        for(int i=0; i<n.length; i++){
            System.out.print(n[i]+" ");
        }
    }

    static float restImp(int a, int b) {
        return a%b;
    }

    static void par(int a) {
        if (restImp(a,2) == 0) {
            System.out.println("Numarul " + a + " este par");
        } else {
            System.out.println("Numarul " + a + " este impar");
        }
    }

    static void multiplu(int a, int b) {
        if (restImp(a, b) == 0) {
            System.out.println(a + " este multiplu de " + b);
        } else {
            System.out.println(a + " nu este multiplu de " + b);
        }
    }

    static int sumaPar(int a) {
        int suma = 0;
        for (int i=0; i<a; i++) {
            if(restImp(i,2) == 0) {
                suma += i;
            }
        }
        return suma;
    }

    static void verifProd(int a) {
        int p = 1;
        for (int i=0; i<=a; i++) {
            if (restImp(i, 2) != 0) {
                p*=i;

            }
        }
        if (restImp(p, 2) == 0) {
            System.out.println("Produsul nr. impare este par");
        } else {
            System.out.println("Produsul nr. impare este impar");
        }
    }




}
