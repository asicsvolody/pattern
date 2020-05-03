package ru.yakimov.DataMapper.servises;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.yakimov.DataMapper.entities.Student;
import ru.yakimov.DataMapper.repository.StudentRepo;

import javax.annotation.PostConstruct;
import javax.persistence.Lob;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Service
@AllArgsConstructor
public class DatabaseInit {

    private StudentRepo studentRepo;

    @PostConstruct
    public void initDB(){
        Student studentOne = new Student();
        studentOne.setName("Vladimir");
        studentOne.setPhone("321412341234");
        studentOne = studentRepo.save(studentOne);

        Long id = studentOne.getId();

        System.out.println("Is is: " + id);
        System.out.println("version is: " + studentOne.getVersion());

        Student studentTwo = studentRepo.findById(id).orElse(null);

        if(studentTwo != null)
            System.out.println("This is same student: " + studentOne.equals(studentTwo));



    }
}
