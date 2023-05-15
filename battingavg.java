import java.util.Scanner;
class battingavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        int avg = 0;
        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            avg = avg+x;
        }
        avg = avg/n;
        System.out.println(avg);

    }
}
