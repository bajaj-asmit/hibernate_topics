package com.map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Question {

	@Id
	@Column(name="question_id")
	private int Questionid;
	
	private String Question;

	@OneToMany(mappedBy ="question" ,fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Answer> answers;
	
//	@OneToOne
//	private Answer answer;
	
	public Question() {
		// TODO Auto-generated constructor stub
	}

	public Question(int questionid, String question, List<Answer> answers) {
	super();
	Questionid = questionid;
	Question = question;
	this.answers = answers;
}

	public int getQuestionid() {
		return Questionid;
	}

	public void setQuestionid(int questionid) {
		Questionid = questionid;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}



	@Override
	public String toString() {
		return "Question [Questionid=" + Questionid + ", Question=" + Question + ", answer=" + answers + "]";
	}
	

}
