object SphereVolume extends App {
    
    //Q2

    val pi = Math.PI;

    def calculate(r:Double):Double = (4.0/3.0)* pi * Math.pow(r,3);

    println(calculate(5)); 
}
