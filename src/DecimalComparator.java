public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2){

        if (number1 < 0 && number2 >0 || number1 > 0 && number2 < 0) {
            return  false;
        }

        int x = (int) (number1*1000);
        int y = (int) (number2*1000);

        if (x == y) {
            return  true;
        } else {
            return  false;
        }

    }


}
