class WeddingFactory {
    public static WeddingPackage createWeddingPackage(String type){
        if (type == "Luxury Wedding") {
            return new LuxuryWedding();
        }
        else if (type == "Destination Wedding" ) {
            return new DestinationWedding();
        }
        else{
            return new TraditionalWedding();
        }
    }
}