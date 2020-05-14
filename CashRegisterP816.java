import java.util.ArrayList; 

 public class CashRegisterP816
 {
    // TODO: insert declarations of instance variables
    final static private int MAX_SIZE = 100;
    private int capacity;
    private int itemCount;
    private ArrayList<Double> items;
    
    /**
     * Constructor for objects of class CashRegisterP816
     * 
     * @param capacity the maximal number of items the cash register can store
     */
    
    public CashRegisterP816(int capacity)
    {
         
         this.capacity = capacity ;
         this.items = new ArrayList<>(capacity);
         

    }
    
    /**
     * Constructor for objects of class CashRegisterP816 
     * (with the default capacity)
     */
    public CashRegisterP816()
    {
        this.capacity = MAX_SIZE;
        this.items = new ArrayList<>(MAX_SIZE);

    }

    /**
     * Gets the number of items in the current sale
     * 
     * @return the item count
     */
    public int getCount()
    {
        return  itemCount;
    }
    
    /**
     * Gets the price of all items in the current sale
     * 
     * @return the total price
     */
    public double getTotal()
    {
         double totalPrice = 0;
         
         for(Double i : items){
            totalPrice += i;
         };
       
         return totalPrice;
        
    }
    
    /**
     * Clears the cash register before the next sale 
     */
    public void clear() 
    {
        itemCount = 0; items.clear();
    }    
    
    /**
     * Adds an item to the cash register
     * 
     * @param price the price of the item
     */
    public void addItem(double price) 
    {
        if(price > 0 && itemCount < capacity){    
          itemCount++;
          items.add(price);
        };
        
         
    }    
    
    /**
     * Cancels the last item in the cash register
     */
    public void cancelLast()
    {
        itemCount--; 
        items.remove(items.size() - 1);
    
    }    
    
    /**
     * Prints out all the items in the current sale
     */
    public void displayAll()
    {
         for(Double i : items){
             System.out.println("Items: " + i);
         };      
    }    
}