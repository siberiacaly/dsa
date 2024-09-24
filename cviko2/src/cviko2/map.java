package cviko2;

import java.util.Vector;

public class map {
	private Vector<car> cars;


    public void addCar(car c) {
        cars.add(c);
    } 
    
    public void removeCar(int i) {
        if (!cars.isEmpty()) {
            cars.remove(i);
        }    
    }
  
    public car getCar(int i) {
        if (!cars.isEmpty()) {
            return cars.get(i);
        }
        return null;
    }
      
    public int carCount() {
        return cars.size();
    }
}