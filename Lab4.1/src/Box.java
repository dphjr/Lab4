public class Box {
    int size = 0;

    public void printBox() //no parameter set
    {
        int i, j; //setting up variables for loop

        for(i = 1; i <= size; i++) //sets up rows
        {
            for(j = 1; j <= size; j++) //sets up columns
            {
                System.out.print("*");
            }
            System.out.println();}
    }
    public void printBox(char c) //second class for exercise. setting up parameter
    {
        int i, j; //setting up variables for loop

        for(i = 1; i <= size; i++) //sets up rows
        {
            for(j = 1; j <= size; j++) //sets up columns
            {
                System.out.print("c");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Box boxy = new Box();
        boxy.size = 5; //setting size of square
        boxy.printBox('c'); //invoking second version
    }
}