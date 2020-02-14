package com.zh.dao;

import com.zh.vo.TaskVO;

public interface ITaskDao {

	void addTask(TaskVO taskVO);
	void finishTask(String id);
}
