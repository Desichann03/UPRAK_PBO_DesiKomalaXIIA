/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pbo_desikolamaastuti_xiia;

import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author ASUS
 */
public class form_penilaian extends javax.swing.JFrame {
     DefaultTableModel model;
    /**
     * Creates new form form_penilaian
     */
    public form_penilaian() {
        initComponents();
        setTable();
    }
    
    private void setTable () {
        Object[] field = {"NISN", "Nama", "Kelas", "Mapel", "Kehadiran", "Tugas", "PTS", "PAS", "Nilai Akhir", "Nilai huruf"};
        model = new DefaultTableModel (field, 0);
        TABLE_NILAI.setModel(model);
        JTableHeader th = TABLE_NILAI.getTableHeader();
    }
    
     private String calculate(String... utm){
        for (int i = 0; i < utm.length; i++){
            if (utm[i].isEmpty()){
                utm[i] = "0";
            }
        }
        double t1=0, t2=0, t3=0, t4=0;
        for (int i = 0; i < utm.length; i++){
            double cv = Double.valueOf(utm[i]);
            switch (i) {
                case 0:
                    t1 = cv * 0.1;
                    break;
                case 1:
                    t2 = cv * 0.3;
                    break;
                case 2:
                    t3 = cv * 0.2;
                    break;
                case 3:
                    t4 = cv * 0.4;
                    break;
                default:
                    break;
            }
        }
        double jumlah = t1+t2+t3+t4;
        double as = Math.round(jumlah);
        String cvJumlah = indexOF(as);
        return cvJumlah;
    }
    
    public String indexOF(double b){
        String hsl;
        if (b %1 == 0) {
            hsl = String.valueOf(b).substring(0, String.valueOf(b).lastIndexOf("."));
        } else {
            hsl = String.valueOf(b);
        }
        return hsl;
    }
    
    public String calAbjad(String jumlah){
    String nilai = "";
        double b = Double.valueOf(jumlah);
        if(b <=100 && b >= 80) {
            nilai = "A";
        }else if (b <= 79 && b >= 60){
            nilai = "B";
        }else if (b <= 69 && b >= 40){
            nilai = "C";
        }else if (b <=39 ){
            nilai = "D";
        }
        return nilai;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TXT_NISN = new javax.swing.JTextField();
        TXT_NAMA = new javax.swing.JTextField();
        TXT_MAPEL = new javax.swing.JTextField();
        TXT_KELAS = new javax.swing.JTextField();
        TXT_ABSEN = new javax.swing.JTextField();
        TXT_TUGAS = new javax.swing.JTextField();
        TXT_PTS = new javax.swing.JTextField();
        TXT_PAS = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        BTN_SIMPAN = new javax.swing.JButton();
        BTN_HAPUS = new javax.swing.JButton();
        BTN_KELUAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE_NILAI = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("FORM PENILAIAN SISWA SMK INFORMATIKA UTAMA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(196, 196, 196))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        jLabel2.setText("NISN");

        jLabel3.setText("Nama Siswa");

        jLabel4.setText("Mata Pelajaran");

        jLabel5.setText("Kelas");

        jLabel6.setText("Kehadiran");

        jLabel7.setText("Nilai Tugas");

        jLabel8.setText("Nilai PTS");

        jLabel9.setText("Nilai PAS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        BTN_SIMPAN.setText("Proses dan Simpan");
        BTN_SIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SIMPANActionPerformed(evt);
            }
        });

        BTN_HAPUS.setText("Hapus Data");
        BTN_HAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_HAPUSActionPerformed(evt);
            }
        });

        BTN_KELUAR.setText("Keluar Aplikasi");
        BTN_KELUAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_KELUARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(BTN_SIMPAN)
                .addGap(71, 71, 71)
                .addComponent(BTN_HAPUS)
                .addGap(77, 77, 77)
                .addComponent(BTN_KELUAR)
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_SIMPAN)
                    .addComponent(BTN_HAPUS)
                    .addComponent(BTN_KELUAR))
                .addContainerGap())
        );

        TABLE_NILAI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NISN", "Nama", "Mapel", "Kelas", "Kehadiran", "Nilai Tugas", "NIlai PTS", "Nilai PAS", "Nilai akhir", "Nilai huruf"
            }
        ));
        jScrollPane1.setViewportView(TABLE_NILAI);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXT_NISN, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(TXT_NAMA)
                            .addComponent(TXT_MAPEL)
                            .addComponent(TXT_KELAS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(114, 114, 114)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXT_ABSEN, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(TXT_TUGAS)
                            .addComponent(TXT_PTS)
                            .addComponent(TXT_PAS))))
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(TXT_NISN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_ABSEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(TXT_NAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_TUGAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(TXT_MAPEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_PTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(TXT_KELAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_PAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_SIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SIMPANActionPerformed
        // TODO add your handling code here:
        String NISN         = TXT_NISN.getText();
        String Nama         = TXT_NAMA.getText();
        String Kelas        = TXT_MAPEL.getText();
        String Mapel        = TXT_KELAS.getText();
        String Kehadiran    = TXT_ABSEN.getText();
        String Tugas        = TXT_TUGAS.getText();
        String PTS          = TXT_PTS.getText();
        String PAS          = TXT_PAS.getText();

        if(NISN.isEmpty()){
            JOptionPane.showMessageDialog(this, "Masukan NISN Terlebih Dahulu");
            TXT_NISN.requestFocus();
        }else{
            String[] data = {Kehadiran, PTS, Tugas, PAS};

            String jml = calculate(data);
            Object[] data2 = {NISN, Nama, Kelas, Mapel, Kehadiran, Tugas, PTS, PAS, jml, calAbjad(jml)};
            model.addRow(data2);
        }
    }//GEN-LAST:event_BTN_SIMPANActionPerformed

    private void BTN_HAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_HAPUSActionPerformed
        // TODO add your handling code here:
        TXT_NISN.setText("");
        TXT_NAMA.setText("");
        TXT_MAPEL.setText("");
        TXT_KELAS.setText("");
        TXT_ABSEN.setText("");
        TXT_TUGAS.setText("");
        TXT_PTS.setText("");
        TXT_PAS.setText("");
    }//GEN-LAST:event_BTN_HAPUSActionPerformed

    private void BTN_KELUARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_KELUARActionPerformed
        // TODO add your handling code here:
          System.exit(0);
    }//GEN-LAST:event_BTN_KELUARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_penilaian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_HAPUS;
    private javax.swing.JButton BTN_KELUAR;
    private javax.swing.JButton BTN_SIMPAN;
    private javax.swing.JTable TABLE_NILAI;
    private javax.swing.JTextField TXT_ABSEN;
    private javax.swing.JTextField TXT_KELAS;
    private javax.swing.JTextField TXT_MAPEL;
    private javax.swing.JTextField TXT_NAMA;
    private javax.swing.JTextField TXT_NISN;
    private javax.swing.JTextField TXT_PAS;
    private javax.swing.JTextField TXT_PTS;
    private javax.swing.JTextField TXT_TUGAS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

