package scrapings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class scrapelink {
	public void scrapelinkfunc(int flag) throws AWTException {
		System.out.println("scrapelink");
		Robot r = new Robot();
		r.delay(10000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(1000);
		
		//driver.close();
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_TAB);
		r.delay(1000);
		//r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_TAB);
		r.delay(1000);
		//r.keyPress(KeyEvent.VK_ALT);
		//if(flag==1) {
		r.keyPress(KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		//}
		r.keyRelease(KeyEvent.VK_ALT);
		r.delay(1000);
		
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK); 
		r.delay(1000);
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		
		r.keyPress(KeyEvent.VK_M);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_M);
		r.delay(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.delay(1000);
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_F11);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_F11);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_LEFT);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_ALT);
		r.delay(1000);
		
		System.out.println("DOne");
	}
	
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		Robot r = new Robot();
		r.delay(10000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(1000);
		
		//driver.close();
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_TAB);
		r.delay(1000);
		//r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_TAB);
		r.delay(1000);
		//r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ALT);
		r.delay(1000);
		
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK); 
		r.delay(1000);
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		
		r.keyPress(KeyEvent.VK_M);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_M);
		r.delay(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.delay(1000);
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_F11);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_F11);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_LEFT);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_ALT);
		r.delay(1000);
		
		System.out.println("DOne");
	}

}
