package org.myonlineapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SubjectCategory")
public class SubjectCategory extends BaseEntity{
	private List<SubjectCategory> listSubjectCategory;
	private SubjectCategory subjectCategory;
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
