package org.scoula.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.scoula.board.domain.BoardVO;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.NoSuchElementException;
import java.util.List;
import java.util.Optional;

@Log4j2
@Service
@RequiredArgsConstructor
//@Service //@Component + 서비스역할의 클래스라는 것이 스프링에 등록
public class BoardServiceImpl implements BoardService {

    //전처리해서 dao의 메서드를 불러서 db처리해달라고 해야함.
    private final BoardMapper mapper;

    @Override
    public List<BoardDTO> getList() {
        //List<BoardVO> list =  boardMapper.getList();
        //vo, vo, vo, vo, vo, vo
        //dto, dto, dto, dto, dto
        return mapper.getList().stream() // BoardVO의 스트림
                .map(BoardDTO::of)
                // BoardDTO의 스트림
                .toList();
    // List<BoardDTO> 변환
    }

    @Override
    public BoardDTO get(Long no) {
        log.info("get......" + no);

        BoardDTO board = BoardDTO.of(mapper.get(no));
        return Optional
                .ofNullable(board)
                .orElseThrow(NoSuchElementException::new);

    }

    @Override
    public BoardDTO create(BoardDTO board) {
        log.info("create......" + board);
        BoardVO boardVO= board.toVo();
        mapper.create(boardVO);
// 파일 업로드 처리
        List<MultipartFile> files = board.getFiles();
        if(files != null && !files.isEmpty()) {
            upload(boardVO.getNo(), files);
        }
        return get(boardVO.getNo());
    }

    @Override
    public BoardDTO update(BoardDTO board) {
        log.info("update......" + board);

        return get(board.getNo());

    }

    @Override
    public BoardDTO delete(Long no) {
        log.info("delete...." + no);
        BoardDTO board = get(no);
        mapper.delete(no);
        return board;

    }
}
