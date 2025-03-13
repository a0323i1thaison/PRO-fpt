
package assignment1;
 

public class Planet {
     String name;
    double mass; // in Earth masses
    double equatorialDiameter; // in km

    public Planet(String name, double mass, double equatorialDiameter) {
        this.name = name;
        this.mass = mass;
        this.equatorialDiameter = equatorialDiameter;
    }

    @Override
    public String toString() {
        return name + " (Mass: " + mass + " Earth masses, Diameter: " + equatorialDiameter + " km)";
    }
    
}
