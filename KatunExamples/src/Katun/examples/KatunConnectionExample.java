/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Katun.examples;

import java.util.logging.Level;
import java.util.logging.Logger;
import katun.client.KatunChannelClient;
import katun.network.KatunChannel;

/**
 *
 * @author Valeria-Katun
 */
public class KatunConnectionExample {

    public static KatunChannelClient getKatunConnection() {
        KatunChannelClient channelClient = null;
        try {
            KatunChannel kc = new KatunChannel();
            channelClient = kc.connectKatunChannel();
        } catch (Exception ex) {
            Logger.getLogger(KatunConnectionExample.class.getName()).log(Level.SEVERE, "ERROR: Katun channel can not connected.", ex);
        }

        return channelClient;
    }

    public static void main(String[] args) throws Exception {
        KatunChannelClient channel = getKatunConnection();
        System.out.println("channel:" + channel);
    }
}
