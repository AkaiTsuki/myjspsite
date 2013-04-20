package recipe;

public class FakeRecipeService implements RecipeService {

	@Override
	public Recipe findById(int id) {
		Recipe r=new Recipe();
		r.setId(id);
		r.setName("Fake Recipe");
		return r;
	}

	@Override
	public Recipe createRecipe(String name) {
		Recipe r=new Recipe();
		r.setId(0);
		r.setName(name);
		return r;
	}

}
