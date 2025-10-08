class DestinationWedding extends WeddingPackage {
    public DestinationWedding () {
        this.name = "Destination Wedding";
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
        return 15000.00;
    }
}

