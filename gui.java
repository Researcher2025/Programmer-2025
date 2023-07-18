//program to create menu bar
import java.awt.*;
import java.awt.event.*;

 class Frame1 implements ActionListener
 {   
	    Label l1;
            Frame1()
            {
             Frame f1=new Frame("My New Frame");
		f1.setLayout(null);
             MenuBar mb=new MenuBar();
             l1=new Label("Label1");
             l1.setBounds(100,400,100,100);
             Menu m1=new Menu("file");
             Menu m2=new Menu("Edit");
             Menu m3=new Menu("format");
             Menu m4=new Menu("Help");
           //File Menu
            MenuItem I1=new MenuItem("New");
            MenuItem I2=new MenuItem("Open");
            Menu submenu1=new Menu("Save");//

          
           MenuItem sb1=new MenuItem("Save As");
           MenuItem sb2=new MenuItem("Exit");

         //Edit Menu
           MenuItem e1=new MenuItem("Cut");
           MenuItem e2=new MenuItem("Copy");
           MenuItem e3=new MenuItem("Paste");
         
         //Format Menu
           MenuItem b1=new MenuItem("Background");
           Menu b2=new Menu("Font");
         MenuItem b21=new MenuItem("Font size");
            MenuItem b22=new MenuItem("Font type");
        //Help Menu
           MenuItem h1=new MenuItem("View Help");
           MenuItem h2=new MenuItem("Sent Feedback");     
  
         //add Menuitems to file menu
            m1.add(I1);
            m1.add(I2);
            m1.add(submenu1);
           submenu1.add(sb1);
           submenu1.add(sb2);
          
    //add Menuitems to Edit menu
            m2.add(e1);
            m2.add(e2);
            m2.add(e3);
    
 //add Menuitems to Format menu
            m3.add(b1);
            m3.add(b2);
           b2.add(b21);
            b2.add(b22);

 //add Menuitems to Help menu
            m4.add(h1);
            m4.add(h2);
       
            
            mb.add(m1);
            mb.add(m2);
            mb.add(m3);
            mb.add(m4);
            
           f1.add(l1);
           f1.setMenuBar(mb);
           f1.setSize(700,800);
           f1.setVisible(true);
      
          sb2.addActionListener(this);
          I2.addActionListener(this);
          b1.addActionListener(this);
		b21.addActionListener(this);

		
		//l1.setFont(new Font("Times New Roman",18,Font.BOLD));
		

		
        }
public void actionPerformed(ActionEvent ae)
      {
         String str=ae.getActionCommand();
         if(str.equals("Exit"))
           { 
               System.exit(0);
          }
         else if(str.equals("Open"))
           { 
               Frame frame=new Frame();
               frame.setVisible(true);
              frame.setSize(700,800); 
          }
       else if(str.equals("Background"))
           { 
               l1.setBackground(Color.YELLOW);
          }

	
      }

public static void main(String args[])
      {
          Frame1 fr1=new Frame1();
        }

}
            