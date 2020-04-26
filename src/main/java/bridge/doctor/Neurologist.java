package bridge.doctor;

import bridge.device.Device;
import bridge.device.INeurologistDevice;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class Neurologist <T extends INeurologistDevice> extends Doctor {

    public Neurologist(T device) {
        super(device);
    }
}
