
public class Mobile  {
    //states
    String brand,ram;
    double price;

    //Lazy Instantiation
    Sim tray;
    
    //constructor
    Mobile() {}
    Mobile(String brand, String ram , double price)
    {
        this.brand =brand;
        this.ram=ram;
        this.price=price;
    }

    //Behavior
    public void detailsOfMobile()
    {
        System.out.println("Mobile brand : " +brand);
        System.out.println("Mobile RAM : " +ram);
        System.out.println("Mobile price : " +price);
        System.out.println("****************************************");
    }
    public void insertSim(Sim accepted_sim) 
    {
        //to insert sim
        if (tray==null)
        {
            tray=accepted_sim;
            System.out.println(tray.name + " Sim is successfully inserted");
        }
        else
        {
            System.out.println("Already "+tray.name + " is present");
        }
    }

    public void removeSim()
    {
        //to remove Sim
        if (tray !=  null)
        {
            System.out.println(tray.name + " Successfully Removed");
            tray =null;
        }
        else
        {
            System.out.println("There is no sim to remove");
        }
    }

    public boolean isSimPresent()
    {
        if (tray!=null)
        {
            return true;
        }
        return false;
    }

}
