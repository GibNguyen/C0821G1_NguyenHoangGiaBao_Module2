package _02_java_loop.baitap;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int n=2;
        while (n<100){
                boolean check = true;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        check = false;
                        break;
                    } else check = true;
                }

                if (check == true) {
                    System.out.println(n);
                }
                n++;
            }
        }
    }
