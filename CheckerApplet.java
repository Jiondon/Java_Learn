import java.applet.*;
import java.awt.*;
public class CheckerApplet extends Applet{
	int squareSize = 50;  //Ĭ��ֵ��С
	public void init()
	{
		String squareSizeParam = getParameter("squareSize");
		parseSquareSize(squareSizeParam);
		String colorParam = getParameter("color");
		Color fg = parseColor(colorParam);
		setBackground(Color.blue);
		setForeground(fg);
	}
	private void parseSquareSize(String param) 
	{
		if(param == null){
			return;
		}
		try{
			squareSize = Integer.parseInt(param);
		}catch(Exception e){
			
		}
	}
	private Color parseColor(String param){return Color.green;}
	public void paint(Graphics g){}
}
