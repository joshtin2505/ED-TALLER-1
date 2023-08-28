package vivero;

public class Plant {
    private int code;
    private double height ;
    private double neckDiameter ;
    private double rootVolume ;
    private String scientificName ;
    private String popularName ;
    private String leafColor ;
    private String type;

    public Plant() {
    }
    
    public Plant(int code, double height, double neckDiameter, double rootVolume, String scientificName, String popularName, String leafColor, String type) {
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
}
