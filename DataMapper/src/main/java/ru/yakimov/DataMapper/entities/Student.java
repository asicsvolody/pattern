package ru.yakimov.DataMapper.entities;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Version
    private int version;

    private String name;

    private String phone;
}
