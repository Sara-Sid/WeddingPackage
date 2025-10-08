public class Main {
    public static void main(String[] args) {
        WeddingPlanner planner = WeddingPlanner.getInstance();

        WeddingFactory factory = new WeddingFactory();
        WeddingPackage wedding = WeddingFactory.createWeddingPackage("Traditional Wedding");

        WeddingPackageBuilder builder = new WeddingPackageBuilder(wedding);
        builder.setVenue("Historic Homestead")
                .setCatering("Family Feast Catering")
                .setDecorations("Country Blossom Events")
                .setPhotography("Homestead Memories Photography");
        wedding.getDescription();

        System.out.println();

        WeddingPackage luxuryWedding = WeddingFactory.createWeddingPackage("Luxury Wedding");
        WeddingPackageBuilder luxuryBuilder = new WeddingPackageBuilder(luxuryWedding);
        luxuryBuilder.setVenue("Five-Star Resort")
                .setCatering("Gourmet Delights Catering")
                .setDecorations("Elite Events Decor")
                .setPhotography("Luxury Moments Studio");
        luxuryWedding.getDescription();

        System.out.println();

        WeddingPackage destinationWedding = WeddingFactory.createWeddingPackage("Destination Wedding");
        WeddingPackageBuilder destinationBuilder = new WeddingPackageBuilder(destinationWedding);
        destinationBuilder.setVenue("Swiss Paradise")
                .setCatering("Island Gourmet Services")
                .setDecorations("Alpine Events")
                .setPhotography("Swiss Alpine Photography");
        destinationWedding.getDescription();
    }
}
