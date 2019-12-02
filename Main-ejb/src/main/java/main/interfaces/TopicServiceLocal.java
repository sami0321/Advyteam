package main.interfaces;

import java.util.List;

import javax.ejb.Local;

import main.entity.Domain;
import main.entity.Question;
import main.entity.Topic;



@Local
public interface TopicServiceLocal {

	int ajouterTopic(Topic topic);

	void mettreAjourTopic(Domain domain, int dureeTopic, int nombre_question, int topicId);

	Topic getTopicById(int topicId);

	void deleteTopicById(int topicId);

	void affecterdomainatopic(int topicid, int domainid);
	List<Topic> getlist();
	 List<Question> getquestions(int id);
	 public void deletetopicById(int topicId);
	 Boolean updateTopic(Topic topic);
	  List<Topic> findByNamee(String name);

}
