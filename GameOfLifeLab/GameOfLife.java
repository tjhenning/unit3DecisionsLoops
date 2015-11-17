import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    private int ROWS = 30;
    private int COLS = 40;
    private Scanner s =new Scanner(System.in);
    private int alreadyHappened;
    public int cells=1;
    private String rollover="";
    private String custom="";
    /**
     * Constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     *  @param   ROWS2   amount of rows the grid will contain
     *  COLS2   amount of columns the grid will contain
     *  choice   selection of which preset you want
     *  x   Offset of X axis
     *  y   Offset of Y axis
     *  roll   selection of whether rollover is active
     *  edit   selection of whether you edit the grid before it starts
     *  
     */
    public GameOfLife(int ROWS2, int COLS2, int choice,int x,int y, String roll, String edit)
    {
        ROWS=ROWS2;
        COLS=COLS2;
        alreadyHappened=choice;
        custom=edit;
        rollover=roll;
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        world = new ActorWorld(grid);
        populateGame(x,y);      
        world.show();
    }

    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * @param   x   Offset of X axis
     * y   Offset of Y axis
     * 
     */
    private void populateGame(int x, int y)
    {
        Grid<Actor> grid = world.getGrid(); 
        Location loc=new Location(6,1);
        Rock rock = new Rock(); 
        if (custom.equals("go"))
        {              
            loc=new Location(0,0);
                        
            grid.remove(loc);
            //world.show();
            System.out.println("Input any cells you want to input manually now.\nEnter any character to start.");
            s.next();
            System.out.println("\nSTART\n");
            custom="n";
            return;
        } else if (custom.equals("y")){
            custom="go";
        }
                
        rock= new Rock();
         
        if (alreadyHappened==1)
        {
            loc=new Location(0,0);
            grid.put(loc, rock);  
            
        }
        if (alreadyHappened==2)
        {
            loc=new Location(2+y,1+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(2+y,2+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(3+y,2+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(3+y,6+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(3+y,7+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(3+y,8+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(1+y,7+x);
            grid.put(loc, rock);
        }        
        else if (alreadyHappened==3){
            loc=new Location(y,1+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(y,2+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(y,3+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(1+y,x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(1+y,4+x);
            grid.put(loc, rock);rock= new Rock();
        }
        else if (alreadyHappened==4){
            loc=new Location(5+y,1+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(6+y,1+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(5+y,2+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(6+y,2+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(5+y,11+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(6+y,11+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(7+y,11+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(4+y,12+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(8+y,12+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(3+y,13+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(3+y,14+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(9+y,13+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(9+y,14+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(6+y,15+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(4+y,16+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(8+y,16+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(5+y,17+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(6+y,17+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(7+y,17+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(6+y,18+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(3+y,21+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(4+y,21+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(5+y,21+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(3+y,22+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(4+y,22+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(5+y,22+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(2+y,23+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(6+y,23+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(1+y,25+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(2+y,25+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(6+y,25+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(7+y,25+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(3+y,35+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(4+y,35+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(3+y,36+x);
            grid.put(loc, rock);rock= new Rock();
            loc=new Location(4+y,36+x);
            grid.put(loc, rock);rock= new Rock();
        }
   }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        System.out.println("Cycling.");
        Grid<Actor> grid = world.getGrid();
        Location loc = new Location(-1, 1);           
        int around;
        Rock rocks= new Rock();
        int count=0;
        ArrayList<Location> newCells= new ArrayList();
        ArrayList<Location> deadCells= new ArrayList();
        for (int i2=0; i2<ROWS; i2++)
            {                
                for (int i=0; i<COLS; i++)
                {
                    loc=new Location(i2,i);

                    ArrayList<Location> around1= grid.getOccupiedAdjacentLocations(loc);
                    
                    around=around1.size();
                    if (rollover.equals("y"))
                    {
                        if (i+1==COLS)
                        {
                            loc=new Location(i2, -1);
                            around1= grid.getOccupiedAdjacentLocations(loc);
                             around+=around1.size();
                        }
                        if (i==0)
                        {
                            loc=new Location(i2, COLS);
                            around1= grid.getOccupiedAdjacentLocations(loc);
                            around+=around1.size();
                        }
                        if (i2+1==ROWS)
                        {
                            loc=new Location(-1, i);
                            around1= grid.getOccupiedAdjacentLocations(loc);
                            around+=around1.size();
                        }
                        if (i2==0)
                        {
                            loc=new Location(ROWS, i);
                            around1= grid.getOccupiedAdjacentLocations(loc);
                             around+=around1.size();
                        }
                    }
                    loc=new Location(i2,i);
                    if (around<2||around>3)
                    {                              
                        if (getActor(i2,i)!=null&&grid.isValid(loc))
                        {                          
                            deadCells.add(loc);          
                        }
                    }
                    else if (around==3)
                    {                        
                        newCells.add(loc);
                        count+=1;
                    }                    
                }
          }
        for (int i=0;i<deadCells.size();i++)
        {
            //System.out.println("Removing "+deadCells.get(i));
            grid.remove(deadCells.get(i));    
        }
        for (int i=0;i<newCells.size();i++)
        {
            //System.out.println("Placing new cell at "+newCells.get(i));
            rocks= new Rock();
            grid.put(newCells.get(i), rocks);    
        }
        cells=newCells.size()+deadCells.size();
        world.show();
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
   
    /**     
     * The method that starts it all- call to make grid
     *
     * @pre     Must imput integers for the inputs that require them.             
     * @post    Runs Conway's Game of Life with a good deal of customization.
     */
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("How many rows (y) do you want there to be? ");
        int ROWS2=s.nextInt();
        System.out.print("How many columns (x) do you want there to be? ");
        int COLS2=s.nextInt();
        System.out.print("Do you want rollover to be enabled?(y/n): ");
        String roll=s.next().toLowerCase();
        System.out.print("Do you want to edit the world before it runs?(y/n): ");
        String edit=s.next().toLowerCase();
        System.out.print("Select which seed you want to run it with.\nWARNING: If seed goes out of row/width boundaries it WILL crash!\n1: Blank\n2: Diehard\n3: Short Sequence\n4: Glider Gun\nChoice: ");
        int choice=s.nextInt();
        int xOffset;
        int yOffset;
        if (choice!=1)
        {
            System.out.print("Input offset of X axis for seed in grid spots: ");        
            xOffset=s.nextInt();
            System.out.print("Input offset of y axis for seed in grid spots: ");        
            yOffset=s.nextInt();
        }
           else
           {
               xOffset=0;
               yOffset=0;
           }
        System.out.print("Input the number of miliseconds you want between generations: ");        
        int seconds=s.nextInt();
        System.out.print("Input the number of generations: ");
        int maxGens=s.nextInt();

        GameOfLife game = new GameOfLife(ROWS2, COLS2, choice,xOffset,yOffset,roll,edit);
        game.populateGame(xOffset,yOffset);
        int gens=0;
        while ((game.cells!=0 || gens==0) && gens<maxGens)
        {
            gens+=1;
            if (seconds!=0){
                try {
                    Thread.sleep(seconds);                 
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            game.createNextGeneration();
        }
        System.out.println(gens+" generation(s) played.");
    }
}


