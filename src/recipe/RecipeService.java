package recipe;

public interface RecipeService {
	Recipe findById(int id);
	Recipe createRecipe(String name);
}
