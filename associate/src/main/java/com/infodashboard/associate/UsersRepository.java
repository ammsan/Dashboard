package com.infodashboard.associate;

import com.infodashboard.associate.AssociateRecords;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<AssociateRecords, Long> {

}
