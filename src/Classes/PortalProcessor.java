/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

 
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class PortalProcessor implements PortalInterface{

    public PortalProcessor() {
    }
    
       @Override
    public List<PortData> addtiemsToList(PortData pdt) {
        List<PortData> portalList = new ArrayList();

        PortData portData = new PortData();

        portData.setCloth("T-shirt");
        portData.setElectronic("Television");
        portData.setPrice(500);
        portData.setToys("car");

        portalList.add(portData);

        return portalList;
    }

    @Override
    public void displayItems(List<PortData> portalList) {

        for (PortData portData : portalList) {
            System.out.println("Cloth Name: " + portData.getCloth() + "\n"
                    + "Electronic : " + portData.getElectronic() + "\n"
                    + "Price : $" + portData.getPrice() + "\n"
                    + "Toy : " + portData.getToys());
        }

    }
    
}
