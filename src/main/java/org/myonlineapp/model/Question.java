package org.myonlineapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class Question extends BaseEntity{
	
	private String questiontype;
	private String questioncategory;
	private String questiontext;
	
	@ManyToMany(mappedBy="listQuestion", targetEntity=Choice.class)
	/*@JoinTable(name="question_choice",joinColumns={
			@JoinColumn(name="id")
	},inverseJoinColumns={
			@JoinColumn(name="")
	})*/
	private List<Choice> listChoice;
	
	@ManyToOne
	private SubjectCategory subjectcategory;
	
	
	public String getQuestiontype() {
		return questiontype;
	}
	public void setQuestiontype(String questiontype) {
		this.questiontype = questiontype;
	}
	public String getQuestioncategory() {
		return questioncategory;
	}
	public void setQuestioncategory(String questioncategory) {
		this.questioncategory = questioncategory;
	}
	public String getQuestiontext() {
		return questiontext;
	}
	public void setQuestiontext(String questiontext) {
		this.questiontext = questiontext;
	}
	public List<Choice> getListChoice() {
		return listChoice;
	}
	public void setListChoice(List<Choice> listChoice) {
		this.listChoice = listChoice;
	}
	public SubjectCategory getSubjectcategory() {
		return subjectcategory;
	}
	public void setSubjectcategory(SubjectCategory subjectcategory) {
		this.subjectcategory = subjectcategory;
	}
}
