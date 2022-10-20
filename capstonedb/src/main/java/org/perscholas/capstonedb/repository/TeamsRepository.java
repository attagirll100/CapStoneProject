package org.perscholas.capstonedb.repository;

import org.perscholas.capstonedb.model.Basketballplayers;
import org.perscholas.capstonedb.model.Teams;
import org.springframework.data.repository.CrudRepository;

public interface TeamsRepository extends CrudRepository<Teams,Long> {
}
