package museo;

public class Artwork {
  
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

    public Artwork(String type, int creationYear, String author, String material, double height, double weight, double width, double diameter, double thickness, double commercialValue, double historicalValue, String description, String title) {
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
}
