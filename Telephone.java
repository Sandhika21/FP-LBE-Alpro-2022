package telephone;

public class Telephone extends Device{
    public String number;
    public Telephone(String ID, String number){
        super(ID);
        this.number = number;
    }
    @Override
    public void show(){
        System.out.println("Telephone ID : "+this.ID);
    }    
    public void call(){
        System.out.println("Calling "+this.number);
    }
}
