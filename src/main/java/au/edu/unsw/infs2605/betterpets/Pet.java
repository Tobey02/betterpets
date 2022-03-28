package au.edu.unsw.infs2605.betterpets;

/**
 *
 * @author infs2605
 */
public class Pet {
    // Attributes of Pet
    protected int id;
    protected String name;
    protected String species;
    protected String colour;
    protected String owner;
    
    //Createv a constructor for the PEt class 
    public Pet(int id, String name, String species, String colour, String owner){
        this.id = id; 
        this.name = name; 
        this.species = species; 
        this.colour = colour; 
        this.owner = owner; 
    }

    
    
    // Create getters and setters for a Pet class
}
