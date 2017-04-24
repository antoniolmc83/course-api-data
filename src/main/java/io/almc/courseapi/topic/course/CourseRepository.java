package io.almc.courseapi.topic.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	List<Course> findByName(String name);
	List<Course> findByDescription(String description);
	List<Course> findByTopicId(String topicId);

}
