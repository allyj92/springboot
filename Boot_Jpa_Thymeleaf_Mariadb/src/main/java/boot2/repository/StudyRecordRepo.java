package boot2.repository;

import boot2.entity.Study_record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface StudyRecordRepo extends JpaRepository<Study_record, Integer> {
}
