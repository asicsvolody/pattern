package ru.yakimov.DataMapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.yakimov.DataMapper.entities.Student;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public interface StudentRepo extends JpaRepository<Student, Long> {
}
