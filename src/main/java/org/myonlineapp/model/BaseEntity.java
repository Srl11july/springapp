package org.myonlineapp.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class BaseEntity implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

}
