public class CalculatorSimplu {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Trebuie sa introduceti o sintaxa ca in exemplul: 1+2");
        } else {
            int a = Integer.parseInt(args[0]);
            String operatie = args[1];
            int c = Integer.parseInt(args[2]);
            calculeaza(a, operatie, c);
        }
    }

    /**
     * Metoda ce returneaza un calcul matematic
     * @param a o variabila de tip int
     * @param operatie un operator matematic de tipul +,-,/,*
     * @param c o variabila de tip int
     */

    private static void calculeaza(int a, String operatie, int c) {
        switch (operatie.charAt(0)) {
            case '-':
                int rezultat = a - c;
                System.out.println(rezultat);
                break;
            case '+':
                int rezultat1 = a + c;
                System.out.println(rezultat1);
                break;
            case '*':
                int rezultat2 = a * c;
                System.out.println(rezultat2);
                break;
            case '/':
                int rezultat3 = a / c;
                System.out.println(rezultat3);
                break;
            default:
                System.out.println("Nu ati intodus +, -, /, *");
        }
    }
}