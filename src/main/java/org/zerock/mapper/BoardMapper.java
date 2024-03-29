package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Standard;



public interface BoardMapper {

	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Standard std);

	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	  public BoardVO read(Long bno);
	  
	  public int delete(Long bno);
	  
	  public int update(BoardVO board);

	  
	
	}
	 