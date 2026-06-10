package pekan9_2511533019;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GUIRumahSakit_2511533019 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtJudul_3019;
    private JComboBox<String> comboAwal_3019;
    private JComboBox<String> comboTujuan_3019;
    private JTextArea txtGraph_3019;
    private JTextArea txtHasil_3019;
    private GraphRS_2511533019 graph_3019 = new GraphRS_2511533019();
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUIRumahSakit_2511533019 frame = new GUIRumahSakit_2511533019();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public GUIRumahSakit_2511533019() {
        setTitle("BFS dan DFS Rumah Sakit");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 815, 420);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtJudul_3019 = new JTextField();
        txtJudul_3019.setText("PENCARIAN JALUR RUMAH SAKIT MENGGUNAKAN BFS DAN DFS");
        txtJudul_3019.setHorizontalAlignment(SwingConstants.CENTER);
        txtJudul_3019.setForeground(Color.WHITE);
        txtJudul_3019.setBackground(new Color(0, 64, 128));
        txtJudul_3019.setFont(new Font("Tw Cen MT", Font.BOLD, 13));
        txtJudul_3019.setEditable(false);
        txtJudul_3019.setBounds(0, 0, 801, 30);
        contentPane.add(txtJudul_3019);

        JLabel lblAwal_3019 = new JLabel("Lokasi Awal :");
        lblAwal_3019.setBounds(10, 40, 90, 20);
        contentPane.add(lblAwal_3019);

        JLabel lblTujuan_3019 = new JLabel("Lokasi Tujuan :");
        lblTujuan_3019.setBounds(10, 65, 90, 20);
        contentPane.add(lblTujuan_3019);

        comboAwal_3019 = new JComboBox<>();
        comboAwal_3019.setModel(new DefaultComboBoxModel<>(new String[] {
                "Pintu Masuk",
                "IGD",
                "Apotek",
                "Poliklinik",
                "Laboratorium",
                "Radiologi",
                "Ruang Rawat",
                "ICU",
                "Kantin",
                "Parkir"
        }));
        comboAwal_3019.setBounds(110, 40, 140, 22);
        contentPane.add(comboAwal_3019);

        comboTujuan_3019 = new JComboBox<>();
        comboTujuan_3019.setModel(new DefaultComboBoxModel<>(new String[] {
                "Pintu Masuk",
                "IGD",
                "Apotek",
                "Poliklinik",
                "Laboratorium",
                "Radiologi",
                "Ruang Rawat",
                "ICU",
                "Kantin",
                "Parkir"
        }));
        comboTujuan_3019.setBounds(110, 65, 140, 22);
        contentPane.add(comboTujuan_3019);

        JButton btnBFS_3019 = new JButton("BFS");
        btnBFS_3019.setBackground(new Color(255, 255, 128));
        btnBFS_3019.setBounds(504, 41, 80, 25);
        contentPane.add(btnBFS_3019);

        JButton btnDFS_3019 = new JButton("DFS");
        btnDFS_3019.setBackground(new Color(255, 128, 128));
        btnDFS_3019.setBounds(601, 41, 80, 25);
        contentPane.add(btnDFS_3019);

        JButton btnReset_3019 = new JButton("RESET");
        btnReset_3019.setForeground(Color.WHITE);
        btnReset_3019.setBackground(new Color(128, 0, 64));
        btnReset_3019.setBounds(691, 41, 100, 25);
        contentPane.add(btnReset_3019);

        txtGraph_3019 = new JTextArea();
        txtGraph_3019.setEditable(false);
        txtGraph_3019.setFont(new Font("Monospaced", Font.PLAIN, 12));

        txtGraph_3019.setText(
                "STRUKTUR GRAPH RUMAH SAKIT\r\n\r\nParkir ---- Pintu Masuk ---- IGD ---- Radiologi\r\n   |              |           |\r\n   |              |           |\r\nKantin ---- Apotek ---- Laboratorium ---- ICU\r\n   |              |                |        |\r\n   |              |                |        |\r\n   +--------- Poliklinik ---- Ruang Rawat --+"
        );

        txtGraph_3019.setBounds(120, 99, 560, 157);
        contentPane.add(txtGraph_3019);

        JLabel lblHasil_3019 = new JLabel("Hasil Pencarian");
        lblHasil_3019.setFont(new Font("Tw Cen MT", Font.BOLD, 13));
        lblHasil_3019.setBounds(10, 250, 200, 20);
        contentPane.add(lblHasil_3019);

        txtHasil_3019 = new JTextArea();
        txtHasil_3019.setEditable(false);
        txtHasil_3019.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));

        txtHasil_3019.setText(
                "Jalur :\n\n" +
                "Node Dikunjungi :\n\n" +
                "Jumlah Node :"
        );

        txtHasil_3019.setBounds(10, 275, 791, 90);
        contentPane.add(txtHasil_3019);

        btnBFS_3019.addActionListener(e -> {

            String start_3019 = comboAwal_3019.getSelectedItem().toString();
            String goal_3019 =  comboTujuan_3019.getSelectedItem().toString();
            graph_3019.BFS_3019(start_3019, goal_3019);
            txtHasil_3019.setText(
                    "Jalur : " + String.join(" -> ", graph_3019.getPath_3019())
                            + "\n\nNode Dikunjungi : "+ String.join(" -> ",graph_3019.getVisitedOrder_3019())
                            + "\n\nJumlah Node : "+ graph_3019.getExploredCount_3019()
            );
        });
        btnDFS_3019.addActionListener(e -> {
            String start_3019 = comboAwal_3019.getSelectedItem().toString();
            String goal_3019 = comboTujuan_3019.getSelectedItem().toString();
            graph_3019.DFS_3019(start_3019, goal_3019);
            txtHasil_3019.setText(
                    "Jalur : "+ String.join(" -> ",graph_3019.getPath_3019())
                            + "\n\nNode Dikunjungi : " + String.join(" -> ",graph_3019.getVisitedOrder_3019())
                            + "\n\nJumlah Node : "+ graph_3019.getExploredCount_3019()
            );
        });

        btnReset_3019.addActionListener(e -> {
            graph_3019.resetGraph_3019();
            comboAwal_3019.setSelectedIndex(0);
            comboTujuan_3019.setSelectedIndex(0);
            txtHasil_3019.setText(
                    "Jalur :\n\n" +
                    "Node Dikunjungi :\n\n" +
                    "Jumlah Node :"
            );
        });
    }
}