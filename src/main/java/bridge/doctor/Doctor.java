package bridge.doctor;

import bridge.device.Device;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public abstract class Doctor  {
    private Device device;

    public Doctor(Device device) {
        this.device = device;
    }

    public String useDevice(){
        return device.useDevice();
    }
}
