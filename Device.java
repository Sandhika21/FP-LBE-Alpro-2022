package telephone;

public abstract class Device {
    protected String ID;
    public Device(String ID){
        this.ID = ID;
    }
    public abstract void show();
    public void reveal(){
        System.out.println("Device ID : "+this.ID);
    }
}
