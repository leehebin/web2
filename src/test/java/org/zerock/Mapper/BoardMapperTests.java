package org.zerock.Mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Standard;
import org.zerock.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	  @Setter(onMethod_ = @Autowired) private BoardMapper mapper;
	 
	
	
	  @Test public void testGetList() { mapper.getList().forEach(Board ->
	  log.info(Board));
	  
	  }
	  
	  @Test public void testInsert() {
	  
	  BoardVO board = new BoardVO(); board.setTitle("새로 작성하는 글");
	  board.setContent("새로 작성하는 내용"); board.setWriter("newbie");
	  
	  mapper.insert(board);
	  
	  log.info(board); }
	  
	/*
	 * @Test public void testRead() {
	 * 
	 * 
	 * 
	 * log.info(board);
	 * 
	 * }
	 */
	  
	  @Test public void testDelete() { log.info("DELETE COUNT: " +
	  mapper.delete(3L));
	  
	  }
	  
	  @Test public void testUpdate() {
	  
	  BoardVO board = new BoardVO(); board.setBno(5L); board.setTitle("수정된 제목");
	  board.setContent("수정된 내용"); board.setWriter("user00");
	  
	  int count = mapper.update(board); log.info("UPDATE COUNT" + count);
	  
	  }
	  
	  
	  @Test public void testPaging() {
	  
	  Standard std = new Standard();
	  
	  
	  
	  
	  List<BoardVO> list = mapper.getListWithPaging(std);
	  
	  list.forEach(board -> log.info(board));
	  
	  }
	 
		
		
		@Test
		public void testPagin() {
			
			Standard std = new Standard();
			
			std.setPageNum(4);
			std.setAmount(10);
			
			
			List<BoardVO> list = mapper.getListWithPaging(std);
			
			list.forEach(BoardVO -> log.info(list));
		}
	  
	
	
}