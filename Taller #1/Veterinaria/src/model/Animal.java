/*
En una clínica veterinaria se desea sistematizar la información de los pacientes animales, es
por eso que se requiere crear una clase que permita crear objetos animales con las
siguientes características: tipo, raza, nombre, edad, peso, color y estado.

o Se requiere para esta clase los siguientes métodos:
▪ Un método que reciba un objeto de tipo Animal, y compare si es de la
misma raza y tipo del objeto que implementa el método.
▪ Un método que muestre la cantidad de analgésico que se le puede
suministrar a un animal de acuerdo a su peso: si pesa menos de 10 -> 5cc,
si pesa entre 10 y 20 -> 8cc, si pesa entre 20 y 30 -> 12cc, si pesa más de 30
-> 15cc.
▪ Un método que muestre la siguiente información de un animal: si el estado
es “Sano” -> NOMBRE EN MAYUSCULA – Raza, Tipo, edad. Si el estado es
“Enfermo” -> Nombre En inicial mayúscula - Tipo, Edad-peso, Color.
*/
package model;

/**
 *
 * @author jostinc
 */
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
    
    public boolean esMismaRazaYTipo(Animal otroAnimal) {
        return this.raza.equals(otroAnimal.raza) && this.tipo.equals(otroAnimal.tipo);
    }
    
    public double dosisAnalgésico() {
        if (peso < 10) {
            return 5;
        } else if (peso >= 10 && peso <= 20) {
            return 8;
        } else if (peso > 20 && peso <= 30) {
            return 12;
        } else {
            return 15;
        }
    }
    public String getInformation() {
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
   
   
   
}
