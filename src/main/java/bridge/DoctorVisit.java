package bridge;

import bridge.device.Hummer;
import bridge.device.Tonometer;
import bridge.doctor.Doctor;
import bridge.doctor.Neurologist;
import bridge.doctor.Terapist;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class DoctorVisit {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Terapist<>(new Tonometer()),
                new Neurologist<>(new Hummer())
        );

        doctors.forEach(
               v -> System.out.println(v.useDevice())
        );

    }
}
