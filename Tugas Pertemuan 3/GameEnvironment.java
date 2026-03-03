import java.util.ArrayList;

public class GameEnvironment {
    private double width;
    private double height;
    private ArrayList<GamePlayer> arrPlayer;
    private ArrayList<GameEnemy> arrEnemy;
    
    public GameEnvironment()
    {
        arrPlayer = new ArrayList<>();
        arrEnemy = new ArrayList<>();
    }

    public GameEnvironment(double width, double height)
    {
        this.width = width;
        this.height = height;
        arrPlayer = new ArrayList<>();
        arrEnemy = new ArrayList<>();
    }

    public void addPlayer(GamePlayer player)
    {
        arrPlayer.add(player);
    }

    public void removePlayer(GamePlayer player)
    {
        arrPlayer.remove(player);
    }

    public void getAllPlayers()
    {
        System.out.println("All of Players: " + arrPlayer);
    }

    public void addEnemy(GameEnemy enemy)
    {
        arrEnemy.add(enemy);
    }

    public void removeEnemy(GameEnemy enemy)
    {
        arrEnemy.remove(enemy);
    }

    public void getAllEnemies()
    {
        System.out.println("All of Enemies: " + arrEnemy);
    }

    // --- Method Static Euclidean Distance ---
    public static int EuclideanDistance(int x1, int y1, int x2, int y2)
    {
        double distance = Math.sqrt(Math.pow((x1-x2), 2)+ Math.pow((y1-y2), 2));
        return (int) Math.round(distance);
    }

    // --- Method untuk interaksi antara player dan enemy ---
    public void Interaction()
    {
        if (arrPlayer == null || arrEnemy == null) 
        {
            System.out.println("Player or enemy not sets");
            return; // Keluar dari method jika null
        }
        // Looping untuk mengecek setiap player terhadap setiap enemy
        for (int idxPlayer = 0; idxPlayer < arrPlayer.size(); idxPlayer++)
        {
            for (int idxEnemy = 0; idxEnemy < arrEnemy.size(); idxEnemy++)
            {
                GamePlayer activeHero = arrPlayer.get(idxPlayer);
                GameEnemy activeMonster = arrEnemy.get(idxEnemy);

                // Cek apakah posisi Y sama
                if (activeHero.getY() != activeMonster.getY())
                {
                    System.out.println("Player: " + activeHero + " and Enemy: " + activeMonster + " not in the same Y position");
                }

                // Hitung jarak Euclidean
                int rangeToEnemy = EuclideanDistance(activeHero.getX(), activeHero.getY(), activeMonster.getX(), activeMonster.getY());

                if (rangeToEnemy < 2)
                {
                    System.out.println("Player: " + activeHero + " Attacked Enemy: " + activeMonster);
                    System.out.println("Enemy: " + activeMonster + " loses");
                    removeEnemy(activeMonster);
                } else {
                    System.out.println("==> Player: " + activeHero);
                    // Player lari/Run dengan kecepatan random 1-10
                    activeHero.Run((int) Math.ceil(Math.random() * 10));
                    System.out.println("current x position = " + activeHero.getX() + " <==");
                }
            }
        }

    }
}
