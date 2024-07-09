package day_1;

public class AnimalActivityOne {

// Create some properties of animal.
// Create getters and setters for properties.
// Create another class called Animal Runner.
// Call the set methods to set values of current properties.
// call the get methods to get the values of current properties.

    public String lion;
    public String tiger;

    public AnimalActivityOne(String lion, String tiger ){

       this.lion = lion;

       this.tiger = tiger;
    }
    public void printAnimal(){

        System.out.println( " lion " + lion );

        System.out.println( " tiger " + tiger );
    }
    // Getter
    public String getLion(){

        return lion;
    }
    public String getTiger(){

        return tiger;
    }
    // Setter
    public void setLion( String lion ){ this.lion =lion; }

    public  void setTiger( String tiger ){ this.tiger = tiger; }

    // PrintAnimalInformation
    public void printAnimalInformation(){

        System.out.println( " lion: " + getLion() );

        System.out.println( " tiger " + getTiger() );
    }












    }






