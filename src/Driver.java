// An useful import if you need it.
import java.text.NumberFormat;


public class Driver {

 public static void main(String[] args) {


            //Instantiate some service, Food and baggage
            Calculate baggageTip = new BaggageServiceTipCalculator(BaggageServiceTipCalculator.ServiceQuality.FAIR, 25);
            Calculate foodTip = new FoodServiceTipCalculator(FoodServiceTipCalculator.ServiceQuality.GOOD, 100);

            //Throw them in to a collection
            Calculate[] tip = {baggageTip, foodTip};

            //Instantiate high level class
            TipCalculator tp = new TipCalculator();


             // Just utility code to format numbers nice.
             NumberFormat nf = NumberFormat.getCurrencyInstance();

            //Then apply the High Level class method to these low level modules to do work.
            for(int i=0; i < tip.length; i++) {
                System.out.println(tip[i].getServiceName() + " tip:" +
                        nf.format(tip[i].getTip()));
            }
        }

}



