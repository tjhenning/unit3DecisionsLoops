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
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 30;
    private final int COLS = 50;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
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
        // constants for the location of the three cells initially alive

//         Scanner s=new Scanner(System.in);
//         System.out.println("Tell me when you want to start.");
//         s.next();
        System.out.println("\nSTART\n");
        Grid<Actor> grid = world.getGrid();        
        Rock rock = new Rock();        
        Location loc=new Location(6,1);
        int x=0;
        int y=0;
        /** INSERT "SAMPLE CODE" HERE */
//         grid.put(loc, rock);
//         loc=new Location(6,2);
//         grid.put(loc, rock);
//         loc=new Location(7,1);
//         grid.put(loc, rock);
//         loc=new Location(7,2);
//         grid.put(loc, rock);
        for (int i=0;i>7;i++)
        {
            loc=new Location(7,2+i);
            grid.put(loc, rock);
            System.out.println("why this no work");
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
                    //System.out.println("x="+i+" y="+i2);
                    loc=new Location(i2,i);

                    ArrayList<Location> around1= grid.getOccupiedAdjacentLocations(loc);
                    
                    around=around1.size();
                    if (around<2||around>3)
                    {
                        //System.out.println("count="+around);
                        if (getActor(i2,i)!=null)
                        {
                            //System.out.println("Removing. x="+i+" y="+i2);                            
                            deadCells.add(loc);          
                        }
                    }
                    else if (around==3&&getActor(i2,i)!=null)
                    {
                        System.out.println();
                        //System.out.println("Placing."+" Count="+around);
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
            grid.put(newCells.get(i), rocks);    
        }
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
        GameOfLife game = new GameOfLife();
        game.populateGame();
        while (true)
        {
            try {
                Thread.sleep(300);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            game.createNextGeneration();
           
        }
    }

}
