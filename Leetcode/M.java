public class M {
    public static void main(String[] args) {
        int[] a;
        a = new int[3];
        int[] b = new int[3];
        a[0] = 1;
        b[0] = 2;
        a[1] = 3;
        b[1] = 4;
        a[2] = 5;
        b[2] = 6;

        int[] res = new int[a.length + b.length];
        System.arraycopy(a, 0, res, 0, a.length);
        System.arraycopy(b, 0, res, a.length, b.length);
        for (int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
}
