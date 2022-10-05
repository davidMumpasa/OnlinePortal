/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.PortData;
import java.util.List;

/**
 *
 * @author hp
 */
public interface PortalInterface {
    
    public List<PortData> addtiemsToList(PortData pdt);
    public void displayItems(List<PortData> portalList);
}
