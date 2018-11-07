
public class Cup
{

    private int sips = 10;
    
    public Cup()
    {
        
    }
    
    public void takeOneSip()
    {
        --sips;
        System.out.println("gulp");
    }
    
    public boolean isEmpty()
    {
        return sips == 0;
    }
    
    

   

}