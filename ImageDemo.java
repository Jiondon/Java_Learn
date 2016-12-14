import java.awt.*;
import java.applet.*;
import java.net.*;
public class ImageDemo extends Applet{
	private Image image;
	private AppletContext context;
	
	public void init(){
		context = getAppletContext();
		String imageURL = this.getParameter("image");
		if(imageURL == null){
			imageURL = "backHome.png";
		}
		try{
			URL url = new URL(this.getDocumentBase(),imageURL);
			image = context.getImage(url);
			
		}catch(MalformedURLException e){
			e.printStackTrace();
//			System.out.println(arg0);
			context.showStatus("Could not load image!");
		}
	}
	
	public void paint(Graphics g){
		context.showStatus("displaying image");
		g.drawImage(image, 0, 0, 98,101,null);
		g.drawString("www.javalicense.com", 35, 100);
	}

}
