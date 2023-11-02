import java.util.Scanner;

public class winrate {
    /**
     * dibawah ini adalah program menghitung winrate
      * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah match : ");
        int gamesPlayed = scanner.nextInt();

        System.out.print("Masukkan jumlah kemenangan : ");
        int gamesWon = scanner.nextInt();

        double winRate = (double) gamesWon / gamesPlayed * 100;

        System.out.println("Winrate anda sebesar : " + winRate + "%");

        scanner.close();
    }
}