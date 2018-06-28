package com.blastfurnace.otr.data.series.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blastfurnace.otr.data.series.model.Series;


	// This will be AUTO IMPLEMENTED by Spring into a Bean called seriesRepository
	// CRUD refers Create, Read, Update, Delete

/** https://dzone.com/articles/accessing-the-entitymanager-from-spring-data-jpa

public class ParkrunCourseRepositoryImpl implements ParkrunCourseRepositoryCustom {

    @PersistenceContext

    private EntityManager em;

    @Override

    @Transactional

    public void refresh(ParkrunCourse parkrunCourse) {

        em.refresh(parkrunCourse);

    }

}


We must end our implementation name with “Impl”.

We then change the ParkrunCourseRepository interface to:

public interface ParkrunCourseRepository extends CrudRepository, ParkrunCourseRepositoryCustom {

}

**/

public interface SeriesRepository extends JpaRepository<Series, Long>, SeriesRepositoryCustom {

}


