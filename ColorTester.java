class ColorTester {
    public static void main(String[] args) {
        Color color1= new Color(-2,55,257);
        System.out.println(color1);
        color1.randomize();
        System.out.println(color1);
        color1.setGreen(122);
        System.out.println(color1);
        color1.darkenBlue(0.1);
        System.out.println(color1);
        color1.LightenBlue(0.1);
        System.out.println(color1);
    }
}