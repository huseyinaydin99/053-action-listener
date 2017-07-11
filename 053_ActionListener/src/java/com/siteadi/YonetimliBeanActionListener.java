/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

/**
 *
 * @author husey
 */
public class YonetimliBeanActionListener implements ActionListener{

    @Override
    public void processAction(ActionEvent ae) throws AbortProcessingException {
        System.err.println("Gönder2 düğmesine tıklandı");
    }
    
}
