package org.myonlineapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SubjectCategory")
public class SubjectCategory extends BaseEntity{
	
	@OneToMany(mappedBy="subjectCategory")
	private List<SubjectCategory> listSubjectCategory;
	
	@ManyToOne
	private SubjectCategory subjectCategory;
	
	@OneToMany(mappedBy="mySubjectCategory")
	private List<Subject> listSubjects;
	
	@OneToMany(mappedBy="subjectcategory", targetEntity=Question.class)
	private List<Question> listQuestions;
	
	public List<SubjectCategory> getListSubjectCategory() {
		return listSubjectCategory;
	}
	public void setListSubjectCategory(List<SubjectCategory> listSubjectCategory) {
		this.listSubjectCategory = listSubjectCategory;
	}
	public SubjectCategory getSubjectCategory() {
		return subjectCategory;
	}
	public void setSubjectCategory(SubjectCategory subjectCategory) {
		this.subjectCategory = subjectCategory;
	}
}
