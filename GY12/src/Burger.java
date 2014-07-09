


public class Burger {
          
    private String name;
    private double preis;
    private boolean kaese;  
    private String soße;
    
  public Burger (String name, double preis, boolean kaese, String soße) {
        setName(name);
        setPreis(preis);
        setKaese(kaese);
        setSoße(soße);
  }

  public void setName(String name) {if( name != null)
      this.name = name;}
  public void setPreis (double preis) {if( preis >=0){this.preis = preis;
  }else{ this.preis = preis * 0; 
  }}
  public void setKaese (boolean kaese) {if ( kaese != false) this.kaese = kaese;}
  public void setSoße(String soße) {if( soße != null)
      this.soße = soße;}
  
   public String getName() {return name;}
   public double getPreis() {return preis;}
   public boolean getKaese() {return kaese;}
   public String getSoße() {return soße;}
   
   @Override
   public String toString (){
       return " Name: " +getName() + " | Preis: " +getPreis() + "€" + " | Käse: " +getKaese() + " | Soße: " +getSoße();
   } 
}


