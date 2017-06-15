package capitalGains;



import interfaces.CapitalGainsInterface;
import interfaces.NotEnoughStockException;

public class CapitalGainsImp implements CapitalGainsInterface
{
	  int days = 0;
	  double totalCost = 0.0;
	  
	  Queue capital = new Queue();

	  @Override
	  public void buy(int shares, double price)
	  {
	    for(int i = 0; i < shares; i++) {
	      capital.enqueue(price);
	      totalCost += price;
	    }
	    
	    days++;
	  }

  @Override
  public double sell(int shares, double price)
  {
    if(capital.size() < shares) {
      throw new NotEnoughStockException("Your stock isn't big enough you numbskull");
    }
    
    double capgains = 0.0;
    
    for(int i = 0; i < shares; i++) {
      if(capital.isEmpty()) {
        return 0.0;
      }
      
      double initCost = (double) capital.dequeue();
      capgains += price - initCost;
      
    }
    
    return capgains;
  }

  @Override
  public int getDay()
  {
    return days;
  }

}