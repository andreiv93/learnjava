public class App {

    public static void main(String[] args) {
        System.out.println("Ceva!");

        int a = 10;
        long b, c = 15;
        char x = 'p';
        float d = 1.50f, pi = 3.14f;
        double e = 12.12345678999;
        boolean h, i;

        long suma = a + c;
        System.out.print(suma);
        System.out.println(suma);

        System.out.println(a * d);

        d = (float) (pi / e);
        System.err.println(d);

        System.out.println(x);
        System.out.println((int)x);
        System.out.println('p');
        System.out.println((int)'p');

        System.out.println('A' + 'n' + 'a');
        String cuvant = String.valueOf('A') + String.valueOf('n') + String.valueOf('a');
        String cuvant2 = "A" + "n" + "a";
        System.out.println(cuvant);
        System.out.println(cuvant2);

        String wtf = 2 + "ceva";
        System.out.println(2 + "ceva");
        System.out.println("ceva" + 2);

//    operatori: + - * / % && || ! ^ (sau exclusiv: true cand fix una e true) == !=

        myFirstFunction();
        suma(14, a);
        System.out.println(sum(11, a));
        System.out.println(sum(11, a, 12));
        System.out.println(sum(d, pi));

        System.out.println(maiMare(3,5));
        System.out.println(maiMare(10,6));

        testFor(6);

        testFor2(4, 7);

        testWhile(5);
//        System.out.println(testDoWhile(9));
        System.out.println(testDoWhile(-4));

        System.out.println(sumaCifrelor(473));

        System.out.println(factorial(5));

        System.out.println(sumaCifr(5));

        char[] n = new char[3];
        n[0] = 'c';
        n[1] = 'a';
        n[2] = 't';

        System.out.println(concatenare(n));
        System.out.println(concatenare(new char[]{
                'A', 'n', 'a', '!'
        }));

        int[][] matrice = new int[2][2];
        matrice[0][0] = 5;
        matrice[0][1] = 7;
        matrice[1][0] = 9;
        matrice[1][1] = 2;

        afisareMatrice(matrice);


    }

    private static void afisareMatrice(int[][] m) {
        for(int i=0; i<m.length; i++) {
            for(int j=0; j<m[i].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static String concatenare(char[] n) {
        String result = "";
        for (int i=0; i<n.length; i++) {
            result += n[i];
        }
        return result;
    }

    private static int sumaCifr(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumaCifr(n-1);
    }

    private static int factorial(int n) {
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    private static int sumaCifrelor(int n) {
        if (n == 0) {
            return 0;
        }
        return n%10 + sumaCifrelor(n/10);
    }

    private static int testDoWhile(int i) {
        int s = 0;
        if (i <= 0){
            return s;
        }
        do {
            if (i % 2 == 0) {
                s += i;
            }
            i--;
        } while (i >= 0);
        return s;
    }

    private static void testWhile(int i) {
        int k = 0;
        while (i >= k) {
            System.out.println(k);
            k++;
        }
    }

    static void myFirstFunction() {
        System.out.println("This is my first function");
    }

    static void suma(int x, int y) {
        System.out.println(x + y);
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static float sum(float x, float y) {
        return x + y;
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }

    static boolean maiMare(int a, int b) {
        /*
        if (a > b) {
            return true;
        } else {
            return false;
        }
        */

        /*
        if (a > b) {
            return true;
        }
        return false;
        */

        return a > b;
    }

    static void testFor(int a) {
        for (int i=0; i<a; i++) {
            System.out.print(i + " ");
        }
    }

    static void testFor2(int a, int b) {
        for (int i=0; i<a; i++) {
            for (int j=0; j<b; j++) {
                if (maiMare(j, i)) {
                    System.out.print("(" + i + "," + j + ")");
                }
            }
            System.out.println();
        }
    }
}
