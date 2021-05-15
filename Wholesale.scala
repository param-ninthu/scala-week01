object Wholesale extends App {
    
    //Q3
    
    def calculate(copies:Int,cover_price:Double,disount:Double):Double= {

        var unit_price : Double = cover_price * (disount / 100);
        var cost : Double = unit_price * copies;

        cost = cost + ( copies * 3);

        if (copies > 50){
            cost = cost -  ( (copies - 50) * 2.25);
        }
       
        return cost;

    }

    println(calculate(60,24.95,40));
}
