public class ArrayReturn {
    private int[] values;

    public int[] sort(int[] that) {
        this.values = that;
        return that;
    }

    public void echo() {
        System.out.println(this.values[0]);
    }

    public static void main(String[] args) {
        ArrayReturn ar = new ArrayReturn();
        final int[] immutable = {1};
        final int[] ri = ar.sort(immutable);
        ar.echo();

        ri[0] = -1;
        ar.echo();
    }
}

