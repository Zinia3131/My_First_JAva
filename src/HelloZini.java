public class HelloZini {
    public String name;
    public int roll;
    public boolean passed;

    public HelloZini() //constructor; er nam ar class er nam same hote hobe
    {                  //variablegulor value initialized korar jonno use kora hoy
        roll = 31;
        name = "SHU";
        passed = true;
    }

    public HelloZini(String name, int roll, boolean passed)
    {
        this.name = name;
        this.roll = roll;
        this.passed = passed;
    }
    public String getName()
    {
        return name;
    }
    public int getRoll()
    {
        return roll;
    }
    public boolean getPassed()
    {
        return passed;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setRoll(int roll)
    {
        this.roll = roll;
    }
    public void setPass(boolean passed)
    {
        this.passed = passed;
    }

    public static void main(String[] args) {
        HelloZini helloZini = new HelloZini(); //ei line er kaj constructor take call kora
        HelloZini helloZini2 = new HelloZini();
        HelloZini helloZini3 = new HelloZini("CSE",24,true);


        helloZini.setName("zinia");      //changing value setterj
        helloZini.setRoll(100);
        helloZini.setPass(false);

        System.out.println(helloZini.getName());   //Zinia
        System.out.println(helloZini.getRoll());    //100
        System.out.println(helloZini.getPassed());   //false

        System.out.println(helloZini2.getName());   //SHU
        System.out.println(helloZini2.getRoll());    //31
        System.out.println(helloZini2.getPassed());   //true

        System.out.println(helloZini3.getName());   //CSE
        System.out.println(helloZini3.getRoll());    //24
        System.out.println(helloZini3.getPassed());   //true

    }
}
