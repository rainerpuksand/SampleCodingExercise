public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int kb = kiloBytes;
        int mb = kb / 1024;
        int remainingKb = kiloBytes % 1024;


        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {

            System.out.println(kb + " KB = " + mb + " MB and" + " " + remainingKb + " KB");
        }

    }


}
