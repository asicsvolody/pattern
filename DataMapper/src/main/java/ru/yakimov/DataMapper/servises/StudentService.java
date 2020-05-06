package ru.yakimov.DataMapper.servises;

import lombok.RequiredArgsConstructor;
import org.hibernate.metamodel.model.domain.internal.AbstractIdentifiableType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import ru.yakimov.DataMapper.entities.Student;
import ru.yakimov.DataMapper.repository.StudentRepo;

import java.util.List;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;


    public List<Student> findAll(){
        return studentRepo.findAll();
    }

    public Student save(Student student){
        return studentRepo.save(student);
    }

    public Student findById(Long id){
        return studentRepo.findById(id).orElse(new Student());
    }
}
