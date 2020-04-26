package bridge.doctor;

import bridge.device.Device;
import bridge.device.ITerapistDevice;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class Terapist <T extends ITerapistDevice> extends Doctor {

    public Terapist(T device) {
        super(device);
    }
}
