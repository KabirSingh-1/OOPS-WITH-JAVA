enum Status{
    Running , Failed , Pending , Success;
}
enum Laptop{
    Macbook(2000),Xps(1000),Surface(1500),ThinkPad(1800);
    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    


}
public class Enum {
   public static void main(String[] args) {
     // status class
        // Status[] ss = Status.values();
        // for(Status s : ss){
        //     System.out.println(s+" : "+s.ordinal());
        // }

        // Status s = Status.Success;
     
        
        //  System.out.println(s.getClass().getSuperclass());
        // if(s == Status.Running){
        //     System.out.println("all good");
        // }
        // else if(s == Status.Failed){
        //     System.out.println("try again");
        // }
        // else if(s == Status.Pending){
        //     System.out.println("please wait");
        // }
        // else System.out.println("Done");

        // switch (s) {
        //     case Running:
        //         System.out.println("all good");
        //         break;
        //     case Failed:
        //         System.out.println("try again");
        //         break;
        //     case Pending:
        //         System.out.println("Please wait");
        //         break;
        //     case Success:
        //         System.out.println("Done");
        //         break;
        //     default:
        //         System.out.println("something wrong");
        //         break;
        // }


        // Laptop class
 
        Laptop[] laptops = Laptop.values();
        for(Laptop l : laptops){
            System.out.println(l+" : "+l.getPrice());

        }
    
   }
    
}
