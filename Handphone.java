package telephone;

public class Handphone extends Device{
    public String number;
    public String name;
    public String duration;
    public String date;
    public Handphone(String ID, String number, String name){
        super(ID);
        this.number = number;
        this.name = name;
    }
    public void others(String date, String duration){
        this.date = date;
        this.duration = duration;            
    }
    @Override
    public void show(){
        System.out.println("Handphone ID : "+this.ID);
    }    
    public void call(){
        System.out.println("Calling "+this.number);
        System.out.println(this.name);
    }
    public void detail(){
        System.out.println("Date : "+this.date);
        System.out.println("Duration : "+this.duration);
    }
}
