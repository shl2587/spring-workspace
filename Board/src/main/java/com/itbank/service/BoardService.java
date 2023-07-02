package com.itbank.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDTO;
import com.itbank.repository.BoardDAO;

@Service
public class BoardService {

	@Autowired private BoardDAO dao;
	
	public ArrayList<BoardDTO> selectAll() {
		return dao.selectAll();
	}

	public int insert(BoardDTO dto) {
		return dao.insert(dto);
	}

	public BoardDTO selectOne(int idx) {
		return dao.selectOne(idx);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}

	public int update(BoardDTO dto) {
		return dao.update(dto);
	}

}
