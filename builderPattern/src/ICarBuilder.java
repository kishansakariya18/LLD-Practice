import Models.ICar;

public interface ICarBuilder {


    public void buildEngine();
    public void buildChassis();
    public void buildTyre();
    public void buildBodyShell();


    //below method return final object
    public ICar build();

}
