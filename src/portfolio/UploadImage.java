package portfolio;

import java.io.File;



import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadImage extends ActionSupport {
	
	public static final String UPLOAD_PATH="/Users/jiachiliu/Documents/workspace/myjspsite/WebContent/portfolio/upload";
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String realpath=ServletActionContext.getServletContext().getRealPath("/portfolio/upload");
		File des=new File(new File(realpath),pictureFileName);
		FileUtils.copyFile(picture, des);
		return SUCCESS;
	}
	
	private File picture;
	private String pictureContentType;
	private String pictureFileName;
	
	public File getPicture() {
		return picture;
	}
	public void setPicture(File picture) {
		this.picture = picture;
	}
	public String getPictureContentType() {
		return pictureContentType;
	}
	public void setPictureContentType(String pictureContentType) {
		this.pictureContentType = pictureContentType;
	}
	public String getPictureFileName() {
		return pictureFileName;
	}
	public void setPictureFileName(String pictureFileName) {
		this.pictureFileName = pictureFileName;
	}
	
	private PortfolioService getService(){
		return new PortfolioService();
	}
}
