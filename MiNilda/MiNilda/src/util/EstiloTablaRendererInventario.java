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
public class EstiloTablaRendererInventario extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel componenete = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.       
        // componenete.setHorizontalAlignment(row);
        componenete.setHorizontalAlignment(SwingConstants.CENTER);
        ///componenete.getCol().getColumn(column).setCellRenderer(componenete);
        if (value instanceof Double) {

            Double valor = (Double) value;
            if (column == 6) {
                if (valor <= 100) {

                    componenete.setBackground(new Color(238, 35, 51));
                    componenete.setForeground(Color.WHITE);
                    componenete.setFont(new Font("Tahoma", 1, 18));
                    if (isSelected) {
                        componenete.setForeground(Color.WHITE);
                        componenete.setBackground(new Color(0, 120, 215));//COLOR DE SELEC
                    }

                }

            }

        } else if (value instanceof String) {
            String valor = (String) value;
            if (column == 8) {
                if (valor.equals("vencido")) {

                    componenete.setBackground(new Color(238, 35, 51));
                    componenete.setForeground(Color.WHITE);
                    componenete.setFont(new Font("Tahoma", 1, 18));
                    if (isSelected) {
                        componenete.setForeground(Color.WHITE);
                        componenete.setBackground(new Color(0, 120, 215));//COLOR DE SELEC
                    }

                } else if (valor.equals("por vencer")) {

                    componenete.setBackground(new Color(255, 193, 7));
                    componenete.setForeground(Color.BLACK);
                    componenete.setFont(new Font("Tahoma", 1, 18));
                    if (isSelected) {
                        componenete.setForeground(Color.WHITE);
                        componenete.setBackground(new Color(0, 120, 215));//COLOR DE SELEC
                    }

                }

            } else {
                if (isSelected) {
                    setBackground(new Color(0, 120, 215));//[0,112,192]
                    setForeground(Color.WHITE);
                } else {

                    setBackground(Color.WHITE);//[0,112,192]
                    setForeground(Color.black);
                }
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

        return componenete;

    }

}
