/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defense.system;

import java.util.ArrayList;

/**
 *
 * @author suran
 */
public class Subject {
    
   private  ArrayList<Observer> list=new ArrayList<>();
    
    public void addObserver(Observer ob){
        list.add(ob);
    }
    
    public void sendAll(String value){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).sendMessageToAll(value);
        }
    }
    
    public void setAreaClear(boolean b){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).sendAreaClear(b);
        }
    }
    
    public void sendMessageToMainController(String name, String value){
        list.get(0).sendMessageToAll(value);
    }
    
    public void setButton(int value){
         for (int i = 0; i < list.size(); i++) {
            list.get(i).buttonControl(value);
        }
    }
    
    public void setPrivateMessage(String name ,String value){
         for (int i = 0; i < list.size(); i++) {
            list.get(i).getPrivateMessage(name , value);
        }
    }

    
}
