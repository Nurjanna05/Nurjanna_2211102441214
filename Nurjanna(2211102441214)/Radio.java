import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Radio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Radio extends Actor implements InterfaceElektronik, InterfaceChannelRadio {
    private boolean mesin;
    private int volume;
    
    public Radio() {
        mesin = false;
        volume = 0;
    }
    
    public void on() {
        mesin = true;
    }
    
    public void off() {
        mesin = false;
    }
    
    public void gantiChannel(int c) {
        // Tujuannya untuk mengantikan channel pada radio
    }
    
    public void perbesarVolume() {
        // Tujuannya untuk memperbesar volume pada radio
    }
    
    public void perkecilVolume() {
        // Tujuannya untuk memperkecil volume pada radio
    }
    
    public void act() {
        // Tujuannya untuk memperilakukan aktor Radio di setiap siklus aksi
    }
}
