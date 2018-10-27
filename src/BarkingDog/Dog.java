package BarkingDog;

public class Dog {
    public boolean bark(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay < 8 || hourOfDay > 23)
                return true;
        }
        return false;
    }
}
