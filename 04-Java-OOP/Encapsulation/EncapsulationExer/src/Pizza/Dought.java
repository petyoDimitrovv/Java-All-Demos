package Pizza;

public class Dought {
   private FlourType flourType;
   private BakingTechnique bakingTechnique;
   private double weight;

    public Dought(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);

    }
    private  void setFlourType(String flourType) {
        try {
            this.flourType = FlourType.valueOf(flourType.toUpperCase());
        }catch (Exception ex){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
       try {
        this.bakingTechnique = BakingTechnique.valueOf(bakingTechnique.toUpperCase());

       } catch (Exception ex){
           throw new IllegalArgumentException("Invalid type of dough.");
       }
    }

    public FlourType getFlourType() {
        return flourType;
    }

    public BakingTechnique getBakingTechnique() {
        return bakingTechnique;
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        if (this.weight < 0 || this.weight >200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200]");
        }
        this.weight = weight;
    }
    public double calculateCalories(){
        return 2 * this.getWeight() * this.getFlourType().getModifier() * this.getBakingTechnique().getModifier();

    }

}
