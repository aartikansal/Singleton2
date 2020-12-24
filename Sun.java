public class Sun implements Planet {
    private static volatile Sun instance = null;

    private Sun() {
    }

    public static Sun getInstance() {
        if (instance == null) {
            synchronized (Sun.class) {
                if (instance == null) {
                    instance = new Sun();
                }
            }
        }
        return instance;
    }

}
