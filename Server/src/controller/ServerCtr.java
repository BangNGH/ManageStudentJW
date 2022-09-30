/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import model.Student;
import view.ServerView;

/**
 *
 * @author ADMIN
 */
public class ServerCtr {

    private int port;
    private String host;
    private ServerDAO dao;
    private ServerSocket myServer;
    private ArrayList<Socket> list;

    public ServerCtr() {
        port = 8888;
        host = "localhost";
        dao = new ServerDAO();
        list = new ArrayList<>();
        OpenSocket();
        while (true) {
            try {
                Socket s = myServer.accept();
                list.add(s);
                executeThemSV(s);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public void sendResult(String res) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(list.get(list.size()-1).getOutputStream());
            oos.writeObject(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void executeThemSV(Socket s) {
        try {
            Student sv = receiveStudent(s);
            if (dao.ThemSinhVien(sv)) {
                sendResult("OK");
                new ServerView().showMessage("Thành công");
            } else {
                sendResult("failed");
                new ServerView().showMessage("Lỗi!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void OpenSocket() {
        try {
            myServer = new ServerSocket(port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Student receiveStudent(Socket s) {
        Student sv = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            sv = (Student) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sv;
    }
}
