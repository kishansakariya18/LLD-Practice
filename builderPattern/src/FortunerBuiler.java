import Models.Fortuner;
import Models.ICar;

public class FortunerBuiler implements ICarBuilder{


        Fortuner s1;
    @Override
    public void buildEngine() {
        // TODO Auto-generated method stub
        System.out.println("Fortuner Engine getting Started");
        
    }


    @Override
    public void buildChassis() {
        // TODO Auto-generated method stub
        System.out.println("Fortuner Chassiss gettinh inserted");
        
    }

    @Override
    public void buildTyre() {
        // TODO Auto-generated method stub
        System.out.println("Fortuner tyre getting inserted");
        
    }

    @Override
    public void buildBodyShell() {
        // TODO Auto-generated method stub
        System.out.println("Fortuner bodyShell ");
        
    }


    @Override
    public ICar build() {
        // TODO Auto-generated method stub
        return s1;
    }
}
