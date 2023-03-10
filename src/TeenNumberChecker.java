public class TeenNumberChecker {

    public static boolean hasTeen (int teenOut1, int teenOut2, int inclusive ) {

        if (teenOut1 >= 13 && teenOut1 <= 19 ) {
            return true;
        } else if (teenOut2 >= 13 && teenOut2 <= 19 )  {
            return true;
        } else if (inclusive >= 13 && inclusive <= 19) {
            return true;
        } else {
            return  false;
        }

    }

    public static boolean isTeen (int teen) {
        if (teen >= 13 && teen <= 19) {
            return true;
        } else  {
            return  false;
        }
    }

    public static void main(String[] args) {
        hasTeen(0,0,13);
        isTeen(22);
    }
}
