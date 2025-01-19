import Models.ICar;
import Models.Scorpio;

public class ScorpioBuilder  implements ICarBuilder{

    Scorpio s1;
    @Override
    public void buildEngine() {
        // TODO Auto-generated method stub
        System.out.println("Scorpio Engine getting Started");
        
    }


    @Override
    public void buildChassis() {
        // TODO Auto-generated method stub
        System.out.println("Scorpio Chassiss gettinh inserted");
        
    }

    @Override
    public void buildTyre() {
        // TODO Auto-generated method stub
        System.out.println("Scorpio tyre getting inserted");
        
    }

    @Override
    public void buildBodyShell() {
        // TODO Auto-generated method stub
        System.out.println("Scorpio bodyShell ");
        
    }


    @Override
    public ICar build() {
        // TODO Auto-generated method stub
        return s1;
    }
}
