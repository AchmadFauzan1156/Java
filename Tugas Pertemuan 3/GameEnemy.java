public class GameEnemy {
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    // Constructor 1 = Kosong
    public GameEnemy()
    {

    }

    // Constructor 2 = 2 parameter
    public GameEnemy(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    // Constructor 3 = 4 parameter
    public GameEnemy(double width, double height, int positionX, int positionY)
    {
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Setter
    public void setDimension(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public void setPosition(int positionX, int positionY)
    {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getter
    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public int getX()
    {
        return positionX;
    }

    public int getY()
    {
        return positionY;
    }

    // Behavior
    public void Run()
    {
        System.out.println("Enemy is running");
    }
}
