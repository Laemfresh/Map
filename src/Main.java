import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,CarData> carHashMap = new HashMap<>();
        carHashMap.put(new Car(1,"VE0001"),new CarData("2005","Nissan GTR",200000,"Red"));
        for (Map.Entry<Car,CarData> entry : carHashMap.entrySet()) {
            Car key = entry.getKey();
            CarData value = entry.getValue();
            System.out.println(  key + "\n Value: " + value);
        }

    }
}