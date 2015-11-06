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
    public int alreadyHappened=0;
    public int cells=1;
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife(int ROWS2, int COLS2)
    {
        ROWS=ROWS2;
        COLS=COLS2;
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        world = new ActorWorld(grid);
        populateGame();      
        world.show();
    }

    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {

        
        if (alreadyHappened==1)
        {
            System.out.println("Input any cells you want to input manually now.\nEnter any character to start.");
            
            s.next();
            System.out.println("\nSTART\n");
            alreadyHappened=3;
        } else {
            alreadyHappened=1;
        }
        
        
        Grid<Actor> grid = world.getGrid();        
        Rock rock = new Rock();        
        Location loc=new Location(6,1);
        int x=20;
        int y=20;
        /** INSERT "SAMPLE CODE" UNDER HERE */
        
         loc=new Location(0,0);
         grid.put(loc, rock);
         rock= new Rock();
         
         
         
        //if (alreadyHappened==2)
        //{
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
       // }        
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
        Location loc = new Location(0, 1);           
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
                    System.out.println(around);
                    if (around<2||around>3)
                    {       
                        System.out.println(around);
                        if (getActor(i2,i)!=null)
                        {                          
                            deadCells.add(loc);          
                        }
                    }
                    else if (around==3)// && getActor(i2,i)!=null)
                    {                        
                        System.out.println("Placing new cell ");
                        newCells.add(loc);
                        count+=1;
                    }                    
                }
          }
        for (int i=0;i<deadCells.size();i++)
        {
            System.out.println("Removing "+deadCells.get(i));
            grid.remove(deadCells.get(i));    
        }
        for (int i=0;i<newCells.size();i++)
        {
            System.out.println("Placing new cell at "+newCells.get(i));
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
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("How many rows (y) do you want there to be? ");
        int ROWS2=s.nextInt();
        System.out.print("How many columns (x) do you want there to be? ");
        int COLS2=s.nextInt();
        System.out.print("Input the number of miliseconds you want between generations: ");        
        int seconds=s.nextInt();
        System.out.print("Input the number of generations: ");
        int maxGens=s.nextInt();
        GameOfLife game = new GameOfLife(ROWS2, COLS2);
        game.populateGame();
        int gens=0;
        while (game.cells!=0&&gens<maxGens)
        {
            gens+=1;
            try {
                Thread.sleep(seconds);                 
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            game.createNextGeneration();
        }
        System.out.println(gens);
    }

}
