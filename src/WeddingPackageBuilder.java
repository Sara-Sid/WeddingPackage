class WeddingPackageBuilder {

    private WeddingPackage weddingPackage;

    public WeddingPackageBuilder (WeddingPackage weddingPackage){
        this.weddingPackage = weddingPackage;
    }

    public WeddingPackageBuilder setVenue(String venue){
        weddingPackage.setVenue(venue);
        return this;
    }

    public WeddingPackageBuilder setCatering(String catering){
        weddingPackage.setCatering(catering);
        return this;
    }

    public WeddingPackageBuilder setDecorations(String decorations){
        weddingPackage.setDecorations(decorations);
        return this;
    }

    public WeddingPackageBuilder setPhotography(String photography){
        weddingPackage.setPhotography(photography);
        return this;

    }
}

