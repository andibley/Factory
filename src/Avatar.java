import sun.security.x509.AVA;

public class Avatar {
    int posx;
    int posy;
    int dx;
    int dy;
    int height;
    int width;
    String power;
    String role;
    String weakness;

    public Avatar() {
        posx = 400;
        posy = 600;
        dx = 20;
        dy = 70;
        height = 175;
        width = 220;
        power = "run";
        role = "villain";
        weakness = "pride";
    }

    public Avatar(int pposx, int pposy, int pdx, int pdy, int pheight, int pwidth, String ppower, String pweakness, String prole) {
        posx = pposx;
        posy = pposy;
        dx = pdx;
        dy = pdy;
        height = pheight;
        width = pwidth;
        power = ppower;
        role = prole;
        weakness = pweakness;
    }

public void print(){
   System.out.println("The " + role + " can " + power + " and their weakness is " + weakness);
   System.out.println("They are at location (" + posx+ "," + posy +")");
}







}
