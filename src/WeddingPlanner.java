public class WeddingPlanner {
    private static WeddingPlanner instance = null;

    private WeddingPlanner() {
    }

    public static WeddingPlanner getInstance() {
        if (instance == null) {
            synchronized (WeddingPlanner.class) {
                if (instance == null) {
                    instance = new WeddingPlanner();
                }
            }
        }
        return instance;

    }

}
