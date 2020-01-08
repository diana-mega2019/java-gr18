public class Person {
    String name;

     public Person() {
         System.out.println("Constructorul implicit a fost initializat");
         this.name = "no name";
     }
     public Person(String name){
         System.out.println("Constructorul explicit cu un parametru a fost creat");
         this.name = "name";
     }
     public String toString(){
         return this.name;
     }

}