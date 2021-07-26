package com.dio.accesspoint.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.accesspoint.model.WorkingDay;

@Repository
public interface WorkingDayRepository extends JpaRepository<WorkingDay, Long> {

}
