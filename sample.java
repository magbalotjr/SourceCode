import javax.swing.JOptionPane;

    public class sample{

            public static void main(String[] args){



// Message Dialog BOX


        JOptionPane.showMessageDialog(  null,
                                        "Hello World",
                                        "Message Title",
                                        JOptionPane.WARNING_MESSAGE);

// Input Dialog BOX


        JOptionPane.showInputDialog(    null,
                                       "Hello World");

        double convertString;
        String input = JOptionPane.showInputDialog(null, "input your answer");

        convertString = Double.parseDouble(input);

        JOptionPane.showMessageDialog(null,convertString);


// Confirm Dialog BOX

        int value;

    value = JOptionPane.showConfirmDialog(  null,
                                            "Choose your option",
                                            "Confirm Box Title",
                                            JOptionPane.YES_NO_CANCEL_OPTION,
                                            JOptionPane.QUESTION_MESSAGE);

    if (value==JOptionPane.YES_OPTION){

        JOptionPane.showMessageDialog(null, "Yes button was clicked");
    }





// Option Dialog BOX

       final int Icon = JOptionPane.INFORMATION_MESSAGE;

    String []option = { "Create a Book",        //0
                        "Search for a Book",    //1
                        "Display Library"};     //2

    int userResponse = 
    JOptionPane.showOptionDialog(
                        null,
                        "Please select",
                        "Select an Action",
                         JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        option,
                        Integer.valueOf(0));

if (userResponse==0){
        JOptionPane.showMessageDialog(null,"Create a Book was clicked");
    }








    final int Icon = JOptionPane.INFORMATION_MESSAGE;

    String []option = { "Create a Book",        //0
                        "Search for a Book",    //1
                        "Display Library"};     //2

    int userResponse = 
    JOptionPane.showOptionDialog(
                        null,
                        "Please select",
                        "Select an Action",
                         JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        option,
                        Integer.valueOf(0));

if (userResponse==0){
        JOptionPane.showMessageDialog(null,"Create a Book was clicked");
}





            }

    }