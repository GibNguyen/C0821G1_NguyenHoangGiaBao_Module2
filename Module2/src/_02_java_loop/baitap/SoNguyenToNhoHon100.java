package _02_java_loop.baitap;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int N=2;
        while (N<=100){
                boolean check = true;
                for (int i = 2; i < N; i++) {
                    if (N % i == 0) {
                        check = false;
                        break;
                    } else check = true;
                }

                if (check == true) {
                    System.out.println(N);
                }
                N++;
            }
        }
    }
