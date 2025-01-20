public class SingltonLazy {

    private SingltonLazy() {
        System.out.println("instance created");
    }

    private static class Holder {

        private static final SingltonLazy INSTANCE = new SingltonLazy();
    }

    public static SingltonLazy getInstance() {
        return Holder.INSTANCE;
    }

    public static void main(String[] args) {

        Thread th1 = new Thread(() -> {
            SingltonLazy.getInstance();
        });
        Thread th2 = new Thread(() -> {
            SingltonLazy.getInstance();
        });

        th1.start();
        th2.start();

        // Singlton obj1 = Singlton.getInstace();
        // Singlton obj2 = Singlton.getInstace();

    }

}
