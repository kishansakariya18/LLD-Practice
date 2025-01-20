public class Singlton {


    private static Singlton instance;


    private Singlton(){
        System.out.println("Singlton contructor called, instance created");
    }


    public static Singlton getInstace(){
        if(instance == null){
            instance = new Singlton();
        } 

        return instance;
    }



    public static void main(String[] args) {
        // Thread th1 = new Thread( () -> {Singlton.getInstace();} );
        // Thread th2 = new Thread(() -> {Singlton.getInstace();});


        // th1.start();
        // th2.start();


        //here above create 2 instaces 

        Singlton obj1 =  Singlton.getInstace();
        Singlton obj2 =  Singlton.getInstace();
    }
}
