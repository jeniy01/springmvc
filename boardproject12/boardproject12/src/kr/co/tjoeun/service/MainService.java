package kr.co.tjoeun.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.tjoeun.bean.ContentBean;
import kr.co.tjoeun.dao.BoardDAO;

@Service
public class MainService {
  // 각 게시판글 5 개씩 가져오기
  @Autowired
  private BoardDAO boardDAO;
  
  // 게시글 리스트 가져오기
  public List<ContentBean> getMainList(int board_info_idx){
	                                  // 처음부터 5 개
	RowBounds rowBounds = new RowBounds(0, 5);
	return boardDAO.getContentList(board_info_idx, rowBounds);
  }
  
}
