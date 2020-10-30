import java.util.*;

public class Color {
    Random colorGenerator = new Random();
    int red;
    int green;
    int blue;

    public Color(int red, int green, int blue) {
        setRed((red));
        setGreen((green));
        setBlue((blue));
    }

    public Color() {
        setRed(colorGenerator.nextInt(256));
        setGreen(colorGenerator.nextInt(256));
        setBlue(colorGenerator.nextInt(256));
        
    }

    public void randomize() {
        setRed(colorGenerator.nextInt(256));
        setGreen(colorGenerator.nextInt(256));
        setBlue(colorGenerator.nextInt(256));
    }

    private int colorCorrect(int input) {
        if (input > 255) {
            input = 255;
        }
        if (input < 0) {
            input = 0;
        }
        return input;
    }

    public void setRed(int red) {this.red = colorCorrect(red);}
    public void setGreen(int green) {this.green = colorCorrect(green);}
    public void setBlue(int blue) {this.blue = colorCorrect(blue);}
    public int getRed() {return red;}
    public int getGreen() {return green;}
    public int getBlue() {return blue;}

    public void darkenRed(double percent) {
        this.red = (int)(red * (1 + (-1 * percent)));
    }
    public void darkenGreen(double percent) {
        this.green = (int)(green * (1 + (-1 * percent)));
    }
    public void darkenBlue(double percent) {
        this.blue = (int)(blue * (1 + (-1 * percent)));
    }
    public void LightenRed(double percent) {
        this.red = (int)(red * (1 + (percent)));
    }
    public void LightenGreen(double percent) {
        this.green = (int)(green * (1 + (percent)));
    }
    public void LightenBlue(double percent) {
        this.blue = (int)(blue * (1 + (percent)));
    }
    
    public String toString() {
        return "[" + red +", " + green + ", " + blue + "]";
    }
    
}
