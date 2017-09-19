/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8;

import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Luis Vera
 */
public class ConversorListModel implements ComboBoxModel {

    private List<String> list_values;
    private Integer selected_index;

    public ConversorListModel(List<String> lista) {
        list_values = lista;
        selected_index = 0;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selected_index = list_values.indexOf(anItem);

    }

    @Override
    public Object getSelectedItem() {
        return list_values.get(selected_index);

    }

    @Override
    public int getSize() {
        return list_values.size();

    }

    @Override
    public Object getElementAt(int index) {
        return list_values.get(index);

    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }

}
