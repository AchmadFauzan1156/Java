public class GamePlayer {
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    // Constructor 1 = Kosong
    public GamePlayer()
    {

    }

    // Constructor 2 = 2 parameter
    public GamePlayer(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    // Constructor 3 = 4 parameter
    public GamePlayer(double width, double height, int positionX, int positionY)
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

    // Behavior: Method Run biasa
    public void Run()
    {
        System.out.println("Player is running");
    }

    // Behavior: Method Run dengan parameter (Overloading)
    public void Run(int incrementX)
    {
        positionX = positionX + incrementX;
        System.out.println("Player Still running... Current X position = " + positionX);
    }
}