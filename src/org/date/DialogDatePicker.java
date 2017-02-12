package org.date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.sourceforge.jdatepicker.JDateComponentFactory;
import net.sourceforge.jdatepicker.JDatePanel;
import net.sourceforge.jdatepicker.impl.UtilDateModel;


public class DialogDatePicker extends JDialog {
    private static final long serialVersionUID = 1L;
    /**
     * show  calendar
     * @param modal 
     * @param txtSelectedDate receive content
     * @param screenX show X
     * @param screenY show Y
     */
    public DialogDatePicker(boolean modal, final JTextField txtSelectedDate,int screenX,int screenY) {
        final JDatePanel jp = JDateComponentFactory.createJDatePanel(new UtilDateModel(new Date()));
        jp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(txtSelectedDate != null) {
                    try{
                    	
                        txtSelectedDate.setText(new SimpleDateFormat("yyyy-MM-dd").format(jp.getModel().getValue()));
                    } catch (Exception ex) {
                        txtSelectedDate.setText("");
                    }
                }
            }
        });
        JPanel pnl = (JPanel)jp;
        this.add(pnl);
        this.setTitle("DateChooser");
        this.setResizable(false);
        this.setModal(modal);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setBounds(screenX, screenY, 300, 300);
        this.setVisible(true);
        
        //JTextField txtDate = new JTextField();

    }    
//    public static void main(String[] args) {
//        JTextField txtDate = new JTextField();
//        new DialogDatePicker(true,txtDate,300,400);
//        System.out.println(txtDate.getText());
//    }
}