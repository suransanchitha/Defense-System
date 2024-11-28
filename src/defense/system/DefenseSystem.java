/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defense.system;

/**
 *
 * @author suran
 */
public class DefenseSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainController maincontroller = new MainController();

        Helicopter helicopter = new Helicopter();
        Tank tank = new Tank();
        Submarine submarine = new Submarine();

        Subject subject = new Subject();
        subject.addObserver(helicopter);
        subject.addObserver(tank);
        subject.addObserver(submarine);

        maincontroller.setSubject(subject);
        helicopter.setMainController(maincontroller);
        tank.setMainController(maincontroller);
        submarine.setMainController(maincontroller);

    }

}
