package ru.kpfu.itis.gafurova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.gafurova.model.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    Schedule findOneByTeacherId(Long teacherId);

    void deleteByTeacherId(Long teacherId);
}
