package ev3dev.java.examples;

import lejos.utility.Delay;
import ev3dev.hardware.Battery;
import ev3dev.hardware.Sound;
import ev3dev.hardware.port.MotorPort;
import ev3dev.hardware.motor.EV3MediumRegulatedMotor;

//java -cp ev3-lang-java-0.2-SNAPSHOT.jar ev3dev.java.examples.RegulatedMotorRotateDemo2
public class RegulatedMotorRotateDemo2 {
	
    public static void main(String[] args) {
    	
    	final int degreesToTurn = 90;
    	
        final EV3MediumRegulatedMotor mA = new EV3MediumRegulatedMotor(MotorPort.C);
        mA.setSpeed(100);

        Sound.beep();
        System.out.println(mA.getTachoCount());
        mA.rotate(degreesToTurn);
        Sound.beep();
        Delay.msDelay(1000);
        System.out.println(mA.getTachoCount());
        mA.rotate(degreesToTurn);
        Sound.beep();  
        Delay.msDelay(1000);
        System.out.println(mA.getTachoCount());
        mA.rotate(degreesToTurn);
        Sound.beep();
        Delay.msDelay(1000);
        System.out.println(mA.getTachoCount());
        mA.rotate(degreesToTurn);
        Sound.beep();
        Delay.msDelay(1000);
        System.out.println(mA.getTachoCount());
        System.out.println(Battery.getVoltage());
    }
}
