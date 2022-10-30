package telephone;

public class TelephoneTest {
    public static void main(String[] args) {
        Device dev;
        dev = new Telephone("12345", "09876");
        dev.show();
        dev = new Handphone("23451", "98760", "San");
        dev.show();
        
        Android and = new Android("23451", "98760", "San", "Online");
        and.call();
        and.setStatus("Offline");
        and.call();
        
        and.reveal();
        and.others("01/01/2022", "00:15:00");
        and.detail();   
    }    
}
