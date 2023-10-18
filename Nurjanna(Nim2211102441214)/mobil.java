import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mobil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mobil extends Actor
{
    protected boolean mesin;
    
    public mobil() {
        mesin = false;
    }
    
    public void act() {
        // tujuannya untuk melakukan setiap siklus aksi (act) objek Mobil
    }
    
    public void nyalakanMesin() {
        mesin = true;
    }
    
    public void matikanMesin() {
        mesin = false;
    }
}
