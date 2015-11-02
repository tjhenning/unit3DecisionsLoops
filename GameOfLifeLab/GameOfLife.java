import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

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
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 5;
    private final int COLS = 5;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
       // createNextGeneration();
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
        // constants for the location of the three cells initially alive
        final int X1 = 1, Y1 = 0;
        final int X2 = 0, Y2 = 2;
        final int X3 = 1, Y3 = 2;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, rock1);
//         
//         Rock rock2 = new Rock();
//         Location loc2 = new Location(Y2, X2);
//         grid.put(loc2, rock2);
//         
//         Rock rock3 = new Rock();
//         Location loc3 = new Location(Y3, X3);
//         grid.put(loc3, rock3);
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
        System.out.println("\nSTART\n");
        Grid<Actor> grid = world.getGrid();
        Location loc = new Location(1, 1);   
        Location[] newCells=new Location[90];
        int around;
        Rock rocks= new Rock();
        int count=0;
        
        
        for (int i2=0; i2<ROWS-1; i2++)
            {                
                for (int i=0; i<COLS-1; i++)
                {
                    System.out.println("x="+i+" y="+i2);
                    loc=new Location(i2,i);
                    ArrayList<Location> around1= grid.getOccupiedAdjacentLocations(loc);
                    
                    around=around1.size();
                    if (around<2||around>3)
                    {
                        System.out.println("count="+around);
                        if (getActor(i,i2)!=null)
                        {
                            loc = new Location(i2, i);
                            world.remove(loc);           
                        }
                    }
                    else if (getActor(i,i2)==null)
                    {
                        System.out.println();
                        System.out.println("Placing."+" Count="+around);
                        newCells[count] =new Location(i2, i);
                        count+=1;
                    }
                    
                }
          }
        for (int i=0;i<newCells.length;i++)
        {
            System.out.println("Got this far!");
            grid.put(newCells[i], rocks);    
        }
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
        GameOfLife game = new GameOfLife();
    }

}
