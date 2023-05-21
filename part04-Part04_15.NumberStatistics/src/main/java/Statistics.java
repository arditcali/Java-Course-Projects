
public class Statistics {
    
    private int count;
    private int sum;
    
    public Statistics(){
    
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber(int newNumber){
        
        this.count++;
        this.sum += newNumber;
    }
    
    public int getCount(){
        
        return this.count;
    }
    
    public int sum(){
    
        return this.sum;
    }
    
    public double average(){
        
        double avg = 0;
        if(this.sum != 0 && this.count != 0){
            avg = 1.0 * this.sum / this.count;
        }
        return avg;
    }
    
}
