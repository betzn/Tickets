/*
Tickets.java

4th Ed of textbook p. 657 Ex 5 and  Ex 6 (Ticket class for campu event).

*Test your classes from the client program (the one with main method). 

Hint: To “force” subclasses to implement superclass methods, make these methods abstract. 

By Nathan Betz
*/

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
