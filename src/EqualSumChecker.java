public class EqualSumChecker {

    public static void main(String[] args) {


        hasEqualSum(2, 2, 3);
    }


    public static boolean hasEqualSum(int first, int second, int third) {

        int sum = first + second;

        if (sum == third) {
            return true;
        } else {
            return false;
        }


    }
}


