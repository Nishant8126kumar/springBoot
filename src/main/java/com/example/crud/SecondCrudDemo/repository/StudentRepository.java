package com.example.crud.SecondCrudDemo.repository;

import com.example.crud.SecondCrudDemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(nativeQuery = true, value = "select student_details.student_name,student_details.student_address, cetrtificate.course_name from student_details " +
            " left join cetrtificate on student_details.student_id=cetrtificate.certi_id")
    List<Object> getByJoin();

    @Query(nativeQuery = true, value = "select s1.course_name,s2.certi_id from cetrtificate s1,cetrtificate s2" +
            " where s1.certi_id=s2.student_student_id")
    List<Object> selfJoin();

    @Query(nativeQuery = true, value = "select * from student_details cross join cetrtificate")
    List<Object> getByJoinOuter();
}
