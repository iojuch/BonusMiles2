public class BonusMilesService {

    public int calculate(int amount) {
        int bonus = 20;
        int result = amount / bonus;
        if (result < 500) {
       result = amount / bonus;
        } else {
            result = 500;
        }

        return (result);
    }
}
