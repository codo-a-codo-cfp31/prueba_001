/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversores;

import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author cfp31-06
 */
public class ConversorListModel implements ComboBoxModel {

    private List<String> lista_valores;
    private Integer selected_index;

    public ConversorListModel(List<String> lista) {
        lista_valores = lista;
        selected_index = 0;

    }

    @Override
    public int getSize() {

        return lista_valores.size();
    }

    @Override
    public Object getElementAt(int index) {
        return lista_valores.get(index);
    }

    public void addListDataListener(ListDataListener l) {
    }

    public void removeListDataListener(ListDataListener l) {
    }

    public void setSelectedItem(Object anItem) {
        selected_index = lista_valores.indexOf(anItem);
    }

    public Object getSelectedItem() {
        return lista_valores.get(selected_index);
    }

}
