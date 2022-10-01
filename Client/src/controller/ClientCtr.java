/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;
import model.Student;

public class ClientCtr {

    private int port;
    private String host;
    private Socket mySocket;

    public ClientCtr() {
        host = "localhost";
        port = 8888;
    }

    public void OpenSocket() {
        try {
            mySocket = new Socket(host, port);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void sendStudent(Student s) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(mySocket.getOutputStream());
            oos.writeObject(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getResult(){
        String res = "";
        try {
            ObjectInputStream ois = new ObjectInputStream(mySocket.getInputStream());
            res = (String)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    
    public void closeConnection(){
        try {
            mySocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
