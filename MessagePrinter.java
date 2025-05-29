public class MessagePrinter {
  
    String name;
    //method to be called

    public void printMessage(){
        System.out.println("Hello" + name);
    }
    //main function
    public static void main(String args[]){
        MessagePrinter mp = new MessagePrinter();
        mp.name = "Deepa";
        mp.printMessage();

    }


 }