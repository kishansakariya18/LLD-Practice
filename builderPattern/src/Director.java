public class Director {

    ICarBuilder carBuilder;


    //constructor 
    public Director(ICarBuilder builder){
        this.carBuilder = builder;
    }


    //instructor
    public void cunstruct(){
        carBuilder.buildEngine();
        carBuilder.buildTyre();
        carBuilder.buildChassis();
        carBuilder.buildChassis();
    }


}
