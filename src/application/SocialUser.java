
package application;

import entities.socialmedia.MSNMessenger;
import entities.socialmedia.Telegram;
import entities.socialmedia.WhatsApp;

import java.util.Scanner;

public class SocialUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Telegram tlg = new Telegram();
        WhatsApp wpp = new WhatsApp();
        MSNMessenger msn = new MSNMessenger();

        msn.enviarMensagem();

    }
}
