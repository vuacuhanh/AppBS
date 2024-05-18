/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SanPham;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class frmListSanPham extends javax.swing.JPanel {

    public frmListSanPham() {
        initComponents();
        // Tạo một JPanel để chứa các panelSanPham
        JPanel productListPanel = new JPanel();
        productListPanel.setLayout(new BoxLayout(productListPanel, BoxLayout.X_AXIS)); // Thiết lập layout để các panelSanPham xếp theo chiều ngang

        // Tạo các panelSanPham và thêm vào JPanel chứa sản phẩm
        for (int i = 0; i < 10; i++) {
            panelSanPham productPanel = new panelSanPham();
            productListPanel.add(productPanel);
        }

        // Đặt JPanel chứa sản phẩm vào JScrollPane để cho phép cuộn ngang
        JScrollPane jScrollPane1 = new JScrollPane(productListPanel);
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        // Đặt layout của frmListSanPham thành BorderLayout và thêm JScrollPane vào vùng trung tâm
        setLayout(new java.awt.BorderLayout());
        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
