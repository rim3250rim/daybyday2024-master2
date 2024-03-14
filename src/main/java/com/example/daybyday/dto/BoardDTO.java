package com.example.daybyday.dto;


import com.example.daybyday.entity.BoardEntity;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString // 필드값확인 필수적이지는 않음
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든필드를 매개변수로 하는 생성자
public class BoardDTO {

    /*필드선언*/
    private Long id;
    private String boardwriter;
    private String boardpass;
    private String boardtitle;
    private String boardcontents;
    private MultipartFile boardfile;
    private int boardHits;  //클릭수
    private LocalDateTime boardCreatedTime;  // 생성시간
    private LocalDateTime boardUpdatedTime; //업데이트 시간

    public static BoardDTO toBoardDTO(BoardEntity boardEntity) {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(boardEntity.getId());
        boardDTO.setBoardwriter(boardEntity.getBoardwriter());
        boardDTO.setBoardpass(boardEntity.getBoardpass());
        boardDTO.setBoardtitle(boardEntity.getBoardtitle());
        boardDTO.setBoardcontents(boardEntity.getBoardcontents());
        boardDTO.setBoardHits(boardEntity.getBoardHits());
        boardDTO.setBoardCreatedTime(boardEntity.getCreatedTime());
        boardDTO.setBoardUpdatedTime(boardEntity.getUpdatedTime());
        return boardDTO;
    }
}
