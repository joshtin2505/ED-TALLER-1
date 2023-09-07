
package controller;

/**
 *
 * @author jostinc
 */
import model.Animal;
public class Controller {
    
    private Animal[] animales = new Animal[5];
    int indice = 0;

    public Controller() {
        
        agregar(new Animal("Canino", "Labrador", "Max", "Dorado", "Sano", 3, 25));
        agregar(new Animal("Felino", "Siames", "Luna", "Gris", "Enfermo", 7, 5));
        agregar(new Animal("Ave", "Canario", "Piolín", "Amarillo", "Sano", 2, 0.1));
        agregar(new Animal("Reptil", "Iguana", "Iggy", "Verde", "Sano", 5, 1));
        agregar(new Animal("Anfibio", "Rana", "Salti", "Verde", "Enfermo", 1, 0.05));
    }

    public void mayoresCantidadAnalgecico(int cantidad) {
        for (int i = 0; i < animales.length; i++) {
            if (animales[i].dosisAnalgésico() >= cantidad) {
                System.out.println(""+animales[i].getInformation());
            }
        }
    }

    public void agregar(Animal a) {
        if (indice < animales.length) {
            animales[indice] = a;
            indice++;
        }
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }
}
