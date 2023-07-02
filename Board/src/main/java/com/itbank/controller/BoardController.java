package com.itbank.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.BoardDTO;
import com.itbank.service.BoardService;

@Controller
@RequestMapping("/")
public class BoardController {

	@Autowired private BoardService boardService;
	
	@GetMapping("list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		ArrayList<BoardDTO> list = boardService.selectAll();
		
		mav.addObject("list", list);
		
		return mav;
	}
	
	@GetMapping("add")
	public void add() {}
	
	@PostMapping("add")
	public ModelAndView add(BoardDTO dto) {
		ModelAndView mav = new ModelAndView("add-result");
		int row = boardService.insert(dto);
		
		mav.addObject("row", row);
		return mav;
	}
	
	@GetMapping("view/{idx}")
	public ModelAndView selectOne(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("view");
		BoardDTO dto = boardService.selectOne(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	@GetMapping("delete/{idx}")
	public ModelAndView delete(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("delete");
		int row = boardService.delete(idx);
		mav.addObject("row", row);
		return mav;
	}
	
	@GetMapping("modify/{idx}")
	public ModelAndView modify(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("modify");
		BoardDTO dto = boardService.selectOne(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	@PostMapping("modify/{idx}")
	public ModelAndView modify(BoardDTO dto) {
		ModelAndView mav = new ModelAndView("modify-result");
		int row = boardService.update(dto);
		
		mav.addObject("row", row);
		return mav;
	}
	
	
	
		
}
