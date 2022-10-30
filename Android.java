package telephone;

public class Android extends Handphone{
    private String status;
    public Android(String ID, String number, String name, String status){
        super(ID, number, name);
        this.status = status;        
    }
    @Override
    public void show(){
        System.out.println("Android ID : "+this.ID);
    }    
    @Override
    public void call(){
        System.out.println("Calling "+this.number);
        System.out.println(this.name);
        System.out.println("Status : "+getStatus());
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
