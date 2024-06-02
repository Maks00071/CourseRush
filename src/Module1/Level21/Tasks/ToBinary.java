package Module1.Level21.Tasks;

public class ToBinary {
    public static void main(String[] args) {
        System.out.println(getBitCount(268435455));
    }

    public static int getBitCount(int i) {
        int bitCount = Integer.bitCount(i);
        do {
            i++;
        } while (bitCount != Integer.bitCount(i));
        return i;
    }
}