package model;

/**
 *
 * @author jostinc
 */
public class Planta {
    private int code;
    private double height ;
    private double neckDiameter ;
    private double rootVolume ;
    private String scientificName ;
    private String popularName ;
    private String leafColor ;
    private String type;

    public Planta() {
    }
    
    public Planta(int code, double height, double neckDiameter, double rootVolume, String scientificName, String popularName, String leafColor, String type) {
        this.code = code;
        this.height = height;
        this.neckDiameter = neckDiameter;
        this.rootVolume = rootVolume;
        this.scientificName = scientificName;
        this.popularName = popularName;
        this.leafColor = leafColor;
        this.type = type;
    }
    
    public void showCompliteInformation(){
        System.out.println(this.code + ": " + this.scientificName + "\n" + this.popularName + "\n" + this.height + ", " + this.neckDiameter + ", " + this.rootVolume + ", " + this.leafColor + ", " + this.type );
    }
    public void showParcialInformation(){
        System.out.println(this.code + ": " + this.scientificName + "\n ------------------------ \n        " + this.leafColor + ", " + this.type );
        
    }
    public void heightCodicion(){
        if(this.height > 200){
            System.out.println("Para Exteriores");
        }
        else{
            System.out.println("Para Interirores");
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getNeckDiameter() {
        return neckDiameter;
    }

    public void setNeckDiameter(double neckDiameter) {
        this.neckDiameter = neckDiameter;
    }

    public double getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(double rootVolume) {
        this.rootVolume = rootVolume;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getPopularName() {
        return popularName;
    }

    public void setPopularName(String popularName) {
        this.popularName = popularName;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
