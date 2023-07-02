package com.itbank.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.itbank.model.BoardDTO;

@Repository
public interface BoardDAO {

	@Select("select * from board2 order by idx desc")
	ArrayList<BoardDTO> selectAll();
	
	@Select("select * from board2 where idx=#{idx}")
	BoardDTO selectOne(int idx);
	
	@Insert("insert into board2 (title, content) values(#{title}, #{content})")
	int insert(BoardDTO dto);

	@Delete("delete from board2 where idx=#{idx}")
	int delete(int idx);

	@Update("update board2 set title=#{title}, content=#{content} where idx=#{idx}")
	int update(BoardDTO dto);


}
