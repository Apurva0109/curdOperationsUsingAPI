package com.apurva.springboot.repository;
import com.apurva.springboot.bean.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends CrudRepository<Subject,String>{
}
