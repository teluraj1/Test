import javax.swing.JOptionPane;
public class Salary
{
  public static void main(String args[])
  {
    String salary,s;
	int selection,per_month,no_of_working_days,year;
	boolean isyes,iscancel;
	JOptionPane.showMessageDialog(null,"FINDING THE SALARY OF AN EMPLOYEE ! ");
	selection=JOptionPane.showConfirmDialog(null,"Do You Want To Know Your Salary ");
	isyes=(selection==JOptionPane.YES_OPTION);
	iscancel=(selection==JOptionPane.CANCEL_OPTION);
	if(isyes)
	{
		JOptionPane.showMessageDialog(null,"You Responded "+isyes);
		s=JOptionPane.showInputDialog(null,"Enter The No.of Working Days ",JOptionPane.QUESTION_MESSAGE);
		no_of_working_days=Integer.parseInt(s);
	    salary=JOptionPane.showInputDialog(null,"Enter the salary Per Day ",JOptionPane.QUESTION_MESSAGE);
	    per_month=Integer.parseInt(salary)*no_of_working_days;
	    JOptionPane.showMessageDialog(null,"Salary Of An  Employ For ONE MONTH is Rs."+per_month+"/-");
	    year=per_month*12;
	    JOptionPane.showMessageDialog(null,"Salary Per Annum : "+year);
	    JOptionPane.showMessageDialog(null,"Thank You !");
	}
    else
	{
       JOptionPane.showMessageDialog(null,"Not Interested !"+iscancel);	
	   JOptionPane.showMessageDialog(null,"Thank You !");
	}
  }
}  