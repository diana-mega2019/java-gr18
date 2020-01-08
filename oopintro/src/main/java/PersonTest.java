public class PersonTest {
    public static void main(String[] args) {
        Person persoana1 = new Person();
        System.out.println(persoana1);

        Person persoana2 = new Person("Bogdan");
        System.out.println(persoana2);

        persoana1.name = "Ana";
        System.out.println(persoana2);
    }
}
