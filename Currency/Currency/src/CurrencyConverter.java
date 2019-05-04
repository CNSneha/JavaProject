import java.util.*;
import java.text.DecimalFormat;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class CurrencyConverter extends JFrame //implements ActionListener
{
	public CurrencyConverter()
	{
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		
		String currency[] = {"Rupees","Dollar","Pound","Euro","Yen"};
         JComboBox <String> jc = new JComboBox <String>();
         for(int i=0;i<currency.length;i++)
         {
        	 jc.addItem(currency[i]); 
        	
         }
        jp.add(jc);
         
         JComboBox <String> jc1 = new JComboBox <String>();
         for(int i=0;i<currency.length;i++)
         {
        	 jc1.addItem(currency[i]); 
        	
         }
         jp.add(jc1);
         getContentPane().add(jp);
         
         JTextField jf = new JTextField(5);
         jp.add(jf);
         JButton jb = new JButton("CONVERT");
         jp.add(jb);
         JTextField jf1 = new JTextField(15);
         jp.add(jf1);
         jb.addActionListener(new ActionListener(){
        	 public void actionPerformed(ActionEvent evn)
        	 { 
        		 String f = jc.getSelectedItem().toString();
        		 String s = jc1.getSelectedItem().toString();
        		 System.out.println(f+s);
        		 Double value=0.0;
        		 try {
        		 value=Double.parseDouble(jf.getText());
        		 System.out.println(value);
        		 }
        		 catch(Exception e){
        			 jf1.setText("Enter a value");
        		 }
        		 if(f.equals("Rupees"))
        		 {
        			 jf1.setText(convertFromRupees(value,s).toString()); 
        		 }
        		 if(f.equals("Dollar"))
        		 {
        			 jf1.setText(convertFromDollars(value,s).toString());
        		 }
        		 else if(f.equals("Euro"))
        		 {
        			 jf1.setText(convertFromEuro(value,s).toString());
        		 }
        		 else if(f.equals("Yen"))
        		 {
        			 jf1.setText(convertFromYen(value,s).toString()); 
        		 }
        		 else if(f.equals("Pound"))
        		 {
        			 jf1.setText(convertFromPound(value,s).toString());
        		 }
        		 
        	 }
         });
         
	}
	
	Double convertFromRupees(Double rup,String tes) {
        	
        	Double ret=0.0;
        	if(tes.equals("Dollar"))
            ret= rup / 66;
            if(tes.equals("Pound"))
            ret = rup / 98;
            if(tes.equals("Euro"))
            ret = rup / 72;
            if(tes.equals("Yen"))
            ret = rup/0.55;
        
        return ret;
	}
	
	Double convertFromDollars(Double rup,String tes)
	{	
		Double ret=0.0;
		if(tes.equals("Rupees"))
        ret = rup * 66;
		if(tes.equals("Pound"))
        ret = rup * 0.67;
		if(tes.equals("Euro"))
        ret = rup * 0.92;
		if(tes.equals("Yen"))
        ret = rup * 120.90;
       
		return ret;
    }
	
	Double convertFromPound(Double rup,String tes)
	{	
		Double ret=0.0;
		if(tes.equals("Rupees"))
        ret = rup * 98;
		if(tes.equals("Dollar"))
        ret = rup * 1.49;
		if(tes.equals("Euro"))
        ret = rup * 1.36;
		if(tes.equals("Yen"))
        ret = rup * 179.89;
       
		return ret;
    }
	
	Double convertFromEuro(Double rup,String tes)
	{	
		Double ret=0.0;
		if(tes.equals("Rupees"))
        ret = rup * 72;
		if(tes.equals("Pound"))
        ret = rup * 0.73;
		if(tes.equals("Dollar"))
        ret = rup * 1.09;
		if(tes.equals("Yen"))
        ret = rup * 131.84;
       
		return ret;
    }
	
	
	Double convertFromYen(Double rup,String tes)
	{	
		Double ret=0.0;
		if(tes.equals("Rupees"))
        ret = rup * 0.55;
		if(tes.equals("Pound"))
        ret = rup * 0.01;
		if(tes.equals("Euro"))
        ret = rup * 0.01;
		if(tes.equals("Dollar"))
        ret = rup * 0.01;
       
		return ret;
    }
	
    public static void main(String[] args) 
        {
           CurrencyConverter cc = new CurrencyConverter();
           cc.setSize(500,500);
           cc.setVisible(true);
           cc.setDefaultCloseOperation(cc.EXIT_ON_CLOSE);
        		  double rupee,dollar,pound,code,euro,yen;
           
            
            
            DecimalFormat f = new DecimalFormat("##.###");

           
                 

    }
                
}