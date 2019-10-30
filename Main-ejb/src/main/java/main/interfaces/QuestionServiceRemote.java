package main.interfaces;

import java.util.List;

import javax.ejb.Remote;

import main.entity.Answer;
import main.entity.Domain;
import main.entity.Question;



@Remote
public interface QuestionServiceRemote {

	public int ajout_question(Question q);

	public	void affecterquestiontopic(int topicid, int questionid);

	boolean updateQuestion(Question question);

	boolean deleteQuestion(int id);

	Question getQuestionById(int id);

	Question getQuestionById(int id, String complexity, String enonce);

	public List<Question> getlist();

	int ajouterDomain(Domain domain);

	int ajout_reponse(Answer a);
}
