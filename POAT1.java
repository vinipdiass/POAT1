public class POAT1{
    public static void main(String[] args) {
        //Talvez eles precisem ter o mesmo tamanho?
        String n1 = "345869798";
        String n2 = "567893";

        int nDivisoes = 2;

        int restoN1 = n1.length() % nDivisoes;
        int restoN2 = n2.length() % nDivisoes;

        System.out.println(restoN1);
        System.out.println(restoN2);

        int nZeros = 0;

        if (restoN1 != 0) nZeros = nDivisoes - restoN1;
        for (int i = 0; i < nZeros; i++){
            n1 = "0" + n1;
            
        }
        nZeros = 0;

        if (restoN2 != 0) nZeros = nDivisoes - restoN2;
        for (int i = 0; i < nZeros; i++){
            n2 = "0" + n2;
            
        }
        nZeros = 0;

        System.out.println(n1);
        System.out.println(n2);

        String a [] = new String[nDivisoes];
        String b [] = new String[nDivisoes];

        for (int i = 0; i < nDivisoes; i++) {
            a[i] = "";
            b[i] = "";
        }

        int aAux = n1.length() / nDivisoes;
        int bAux = n2.length() / nDivisoes;

        int shifts = Math.pow(2, nDivisoes - 1);
        for (int i = 0; i < nDivisoes; i++){
            for (int j = 0; j < aAux; j++){
                a[i] = a[i] + n1.charAt(j);
            }
            for (int j = 0; j < shifts; j++){
                a[i] = a[i] + "0";
            }
            shifts = Math.sqrt(shifts);
            n1 = n1.substring(aAux);
        }

        for (int i = 0; i < nDivisoes; i++){
            for (int j = 0; j < bAux; j++){
                b[i] = b[i] + n2.charAt(j);
            }
            n2 = n2.substring(bAux);
        }

        System.out.println();

        for (int i = 0; i < nDivisoes; i++){
            System.out.println(a[i]);
        }
        System.out.println();

        for (int i = 0; i < nDivisoes; i++){
            System.out.println(b[i]);
        }

        String aX [] = a;
        String bX [] = b;
    
    
        for (int i = 0; i < nDivisoes; i++){
            
        }

    }


}
