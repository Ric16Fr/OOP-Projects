package Time;
/*
 * Created on 05.04.2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author gert.faustmann
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MyTimeTest {

	public static void main(String[] args) {
		myTime z1 = new myTime(20, 23, 10);
//		z1.reset();
		z1.print();
		z1.advance(0,1,1);
		z1.print();
		z1.advance(0,36,49);
        z1.print();
		
		myTime z2 = new myTime(23, 59, 59);
		z2.print();
		z2.advance(0,0,1);
		z2.print();
	}
}
