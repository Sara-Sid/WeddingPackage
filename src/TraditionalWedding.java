public class TraditionalWedding extends WeddingPackage {
    TraditionalWedding () {
        this.name = "Traditional Wedding";
    }
    public void getDescription(){
        System.out.println(name);
        System.out.println("Venue: " + venue);
        System.out.println("Catering: " + catering);
        System.out.println("Decorations: " + decorations);
        System.out.println("Photography: " + photography);
        System.out.println("Price: $" + getPrice());
    }

    public double getPrice(){
        return 10000.00;
    }

}

