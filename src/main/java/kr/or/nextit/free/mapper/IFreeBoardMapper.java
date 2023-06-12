package kr.or.nextit.free.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.nextit.free.vo.FreeBoardSearchVO;
import kr.or.nextit.free.vo.FreeBoardVO;

@Mapper
public interface IFreeBoardMapper {

	public String getFreeBoardKey();

	public int insertBoard(FreeBoardVO freeBoard);

	public int getTotalRowCount(FreeBoardSearchVO searchVO);

	public List<FreeBoardVO> getBoardList(FreeBoardSearchVO searchVO);

	public FreeBoardVO getBoard(String boNo);

	public int increaseHit(String boNo);

	public int updateBoard(FreeBoardVO freeBoard);

	public int deleteBoard(FreeBoardVO freeBoard);

	public int checkAdmin(FreeBoardVO freeBoard);

}
