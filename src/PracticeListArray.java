import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class PracticeListArray {

    public static void main(String[] args){

        ArrayList<String> customerNames = new ArrayList<String>();

        boolean quit = true;

        while (quit){
            String name = JOptionPane.showInputDialog(null, "Enter the customer name");
            if (name.equals("quit")) {
                quit = false;
            }
            customerNames.add(name);
        }
        System.out.println("Customer names are" + customerNames);

        System.out.println("Customer names are");



    }

}


//for (int i = 0; i<customerNames.size(); i ++){
  //      System.out.println(customerNames.get(i));
    //    }