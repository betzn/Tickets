public abstract class Ticket {

    private int number;
    protected double price;
   
    public Ticket(int number) {
        this.number = number;
      }
   
    public double getPrice() {
        return price;
      }
   
    public String toString() {
        return "Number "+number+", price: "+price;
      }
     
    public WalkupTicket(int number) {
        super(number);
        price = 50;
      }

}
