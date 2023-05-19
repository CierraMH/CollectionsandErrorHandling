package Package;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
            try {
            List<Integer> number = new ArrayList<Integer>();
    
            number.add(5);
            number.add(1);
            number.add(3);
            number.add(1);
            number.add(3);
            CollectionsandErrorHandling cEH = new CollectionsandErrorHandling(number);

            System.out.println(cEH.getNumbers());
            System.out.println(cEH.sum());
            System.out.println(cEH.average());

        } catch (IndexOutOfBoundsException | ArithmeticException ae) {
            System.out.println("Error! Please add positive numbers only");
        } catch(IllegalArgumentException iae){
            System.out.println("Error! Please add a number. Letters are not valid");
        } finally{
            System.out.println("Finished");
        }

    }
}
