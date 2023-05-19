package Package;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsandErrorHandling {

    private Set<Integer> numbers;
        
    public CollectionsandErrorHandling(List<Integer> num){
        this.numbers = new HashSet<>();
        numbers.addAll(num); 
    }
    
    public Set<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<Integer> numbers) {
        this.numbers = numbers;
    }
    public int sum(){
        int total = 0;

        for(Integer sumTotal : numbers){
            total += sumTotal;
        }
        return total;
    }
    public int average(){
        int aveTotal = sum() / numbers.size();
        return aveTotal;
    }

}