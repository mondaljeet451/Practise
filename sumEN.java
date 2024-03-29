public class sumEN {

    public static void main(String[] args) {
        int ans = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                ans = ans + i;
            }
        }
        System.out.println(ans);
    }

}

