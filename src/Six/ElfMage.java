
package Six;


public class ElfMage{

    protected int hit;
    protected int health;
    protected int PrimaryFire;
    protected int SecondaryFire;
    
    public ElfMage(int health,int hit,int PrimaryFire,int SecondaryFire){
        
        this.PrimaryFire= PrimaryFire;
        this.SecondaryFire = SecondaryFire;
        this.health = health;
        this.hit = hit;
    }
    
    public void Go(){  
     
        System.out.println("You have: "+(health-hit)+" health left");
        System.out.println("You have: "+(PrimaryFire-15)+ " PrimaryWeapon left");
        System.out.println("You have: "+(SecondaryFire-50)+" SecondaryWeapon left");
        
     
    }

}
