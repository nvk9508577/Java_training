import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {
	
	 MyFrame mf;

	public ActionHandler(MyFrame myFrame) {
		this.mf = myFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
				
		String a = mf.firstTf.getText();
		String b = mf.secondTf.getText();
		
		float firstNo = Float.parseFloat(a);
		float SecondNo = Float.parseFloat(b);
		
						
		if (e.getActionCommand().equalsIgnoreCase("Addtion")){
			
			float result = firstNo + SecondNo;
			mf.lbl.setText("Answer is:  " + result);
		
			
		}else if (e.getActionCommand().equalsIgnoreCase("Subtraction")) {
			
			float  result = firstNo - SecondNo;
			System.out.println(result);
			mf.lbl.setText("Answer is:  " + result);
			
		}else if (e.getActionCommand().equalsIgnoreCase("Multiplication")){
			
			float result = firstNo * SecondNo;
			System.out.println(result);
			mf.lbl.setText("Answer is:  " + result);
			
		}else if (e.getActionCommand().equalsIgnoreCase("Division")){
					
			float result = firstNo / SecondNo;
			System.out.println(result);
			mf.lbl.setText("Answer is:  " + result);
			
		}
}
		
		catch (Exception ex){
			if(ex.getMessage() == "empty String" ) {
				mf.lbl.setText("Either or both the input box(es) is empty");
				System.out.println(ex);	
				
			}
			else {
			mf.lbl.setText("Please input the number only");
			System.out.println(ex.getMessage());
			}
		}
		
	}
		

}
	
