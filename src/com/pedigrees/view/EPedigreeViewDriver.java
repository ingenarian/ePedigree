/**
 * 
 */
package com.pedigrees.view;
import com.pedigrees.view.ElectronicPedigreeJFrame;

/**
 * EPedigree View Driver is a utility to test drive the
 * ElectronicPedgireeFrame.
 * @author Ish
 *
 */
public class EPedigreeViewDriver 
{
	public static void main(String[] args)
	{
		EPedigreeViewDriver callingEpedigreeViewDriver = new EPedigreeViewDriver();
		callingEpedigreeViewDriver.view();
	}

	// calls ElectronicPedigreeFrame in view
	public void view()
	{
		ElectronicPedigreeJFrame ePF = new ElectronicPedigreeJFrame();
		ePF.setSize(435, 220);
		ePF.setVisible(true);
	}
}
