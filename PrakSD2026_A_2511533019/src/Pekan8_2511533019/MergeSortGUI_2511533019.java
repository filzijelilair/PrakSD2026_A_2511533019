package Pekan8_2511533019;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

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

import java.util.LinkedList;
import java.util.Queue;

public class MergeSortGUI_2511533019 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_3019;
	private JLabel[] labelArray_3019;
	private JButton stepButton_3019, resetButton_3019, setButton_3019;
	private JTextField inputField_3019;
	private JPanel panelArray_3019;
	private JTextArea stepArea_3019;

	private Queue<int[]> mergeQueue_3019 = new LinkedList<>();
	private int stepCount_3019 = 1;
	private boolean isMerging_3019 = false;
	private boolean copying_3019 = false;

	private int[] temp_3019;
	private int left_3019, mid_3019, right_3019;
	private int i_3019, j_3019, k_3019;

	public MergeSortGUI_2511533019() {
		setTitle("Merge Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// panel input
		JPanel inputPanel_3019 = new JPanel(new FlowLayout());
		inputField_3019 = new JTextField(30);
		setButton_3019 = new JButton("Set Array");
		inputPanel_3019.add(new JLabel("Masukan angka (pisahkan dengan koma)"));
		inputPanel_3019.add(inputField_3019);
		inputPanel_3019.add(setButton_3019);

		// panel array visual
		panelArray_3019 = new JPanel();
		panelArray_3019.setLayout(new FlowLayout());

		// panel kontrol
		JPanel controlPanel_3019 = new JPanel();
		stepButton_3019 = new JButton("Langkah selanjutnya");
		resetButton_3019 = new JButton("Reset");
		controlPanel_3019.add(stepButton_3019);
		controlPanel_3019.add(resetButton_3019);

		// area text untuk log langkah langkah
		stepArea_3019 = new JTextArea(8, 60);
		stepArea_3019.setEditable(false);
		stepArea_3019.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_3019 = new JScrollPane(stepArea_3019);

		// tambahkan panel ke frame
		add(inputPanel_3019, BorderLayout.NORTH);
		add(panelArray_3019, BorderLayout.CENTER);
		add(controlPanel_3019, BorderLayout.SOUTH);
		add(scrollPane_3019, BorderLayout.EAST);

		// event set array
		setButton_3019.addActionListener(e -> setArrayFromInput_3019());

		// event selanjutnya
		stepButton_3019.addActionListener(e -> performStep_3019());

		// event reset
		resetButton_3019.addActionListener(e -> reset_3019());
	}

	private void setArrayFromInput_3019() {
		String text_3019 = inputField_3019.getText().trim();
		if (text_3019.isEmpty()) return;
		String[] parts_3019 = text_3019.split(",");
		array_3019 = new int[parts_3019.length];
		try {
			for (int k = 0; k < parts_3019.length; k++) {
				array_3019[k] = Integer.parseInt(parts_3019[k].trim());
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka dengan koma!",
					"Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		labelArray_3019 = new JLabel[array_3019.length];
		panelArray_3019.removeAll();
		for (int k = 0; k < array_3019.length; k++) {
			labelArray_3019[k] = new JLabel(String.valueOf(array_3019[k]));
			labelArray_3019[k].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_3019[k].setOpaque(true);
			labelArray_3019[k].setBackground(Color.WHITE);
			labelArray_3019[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_3019[k].setPreferredSize(new Dimension(50, 50));
			labelArray_3019[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_3019.add(labelArray_3019[k]);
		}

		mergeQueue_3019.clear();
		generateMergeSteps_3019(0, array_3019.length - 1);
		stepButton_3019.setEnabled(true);
		stepArea_3019.setText("");
		stepCount_3019 = 1;
		isMerging_3019 = false;

		panelArray_3019.revalidate();
		panelArray_3019.repaint();
	}

	private void generateMergeSteps_3019(int left, int right) {
		if (left >= right) return;
		int mid = (left + right) / 2;
		generateMergeSteps_3019(left, mid);
		generateMergeSteps_3019(mid + 1, right);
		mergeQueue_3019.add(new int[]{left, mid, right});
	}

	private void performStep_3019() {
		resetHighlights_3019();

		if (!isMerging_3019 && !mergeQueue_3019.isEmpty()) {
			int[] range_3019 = mergeQueue_3019.poll();
			left_3019 = range_3019[0];
			mid_3019 = range_3019[1];
			right_3019 = range_3019[2];
			temp_3019 = new int[right_3019 - left_3019 + 1];
			i_3019 = left_3019;
			j_3019 = mid_3019 + 1;
			k_3019 = 0;
			copying_3019 = false;
			isMerging_3019 = true;
			stepArea_3019.append("Langkah " + stepCount_3019++ +
					": Mulai merge dari " + left_3019 + " ke " + right_3019 + "\n");
			return;
		}

		if (isMerging_3019 && !copying_3019) {
			if (i_3019 <= mid_3019 && j_3019 <= right_3019) {
				labelArray_3019[i_3019].setBackground(Color.CYAN);
				labelArray_3019[j_3019].setBackground(Color.CYAN);
				if (array_3019[i_3019] <= array_3019[j_3019]) {
					temp_3019[k_3019++] = array_3019[i_3019++];
				} else {
					temp_3019[k_3019++] = array_3019[j_3019++];
				}
				stepArea_3019.append("Langkah " + stepCount_3019++ + ": Bandingkan dan salin elemen\n");
				return;
			} else if (i_3019 <= mid_3019) {
				temp_3019[k_3019++] = array_3019[i_3019++];
				stepArea_3019.append("Langkah " + stepCount_3019++ + ": Salin sisa kiri\n");
				return;
			} else if (j_3019 <= right_3019) {
				temp_3019[k_3019++] = array_3019[j_3019++];
				stepArea_3019.append("Langkah " + stepCount_3019++ + ": Salin sisa kanan\n");
				return;
			} else {
				copying_3019 = true;
				k_3019 = 0;
				return;
			}
		}

		if (copying_3019 && k_3019 < temp_3019.length) {
			array_3019[left_3019 + k_3019] = temp_3019[k_3019];
			labelArray_3019[left_3019 + k_3019].setText(String.valueOf(temp_3019[k_3019]));
			labelArray_3019[left_3019 + k_3019].setBackground(Color.GREEN);
			k_3019++;
			stepArea_3019.append("Langkah " + stepCount_3019++ + ": Tempelkan ke array utama\n");
			return;
		}

		if (copying_3019 && k_3019 == temp_3019.length) {
			isMerging_3019 = false;
			copying_3019 = false;
		}

		if (mergeQueue_3019.isEmpty() && !isMerging_3019) {
			stepArea_3019.append("Selesai.\n");
			stepButton_3019.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
		}
	}

	private void resetHighlights_3019() {
		if (labelArray_3019 == null) return;
		for (JLabel label : labelArray_3019) {
			label.setBackground(Color.WHITE);
		}
	}

	private void reset_3019() {
		inputField_3019.setText("");
		panelArray_3019.removeAll();
		panelArray_3019.revalidate();
		panelArray_3019.repaint();
		stepArea_3019.setText("");
		stepButton_3019.setEnabled(false);
		mergeQueue_3019.clear();
		isMerging_3019 = false;
		stepCount_3019 = 1;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			MergeSortGUI_2511533019 gui = new MergeSortGUI_2511533019();
			gui.setVisible(true);
		});
	}
}