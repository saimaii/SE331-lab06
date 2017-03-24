package camt.cbsd.services;

import camt.cbsd.entity.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Profile("secondDataSource")
@Service
public class StudentSecondServiceImpl implements StudentService {
    String imageBaseURL = "http://localhost:3000/images/";
    @Override
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();

        Student student = new Student(1,"SE-001","Mitsuha","Miyamizu",2.15,"mitsuha.gif",true,0,
                "The most belove one");
        students.add(student);
         student = new Student(2,"SE-002","Prayuth","The minister",3.59,"tu.jpg",false,15,
                "The great man forever");
        students.add(student);
        student = new Student(3,"SE-003","Jurgen","Kloop",2.15,"Kloop.gif",true,2,
                "The great man forever");
        students.add(student);

        return students;
    }
}
