package veterinaria;


public class Animal {
    private String tipo;
    private String raza;
    private String nombre;
    private int edad;
    private double peso;
    private String color;
    private String estado;
   
    public Animal(){
    }
   
    public Animal(String tipo, String raza, String nombre, int edad, double peso, String color, String estado) {
        this.tipo = tipo;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
        this.estado = estado;
    }
   
    public double calcularDosisAnalgésico() {
        if (peso < 10) {
            return 5.0;
        } else if (peso >= 10 && peso <= 20) {
            return 8.0;
        } else if (peso > 20 && peso <= 30) {
            return 12.0;
        } else {
            return 15.0;
        }
    }
    public String obtenerInformacion() {
        if (estado.equals("Sano")) {
            return nombre.toUpperCase() + " - " + raza + ", " + tipo + ", " + edad + " años.";
        } else if (estado.equals("Enfermo")) {
            return nombre.substring(0, 1).toUpperCase() + nombre.substring(1) + " - " +
                   tipo + ", " + edad + " años-" + peso + "kg, " + color + ".";
        } else {
            return "Información no disponible.";
        }
   
    }
   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
    public boolean esMismaRazaYTipo(Animal otroAnimal) {
        return this.raza.equals(otroAnimal.raza) && this.tipo.equals(otroAnimal.tipo);
    }
   
   
}
