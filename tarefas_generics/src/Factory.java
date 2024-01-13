public  class Factory  {

    private Compass compass;

    private  Corola corola;

    private Dolphin dolphin;

    private Gol gol;

    private Kwid kwid;

    private Uno uno;

    public Compass getCompass(){
        this.compass = new Compass("Jeep", "Compass", 2.4);
        return  this.compass;
    }

    public Corola getCorola(){
        this.corola = new Corola("Toyota", "Corola", 2.0);
        return  this.corola;
    }

    public Dolphin getDolphin(){
        this.dolphin = new Dolphin("BYD", "Dolphin", 2.0);
        return  this.dolphin;
    }


    public Gol getGol(){
        this.gol = new Gol("Wolksvagen", "Gol", 1.6);
        return  this.gol;
    }

    public Kwid getKwid(){
        this.kwid = new Kwid("Kwid", "Renault", 1.0);
        return  this.kwid;
    }

    public Uno getUno(){
        this.uno = new Uno("Fiat", "Uno", 1.0);
        return  this.uno;
    }


}
