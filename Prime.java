public class Prime {

    public static void main(String[] args) {
        int i = 0, l = 100, count = 0;
        String pn = "";
        for (i = 0; i <= l; i++) {
            count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                pn += " " + i;
            }
        }
        System.out.println("Prime numbers are " + pn);
    }
}
