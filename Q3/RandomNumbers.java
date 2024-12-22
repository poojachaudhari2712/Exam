import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        
    
        for (int i = 0; i < 5; i++) {
            int randomNumber = 1000 + random.nextInt(9000);
            System.out.println(randomNumber);
        }
    }
}