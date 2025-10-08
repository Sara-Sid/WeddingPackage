abstract class WeddingPackage {
    // This allows customization of a wedding package(Builder Pattern). Managing the complex construction of the final package.
    protected String name;
    protected String venue;
    protected String catering;
    protected String decorations;
    protected String photography;

    public abstract void getDescription();
    public abstract double getPrice();


    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setCatering(String catering) {
        this.catering = catering;
    }

    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }

    public void setPhotography(String  photography) {
        this.photography = photography;
    }


}

