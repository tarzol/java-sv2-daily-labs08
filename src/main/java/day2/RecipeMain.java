package day2;

public class RecipeMain {
    public static void main(String[] args) {
        Recipe retes = new Recipe("Rétes");
        Recipe beigli = new Recipe("Beigli", "mákos beigli");
        String[] ingredientItems = {"tojás","cukor","liszt"};
        beigli.addIngredient("víz", ingredientItems);
        beigli.setName("Beigli");
        beigli.setDescriprion("Finom és mákos");
        beigli.printOutAllElements();

        System.out.println(beigli.getName());
        System.out.println(beigli.getDescriprion());

    }
}
