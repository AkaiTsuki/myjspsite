package recipe;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class NewRecipe extends ActionSupport implements ModelDriven{

	@Override
	public String execute() throws Exception {
		recipe=service.createRecipe(recipe.getName());
		return SUCCESS;
	}
	
	private Recipe recipe=new Recipe();
	private RecipeService service= new FakeRecipeService();

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	@Override
	public void validate() {
		if(recipe.getName().trim().length()==0){
			this.addFieldError("name", getText("recipe.name.required"));
		}
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return recipe;
	}
	
}
