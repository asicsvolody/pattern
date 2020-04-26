package bridge.device;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class Tonometer implements ITerapistDevice {

    @Override
    public String useDevice() {
        return "Pressure is ok";
    }
}
