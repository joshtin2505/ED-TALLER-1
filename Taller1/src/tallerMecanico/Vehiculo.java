
package tallerMecanico;


/*
La gerencia de un taller mecánico necesita un sistema para controlar los vehículos que
ingresan a sus instalaciones. En este caso, las características esenciales de la clase vehículo
son: Marca, Modelo, Color, Falla detectada, Nombre del Propietario, Dirección del
Propietario, Teléfono del Propietario.
o Crear un método que muestre la siguiente información: si el modelo es superior a
5 años: MARCA – Nombre del Propietario, falla detectada. Si el modelo es inferior a
5 años y superior a 2 años: Nombre del propietario, FALLA DETECTADA en
MAYUSCULA, Modelo. Si el modelo es inferior a 2 años: Marca – falla.
o Crear un método que reciba dos objetos de tipo Vehículo y muestre si son de la
misma marca o no.
o 
*/
public class Vehiculo {
    private String trademark ;
    private String modelName ;
    private int modelYear;
    private String color ;
    private String failure ;
    private String ounerName ;
    private String address ;
    private int phoneNumber;

    public Vehiculo() {
    }
    
    public Vehiculo(String trademark, String modelName, int modelYear, String color, String failure, String ounerName, String address, int phoneNumber) {
        this.trademark = trademark;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.failure = failure;
        this.ounerName = ounerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public void andtiguedad(){
        if (modelYear > 5) {
            System.out.println(trademark + " - " + ounerName + ", " + failure);
        } else if (modelYear > 2) {
            System.out.println(ounerName + ", " + failure.toUpperCase() + ", " + trademark);
        } else {
            System.out.println(trademark + " - " + failure);
        }
    }
    
    public void mismaMarca(Vehiculo otroVehiculo) {
        if (this.trademark.equals(otroVehiculo.trademark)){
            System.out.println("Es la misma marca" + this.trademark );
        }
        else {
            System.out.println("Son marcas diferentes:" + this.trademark + " y " + otroVehiculo.trademark);
        }
    }
    
    /*
        Crear un objeto que reciba el valor de una marca, y si es igual al de la instancia que
        implementa el método: mostrar (Modelo-Color) en Mayúscula, si no: mostrar
        (“Objeto no pertenece a la marca suministrada”
    */    
    
    private void mostrar (boolean condicion){
        if (condicion){
            System.out.println(this.trademark + "-" + this.color);
        }
        else if (!condicion){
            System.out.println("Objeto no pertenece a la marca suministrada");
        }
    }
    
    public void markValor (String trademarkIn){
        if (trademarkIn.equals(trademark)){
            mostrar(false);
        }
        else{
            mostrar(true);
        }
    }
    

    
    
    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFailure() {
        return failure;
    }

    public void setFailure(String failure) {
        this.failure = failure;
    }

    public String getOunerName() {
        return ounerName;
    }

    public void setOunerName(String ounerName) {
        this.ounerName = ounerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
