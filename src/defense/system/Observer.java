/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defense.system;

/**
 *
 * @author suran
 */
public interface Observer {
    
    public void sendMessageToAll(String value);
    public void sendMessageToMainController(String name, String value);
    public void sendAreaClear(boolean b);
    public void buttonControl(int value);
    public void getPrivateMessage(String name, String value);
    
}
