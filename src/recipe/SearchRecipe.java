package recipe;

import com.opensymphony.xwork2.ActionSupport;

public class SearchRecipe extends ActionSupport {

	private Recipe recipe;
	private RecipeService service=new FakeRecipeService();
	

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	@Override
	public String execute() throws Exception {
		recipe=service.findById(recipe.getId());		
		return SUCCESS;
	}

	@Override
	public void validate() {
		if(recipe==null || recipe.getId()==null)
			this.addFieldError("id", getText("recipe.id.required"));
	}

}
