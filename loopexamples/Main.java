package loopexamples;

public class Main {
    public static void main(String[] args){
        int[] arrayInt = {10, 20, 30, 40, 50, 70, 80, 90};
        afisareElementeArray(arrayInt);
        sumaElementeArray(arrayInt);
        int numar = 1501;
        inversareNumar(numar);
        afisareCaractereNrsiVocale();
    }

    private static void afisareCaractereNrsiVocale() {
        String propozitie = "Ana are mere";
        char[] arrayCaractere = propozitie.toCharArray();
        int nrVocale = 0;
        for (char element : arrayCaractere){
            System.out.println(element);
            if (element == 'A' || element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'u'){
                nrVocale++;
            }
        }
        System.out.println("Numarul vocalelor din string este egal cu: " + nrVocale);

    }

    private static void inversareNumar(int numar) {
        int numarInversat = 0;
        while (numar > 0){
            numarInversat = numarInversat * 10 + numar % 10;
            numar = numar / 10;
        }
        System.out.println("Numarul inversat este: " + numarInversat);
    }

    private static void sumaElementeArray(int[] arrayInt) {
        // calcul suma in functie de niste conditii:
        //a) daca elementul din array == 30 nu se va calcula suma;
        //b) daca suma depaseste valoarea 100 se intrerupe executia array-ului;
        int suma = 0;
        for (int elem : arrayInt){
            if (elem == 30){
                continue;
            }
            if (suma > 100){
                break;
            }
            suma = suma + elem;
            System.out.println("elementul:" + elem + "suma:" + suma);

        }
        System.out.println("Am iesit din bucla for, iar suma finala este egala cu " + suma);
    }

    private static void afisareElementeArray(int[] arrayInt) {
        for (int elem : arrayInt){
            System.out.println(elem);
        }
    }
}
