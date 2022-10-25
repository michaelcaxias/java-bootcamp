package com.michael.storage03.repository;

import com.michael.storage03.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITutorialRepo extends JpaRepository<Tutorial, Long> {


}
