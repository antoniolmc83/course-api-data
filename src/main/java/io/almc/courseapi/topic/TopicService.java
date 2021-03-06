package io.almc.courseapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

//	private List<Topic> topics = new ArrayList<>( Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework description"),
//			new Topic("java", "Core Java", "Core Java Description"),
//			new Topic("javascript", "Javascript", "Javascript Description")));
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id){		
//		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
//		topics.add(topic);
		
	}

	public void updateTopic(Topic topic) {
//		for(int i=0; i<topics.size(); i++){
//			if(topics.get(i).getId().equals(topic.getId())){
//				topics.set(i, topic);
//			}
//		}
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
//		topics.removeIf(t->t.getId().equals(id));
		topicRepository.delete(id);
	}
	
}
