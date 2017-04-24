package io.almc.courseapi.topic.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

//	private List<Topic> topics = new ArrayList<>( Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework description"),
//			new Topic("java", "Core Java", "Core Java Description"),
//			new Topic("javascript", "Javascript", "Javascript Description")));
	
	public List<Course> getAllCourses(String topicId){
		List<Course> topics = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(topics::add);
		return topics;
	}
	
	public Course getCourse(String id){		
//		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}

	public void addCourse(Course topic) {
		
		courseRepository.save(topic);
//		topics.add(topic);
		
	}

	public void updateCourse(Course topic) {
//		for(int i=0; i<topics.size(); i++){
//			if(topics.get(i).getId().equals(topic.getId())){
//				topics.set(i, topic);
//			}
//		}
		courseRepository.save(topic);
	}

	public void deleteCourse(String id) {
//		topics.removeIf(t->t.getId().equals(id));
		courseRepository.delete(id);
	}
	
}
