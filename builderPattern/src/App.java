import Models.ICar;

public class App {
    public static void main(String[] args) throws Exception {
        ICarBuilder builder = new ScorpioBuilder();

        Director director = new Director(builder);

        director.cunstruct();

        ICar car =  builder.build();
    }
}
