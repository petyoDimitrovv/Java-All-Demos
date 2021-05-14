package animals;

public abstract class Animals {
    private String name;
    private String favoriteFood;

    protected Animals(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

   private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getFavoriteFood() {
        return favoriteFood;
    }

    private void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
    public String explainSelf(){
       return String.format
                ("I am %s and my favourite food is %s", getName(),getFavoriteFood());

    }
}

