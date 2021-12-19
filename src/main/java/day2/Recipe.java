package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {
    private String name;
    private List<String > ingredients = new ArrayList<>();
    private String descriprion;

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, String descriprion) {
        this.name = name;
        this.descriprion = descriprion;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getDescriprion() {
        return descriprion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }

    public void printOutAllElements() {
        System.out.println("A sütemény neve:"+name
                +"\nRövid leírás: "+descriprion+"\nÖsszetevők: "+ingredients);
    }

    public void addIngredient(String string, String... more) {
        ingredients.add(string);
        ingredients.addAll(Arrays.asList(more));
    }

    public static void main(String[] args) {
        Recipe retes = new Recipe("Rétes");
        Recipe beigli = new Recipe("Beigli", "mákos beigli");
        String[] ingredientItems = {"tojás","cukor","liszt"};
        beigli.addIngredient("víz", ingredientItems);
        beigli.setName("Beigli");
        beigli.setDescriprion("Finom és mákos");
        beigli.printOutAllElements();
    }
}
