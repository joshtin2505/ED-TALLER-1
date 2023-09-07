/*
    Se requiere un sistema de información para un museo, el cual controle la información de las
    obras de artes, cada obra de arte debe tener las siguientes propiedades: tipo, año de
    creación, autor, material, altura, peso, ancho, diámetro, espesor, valor comercial, valor
    histórico, descripción, título de obra.
    o Se requiere para esta clase los siguientes métodos:
    ▪ Un método que muestre el espacio que se requiere para su ubicación en el
    museo (tener en cuenta sus medidas).
    ▪ Un método que muestre el siguiente mensaje de acuerdo a la antigüedad
    de la obra: menor de 10 años -> “Contemporáneo”, entre 10 y 30 años –>
    “Arte Moderno”, entre 30 y 100 años -> antiguo, mayor a 100 años ->
    “Reliquia”.
    ▪ Un método que permita ver la siguiente información de una obra: si es
    reliquia -> mostrar: “Autor, TITULO EN MAYUSCULA – Material. Si es
    Contemporáneo -> mostrar: “Titulo con inicial en mayúscula: Descripción
    en minúscula.
 */
package model;

/**
 *
 * @author usuario
 */
public class ObrasDeArte {
    private String type;
    private int creationYear;
    private String author;
    private String material;
    private double height;
    private double weight;
    private double width;
    private double diameter;
    private double thickness;
    private double commercialValue;
    private double historicalValue;
    private String description;
    private String title;

    public ObrasDeArte() {
    }

    public ObrasDeArte(String type, int creationYear, String author, String material, double height, double weight, double width, double diameter, double thickness, double commercialValue, double historicalValue, String description, String title) {
        this.type = type;
        this.creationYear = creationYear;
        this.author = author;
        this.material = material;
        this.height = height;
        this.weight = weight;
        this.width = width;
        this.diameter = diameter;
        this.thickness = thickness;
        this.commercialValue = commercialValue;
        this.historicalValue = historicalValue;
        this.description = description;
        this.title = title;
    }
    
    public double calculateRequiredSpace() {
        return height * width * thickness;
    }

    public String determineAgeCategory() {
        int age = 2023 - creationYear;

        if (age < 10) {
            return "Contemporary";
        } else if (age >= 10 && age <= 30) {
            return "Modern Art";
        } else if (age > 30 && age <= 100) {
            return "Antique";
        } else {
            return "Relic";
        }
    }

    public void displayInformation() {
        String ageCategory = determineAgeCategory();

        if (ageCategory.equals("Relic")) {
            System.out.println(author + ", " + title.toUpperCase() + " - " + material);
        } else if (ageCategory.equals("Contemporary")) {
            System.out.println(capitalizeFirstLetter(title) + ": " + description.toLowerCase());
        }
    }

    private String capitalizeFirstLetter(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public double getCommercialValue() {
        return commercialValue;
    }

    public void setCommercialValue(double commercialValue) {
        this.commercialValue = commercialValue;
    }

    public double getHistoricalValue() {
        return historicalValue;
    }

    public void setHistoricalValue(double historicalValue) {
        this.historicalValue = historicalValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
