/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class EstiloTablaRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        JLabel componenete = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        componenete.setHorizontalAlignment(SwingConstants.CENTER);
        this.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));

        if ((String.class.equals(table.getColumnClass(column))) && (table.getValueAt(row, column) != null)) {

            //float val = Float.parseFloat(table.getValueAt(row, column).toString());
            String val = table.getValueAt(row, column).toString();
            if (val.equals("Desactivo")) {
                componenete.setBackground(new Color(238, 35, 51));
                componenete.setForeground(Color.WHITE);
                componenete.setFont(new Font("Tahoma", 1, 18));
                if (isSelected) {
                    componenete.setForeground(Color.WHITE);
                    componenete.setBackground(new Color(0, 120, 215));//COLOR DE SELEC
                }

            } else {
                if (isSelected) {
                    setBackground(new Color(0, 120, 215));//[0,112,192]
                    setForeground(Color.WHITE);
                } else {

                    setBackground(Color.WHITE);//[0,112,192]
                    setForeground(Color.black);
                }
                //setFont(new Font("Tahoma", Font.BOLD, 18));
                // jcomponent.setToolTipText("Colum No. "+(column+1));
            }

        }

        return componenete;

    }

}
