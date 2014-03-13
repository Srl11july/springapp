package com.myrest.springapp.daoImpl;

import com.myrest.springapp.model.Job;

public class JobDaoImpl {
	public Job getJobById(String jobid){
		Job job = new Job();
		job.setJobid("1");
		job.setJobstatus("success");
		return job;
	}
}
