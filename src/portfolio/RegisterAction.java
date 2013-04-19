package portfolio;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction extends ActionSupport implements ModelDriven {

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if(user.getUsername().trim().length()==0)
			this.addFieldError("username", this.getText("username.required"));
		if(user.getPassword().trim().length()==0)
			this.addFieldError("password", this.getText("password.required"));
		if(user.getPortfolioName().trim().length()==0)
			this.addFieldError("portfolioName", this.getText("portfolioName.required"));
	}
	
	private PortfolioUser user=new PortfolioUser();

	@Override
	public Object getModel() {
		return user;
	}	
}
