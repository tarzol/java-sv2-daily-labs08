package day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void testByName() {
        Recipe byName = new Recipe("Mákos beigli");
        assertEquals("Mákos beigli", byName.getName());
    }

    @Test
    void testByNameAndDescription() {
        Recipe byNameAndDescription = new Recipe("Diós beigli", "Finom és édes");
        assertEquals("Diós beigli", byNameAndDescription.getName());
        assertEquals("Finom és édes", byNameAndDescription.getDescriprion());
        assertEquals(0, byNameAndDescription.getIngredients().size());
    }

    @Test
    void testAddIngredient() {
        Recipe goulash = new Recipe("Gulyásleves");
        String[] ingredientItems = {"tojás","cukor","liszt"};
        assertEquals(0, goulash.getIngredients().size());
        goulash.addIngredient("paprika", ingredientItems);
        assertEquals(4, goulash.getIngredients().size());
        assertArrayEquals(new String[]{"paprika","tojás","cukor","liszt"}, goulash.getIngredients().toArray());
    }
}