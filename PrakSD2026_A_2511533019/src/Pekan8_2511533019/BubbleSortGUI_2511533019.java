package Pekan8_2511533019;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.lang.reflect.Array;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class BubbleSortGUI_2511533019 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_3019;
	private JLabel[] labelArray_3019;
	private JButton stepButton_3019, resetButton_3019, setButton_3019;
	private JTextField inputField_3019; 
	private JPanel panelArray_3019;
	private JTextArea stepArea_3019;
	
	private int i_3019 = 1, j_3019;
	private boolean sorting_3019 = false;
	private int stepCount_3019 = 1;

	/**
	 * Create the frame.
	 */
	public BubbleSortGUI_2511533019() {
		setTitle("Bubble Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		// Panel input
		JPanel inputPanel_3019 = new JPanel(new FlowLayout());
		inputField_3019 = new JTextField(30);
		setButton_3019 = new JButton("Set Array");
		inputPanel_3019.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
		inputPanel_3019.add(inputField_3019);
		inputPanel_3019.add(setButton_3019);
		
		// Panel array visual
		panelArray_3019 = new JPanel();
		panelArray_3019 .setLayout(new FlowLayout());
		
		// Panel kontrol
		JPanel controlPanel_3019  = new JPanel();
		stepButton_3019 = new JButton("Langkah Selanjutnya");
		resetButton_3019  = new JButton("Reset");
		stepButton_3019 .setEnabled(false);
		controlPanel_3019 .add(stepButton_3019 );
		controlPanel_3019 .add(resetButton_3019 );
		
		// Area teks untuk log langkah-langkah
		stepArea_3019  = new JTextArea(8, 60);
		stepArea_3019 .setEditable(false);
		stepArea_3019 .setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_3019  = new JScrollPane(stepArea_3019 );
		
		// Tambahkan panel ke frame
		add(inputPanel_3019 , BorderLayout.NORTH);
		add(panelArray_3019 , BorderLayout.CENTER);
		add(controlPanel_3019 , BorderLayout.SOUTH);
		add(scrollPane_3019 , BorderLayout.EAST);
		
		// Event Set Array
		setButton_3019.addActionListener(e -> setArrayFromInput_3019());
		
		// Event Langkah Selanjutnya
		stepButton_3019.addActionListener(e -> performStep_3019());
		
		// Event Reset
		resetButton_3019.addActionListener(e -> reset_3019());

	}
	
	private void setArrayFromInput_3019() {
		String text_3019 = inputField_3019.getText().trim();
		if (text_3019.isEmpty()) return;
		String[] parts_3019 = text_3019.split(",");
		array_3019 = new int[parts_3019.length];
		try {
			for(int k_3019 = 0; k_3019 < parts_3019.length; k_3019++) {
				array_3019[k_3019] = Integer.parseInt(parts_3019[k_3019].trim());
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Masukkan hanya angka " + "yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
		i_3019 = 0;
		j_3019 = 0;
		stepCount_3019 = 1;
		sorting_3019 = true;
		stepButton_3019.setEnabled(true);
		stepArea_3019.setText("");
		panelArray_3019.removeAll();
		labelArray_3019 = new JLabel[array_3019.length];
		for (int k_3019 = 0; k_3019 < array_3019.length; k_3019++) {
			labelArray_3019[k_3019] = new JLabel(String.valueOf(array_3019[k_3019]));
			labelArray_3019[k_3019].setFont (new Font ("Arial", Font.BOLD, 24));
			labelArray_3019[k_3019].setOpaque(true);
			labelArray_3019[k_3019].setBackground(Color.WHITE);
			labelArray_3019[k_3019].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_3019[k_3019].setPreferredSize (new Dimension(50, 50));
			labelArray_3019[k_3019].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_3019.add (labelArray_3019[k_3019]);
		}
		panelArray_3019.revalidate();
		panelArray_3019.repaint();
		}
		private void performStep_3019() {
			if (!sorting_3019 || i_3019 >= array_3019.length - 1) {
				sorting_3019 = false;
				stepButton_3019.setEnabled(false);
				JOptionPane.showMessageDialog(this, "Sorting selesai!");
				return;
			}
			resetHighlights_3019();
			StringBuilder stepLog = new StringBuilder();
			labelArray_3019[j_3019].setBackground(Color.CYAN);
			labelArray_3019[j_3019 + 1].setBackground(Color.CYAN);
			if (array_3019[j_3019] > array_3019[j_3019 + 1]) {
			    // Swap
		        int temp_3019 = array_3019[j_3019];
		        array_3019[j_3019] = array_3019[j_3019 + 1];
		        array_3019[j_3019 + 1] = temp_3019;
		        labelArray_3019[j_3019].setBackground(Color.RED);
		        labelArray_3019[j_3019 + 1].setBackground(Color.RED);
		        stepLog.append("Langkah ").append(stepCount_3019).append(": Menukar elemen ke-").append(j_3019).append(" (").append(array_3019[j_3019 + 1]).append(") dengan ke-").append(j_3019 + 1).append(" (").append(array_3019[j_3019]).append(")\n");
		    } else {
		        stepLog.append("Langkah ").append(stepCount_3019).append(": Tidak ada pertukaran antara ke-").append(j_3019).append(" dan ke-").append(j_3019 + 1).append("\n");
		    }
		    stepLog.append("Hasil: ").append(arrayToString_3019(array_3019)).append("\n\n");
		    stepArea_3019.append(stepLog.toString());
		    updateLabels_3019();
		    j_3019++;
		    if (j_3019 >= array_3019.length - i_3019 - 1) {
		        j_3019 = 0;
		        i_3019++;
		    }
		    stepCount_3019++;
		    if (i_3019 >= array_3019.length - 1) {
		        sorting_3019 = false;
		        stepButton_3019.setEnabled(false);
		        JOptionPane.showMessageDialog(this, "Sorting selesai!");
		    }
		}				
		private void updateLabels_3019() {
			for (int k_3019 = 0; k_3019 < array_3019.length; k_3019++) {
				labelArray_3019[k_3019].setText(String.valueOf(array_3019[k_3019]));
			}
		}
		private void resetHighlights_3019() {
			for (JLabel label_3019 : labelArray_3019) {
				label_3019.setBackground(Color.WHITE);
			}
		}
		private void reset_3019() {
			inputField_3019.setText("");
			panelArray_3019.removeAll();
			panelArray_3019.revalidate();
			panelArray_3019.repaint();
			stepArea_3019.setText("");
			stepButton_3019.setEnabled(false);
			sorting_3019 = false;
			i_3019 = 0;
			j_3019 = 0;
			stepCount_3019 = 1;
		}
		private String arrayToString_3019(int[] arr) {
			StringBuilder sb_3019 = new StringBuilder();
			for (int k_3019 = 0; k_3019 < arr.length; k_3019++) {
				sb_3019.append(arr[k_3019]);
				if (k_3019 < arr.length - 1) sb_3019.append(", ");   
			}
			return sb_3019.toString();
		}
		public static void main(String[] args) {
			SwingUtilities.invokeLater(() -> {
				BubbleSortGUI_2511533019 gui = new BubbleSortGUI_2511533019();
				gui.setVisible(true);
	    });
	}
}