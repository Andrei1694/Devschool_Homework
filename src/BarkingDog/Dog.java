package BarkingDog;

public class Dog {
    public boolean bark(boolean barking, int hour) {
        if (barking) {
            if (hour < 8 || hour > 23)
                return true;
        }
        return false;
    }
}
