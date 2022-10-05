/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineportal;

import Classes.PortData;
import Classes.PortalProcessor;
import java.util.List;

/**
 *
 * @author hp
 */
public class OnlinePortal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PortData portData = new PortData();
        
        PortalProcessor portalProcessor = new PortalProcessor();

        List<PortData> portalList = portalProcessor.addtiemsToList(portData);
        portalProcessor.displayItems(portalList);
    }

}
