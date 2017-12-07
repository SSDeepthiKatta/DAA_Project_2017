package DAA;
import java.io.FileReader;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class mainy extends javax.swing.JFrame {
Vector originalTableModel;
DocumentListener documentListener;


public mainy() throws IOException {
    initComponents();
    setLocationRelativeTo(null);
    //backup of original values to check
    originalTableModel = (Vector) ((DefaultTableModel) table.getModel()).getDataVector().clone();
    //add document listener to jtextfield to search contents as soon as something typed on it
    addDocumentListener();
}

private void addDocumentListener() {
    documentListener = new DocumentListener() {
        public void changedUpdate(DocumentEvent documentEvent) {
            search();
        }

        public void insertUpdate(DocumentEvent documentEvent) {
            search();
        }

        public void removeUpdate(DocumentEvent documentEvent) {
            search();
        }

        private void search() {
            searchTableContents(jTextField1.getText());
            
        }
        
    };
    searchOnType.setSelected(true);
    
}

@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
private void initComponents() throws IOException {

    jScrollPane1 = new javax.swing.JScrollPane();
    table = new javax.swing.JTable();
    jPanel1 = new javax.swing.JPanel();
    searchOnType = new javax.swing.JCheckBox();
    jTextField1 = new javax.swing.JTextField();
    searchButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    table.setModel(new javax.swing.table.DefaultTableModel(
        /*new Object [][] {
            {"masd", "asdad", "asdasda", "ert"},
            {"gdfg", "name", "test", "dfg"},
            {"rrrh", "dfg", "sdfsf", "sdf"},
            {"ter", "retg", "wersd", "wer"}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }*/
    		new Object [][] {
    			{"1","0","64151"},{"2","0","64151"},{"3","0","64151"},
    			{"4","0","64151"},{"5","0","64151"},{"6","0","64151"},
    			{"","",""},
    			{"7","A","64149"},
    			{"8","P","64149"},{"9","P","64149"},{"10","P","64149"},
    			{"","",""},
    			{"11","F","64230"},
    			{"","",""},
    			{"12","F","64372"},{"13","P","64372"},
    			{"14","P","64372"},{"15","P","64372"},{"16","P","64372"},
    			{"","",""},
    			{"17","A","63210"},
    			{"18","P","63210"},
        },
            new String [] {
            		"VehicleID","VehicleType", "ZipCode"
                }
        
    ));
    jScrollPane1.setViewportView(table);

    getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

    searchOnType.setText("Search on Type");
    searchOnType.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            searchOnTypeItemStateChanged(evt);
        }
    });

    searchButton.setText("Search");
    searchButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            searchButtonActionPerformed(evt);
            int row = table.getRowCount();
            int column = table.getColumnCount();
            for (int j = 0; j  < row; j++) {
                for (int i = 2; i  < column; i++) {
                	String vxArr = (String) table.getValueAt(j, i);
           
                	System.out.println("Selected vehicle "+jTextField1.getText()+ " is available at "+ table.getValueAt(j, i));
            PrintWriter out = null ;
            try {
                out = new PrintWriter(new FileWriter("C:\\Users\\SatyaSaiDeepthi\\workspace-DAA\\DAA_Project\\DAA\\output.txt",true),false);
              
            } catch (IOException e) {
                      e.printStackTrace();
                }
            out.println(vxArr);
            out.close();
       
                }
                
            }
        }
    });

    
    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(searchButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(searchOnType)
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(searchButton)
                .addComponent(searchOnType))
            .addContainerGap())
    );

    getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

    pack();
}// </editor-fold>                        

private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    searchTableContents(jTextField1.getText());
}                                            

private void searchOnTypeItemStateChanged(java.awt.event.ItemEvent evt) {                                              
    if (searchOnType.isSelected()) {
        jTextField1.getDocument().addDocumentListener(documentListener);
    } else {
        jTextField1.getDocument().addDocumentListener(null);
    }
}                                             

public void searchTableContents(String searchString) {
    DefaultTableModel currtableModel = (DefaultTableModel) table.getModel();
    //To empty the table before search
    currtableModel.setRowCount(0);
    //To search for contents from original table content
    for (Object rows : originalTableModel) {
        Vector rowVector = (Vector) rows;
        for (Object column : rowVector) {
            if (column.toString().contains(searchString)) {
                //content found so adding to table
                currtableModel.addRow(rowVector);
               
                break;
            }
            
        }
        

    }
    
}
public static void run() throws IOException {
    new mainy().setVisible(true);
}

public static void main(String args[]) throws IOException {
    /* Create and display the form */
    //java.awt.EventQueue.invokeLater(new Runnable() {
    run();    
  //  });
}

// Variables declaration - do not modify                     
private javax.swing.JPanel jPanel1;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTextField jTextField1;
private javax.swing.JButton searchButton;
private javax.swing.JCheckBox searchOnType;
private javax.swing.JTable table;
// End of variables declaration                   
}
