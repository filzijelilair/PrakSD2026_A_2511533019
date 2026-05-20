package pekan7_2511533019;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class SortingGUI_2511533019 extends JFrame {

    private JTextField txtNama_3019, txtNim_3019, txtProdi_3019;
    private JButton btnTambah_3019, btnHapus_3019, btnSort_3019;
    private JComboBox<String> combo_3019;
    private JTable tabel_3019;
    private JTextArea areaLangkah_3019;
    private DefaultTableModel model_3019;
    
    private ArrayList<ADTMahasiswa_2511533019> list_3019 = new ArrayList<>();

    public SortingGUI_2511533019(){

        setTitle("Sorting Data Mahasiswa");
        setSize(900,550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel input_3019 = new JPanel(new GridLayout(3,4,10,10));
        input_3019.setBorder(new EmptyBorder(10,10,10,10));

        input_3019.add(new JLabel("Nama"));
        txtNama_3019 = new JTextField();
        input_3019.add(txtNama_3019);

        input_3019.add(new JLabel("NIM"));
        txtNim_3019 = new JTextField();
        input_3019.add(txtNim_3019);

        input_3019.add(new JLabel("Prodi"));
        txtProdi_3019 = new JTextField();
        input_3019.add(txtProdi_3019);

        input_3019.add(new JLabel("Metode"));

        combo_3019 = new JComboBox<>();
        combo_3019.addItem("Insertion Sort");
        combo_3019.addItem("Selection Sort");
        combo_3019.addItem("Bubble Sort");

        input_3019.add(combo_3019);

        btnTambah_3019 = new JButton("Tambah");
        input_3019.add(btnTambah_3019);

        btnHapus_3019 = new JButton("Hapus");
        input_3019.add(btnHapus_3019);

        btnSort_3019 = new JButton("Mulai Sorting");
        btnSort_3019.setBackground(new Color(128,128,192));
        btnSort_3019.setForeground(Color.WHITE);

        input_3019.add(btnSort_3019);
        input_3019.add(new JLabel(""));

        add(input_3019, BorderLayout.NORTH);

        model_3019 = new DefaultTableModel();

        model_3019.addColumn("Nama");
        model_3019.addColumn("NIM");
        model_3019.addColumn("Prodi");

        tabel_3019 = new JTable(model_3019);

        areaLangkah_3019 = new JTextArea();
        areaLangkah_3019.setEditable(false);

        JPanel tengah_3019 = new JPanel(new GridLayout(1,2));

        tengah_3019.add(new JScrollPane(tabel_3019));
        tengah_3019.add(new JScrollPane(areaLangkah_3019));

        add(tengah_3019,BorderLayout.CENTER);

        btnTambah_3019.addActionListener(e->tambahData_3019());
        btnHapus_3019.addActionListener(e->hapus_3019());
        btnSort_3019.addActionListener(e->sorting_3019());
    }

    private void tambahData_3019(){

        String nama_3019 = txtNama_3019.getText();
        String nim_3019 = txtNim_3019.getText();
        String prodi_3019 = txtProdi_3019.getText();
        list_3019.add(new ADTMahasiswa_2511533019(nama_3019,nim_3019,prodi_3019));
        
        tampilData_3019();

        txtNama_3019.setText("");
        txtNim_3019.setText("");
        txtProdi_3019.setText("");
    }
    private void tampilData_3019(){
        model_3019.setRowCount(0);
        for(ADTMahasiswa_2511533019 m_3019:list_3019){
            model_3019.addRow(new Object[]{
                    m_3019.getNamaMahasiswa_3019(),
                    m_3019.getNim_3019(),
                    m_3019.getProdi_3019()

            });
        }
    }
    private void hapus_3019(){
        list_3019.clear();
        model_3019.setRowCount(0);
        areaLangkah_3019.setText("");
    }
    private void sorting_3019(){
        areaLangkah_3019.setText("");
        ArrayList<ADTMahasiswa_2511533019> tempList_3019 = new ArrayList<>(list_3019);
        String pilihan_3019 = combo_3019.getSelectedItem().toString();
        if(pilihan_3019.equals("Insertion Sort")){
            insertionSort_3019(tempList_3019);
        }else if(pilihan_3019.equals("Selection Sort")){
            selectionSort_3019(tempList_3019);
        }else{
            bubbleSort_3019(tempList_3019);
        }
        tampilDataDariList_3019(tempList_3019);
    }
    private void tampilDataDariList_3019(ArrayList<ADTMahasiswa_2511533019> tempList_3019){
        model_3019.setRowCount(0);
        for(ADTMahasiswa_2511533019 m_3019:tempList_3019){
            model_3019.addRow(new Object[]{
                    m_3019.getNamaMahasiswa_3019(),
                    m_3019.getNim_3019(),
                    m_3019.getProdi_3019()
            });

        }

    }
    private void insertionSort_3019(ArrayList<ADTMahasiswa_2511533019> tempList_3019){
        areaLangkah_3019.append("=== INSERTION ===\n");
        for(int i_3019=1;i_3019<tempList_3019.size();i_3019++){
            ADTMahasiswa_2511533019 key_3019=tempList_3019.get(i_3019);
            int j_3019=i_3019-1;
            while(j_3019>=0 && tempList_3019.get(j_3019).getNamaMahasiswa_3019().compareToIgnoreCase(key_3019.getNamaMahasiswa_3019())>0){
                tempList_3019.set(j_3019+1,tempList_3019.get(j_3019));
                j_3019--;
            }
            tempList_3019.set(j_3019+1,key_3019);
            areaLangkah_3019.append("Langkah "+i_3019+" : "+namaList_3019(tempList_3019)+"\n");
        }
    }

    private void selectionSort_3019(ArrayList<ADTMahasiswa_2511533019> tempList_3019){
        areaLangkah_3019.append("=== SELECTION ===\n");
        for(int i_3019=0;i_3019<tempList_3019.size()-1;i_3019++){
            int min_3019=i_3019;
            for(int j_3019=i_3019+1;j_3019<tempList_3019.size();j_3019++){
                if(tempList_3019.get(j_3019).getNamaMahasiswa_3019().compareToIgnoreCase(tempList_3019.get(min_3019).getNamaMahasiswa_3019())<0){
                    min_3019=j_3019;
                }
            }
            ADTMahasiswa_2511533019 temp_3019=tempList_3019.get(i_3019);
            tempList_3019.set(i_3019,tempList_3019.get(min_3019));
            tempList_3019.set(min_3019,temp_3019);
            areaLangkah_3019.append("Pass "+(i_3019+1)+" : "+namaList_3019(tempList_3019)+"\n");
        }
    }

    private void bubbleSort_3019(ArrayList<ADTMahasiswa_2511533019> tempList_3019){
        areaLangkah_3019.append("=== BUBBLE ===\n");
        for(int i_3019=0;i_3019<tempList_3019.size()-1;i_3019++){
            for(int j_3019=0;j_3019<tempList_3019.size()-i_3019-1;j_3019++){
                if(tempList_3019.get(j_3019).getNamaMahasiswa_3019().compareToIgnoreCase(tempList_3019.get(j_3019+1).getNamaMahasiswa_3019())>0){
                    ADTMahasiswa_2511533019 temp_3019=tempList_3019.get(j_3019);
                    tempList_3019.set(j_3019,tempList_3019.get(j_3019+1));
                    tempList_3019.set(j_3019+1,temp_3019);
                }
            }
            areaLangkah_3019.append("Pass "+(i_3019+1)+" : "+namaList_3019(tempList_3019)+"\n");
        }
    }
    private String namaList_3019(ArrayList<ADTMahasiswa_2511533019> tempList_3019){
        String hasil_3019="[";
        for(int i_3019=0;i_3019<tempList_3019.size();i_3019++){
            hasil_3019 += tempList_3019.get(i_3019).getNamaMahasiswa_3019();
            if(i_3019<tempList_3019.size()-1){
                hasil_3019 += ", ";
            }
        }
        hasil_3019 += "]";
        return hasil_3019;
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->{
            new SortingGUI_2511533019().setVisible(true);
        });
    }
}