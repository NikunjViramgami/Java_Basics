interface Camera{
    void takesnap();
    void recordvideo();
    // uhh can not use diectly calling object in private method
    private void greetMessage(){
        System.out.println("Hello welcomee..");
    }
    // default method create becoz uhh cannot change the whole class for one method
    default void record4kvideo(){
        // uh can call a private method as a 
        greetMessage();
        System.out.println("Recording in 4k..");
    }
}

interface wifi{
    String [] getNetworks();
    void connecttoNetwork(String network);
}

class Cellphone{
    void callNumber(int phonenumber){
            System.out.println("Calling " + phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }

}

class Smartphone extends Cellphone implements wifi,Camera{
    public void takesnap(){
        System.out.println("Taking  snap");
    }
    // uhh can also override default method
    // public void record4kvideo(){
    //     System.out.println("Fucking calls...");
    // }
    public void recordvideo(){
        System.out.println("Record video");
    }
    public String[] getNetworks(){
        String [] networklist = {"Nikunj", "Pandit", "Kartik"};
        return networklist;
    } 
    public void connecttoNetwork(String Network){
        System.out.println("Connect to Network"+ Network);
    }
}

public class Default_Method {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone();
        String [] arr = sp.getNetworks();
        for (String item : arr) {
            System.out.println(item);
            
        }
        sp.connecttoNetwork("PickUp");

        sp.record4kvideo();

        Camera cm = new Smartphone();
        // Allowed
        cm.record4kvideo();
        // its not allowed uhh can use only camera interface method
        // cm.connecttoNetwork();
        
    }
}
