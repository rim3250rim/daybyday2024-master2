package com.example.daybyday.entity;


import com.example.daybyday.dto.BoardDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "boards_table")
public class BoardEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String boardwriter;

    @Column
    private String boardpass;

    @Column
    private String boardtitle;

    @Column(length = 100)
    private String boardcontents;

    @Column
    private int boardHits;

    public static BoardEntity toSaveEntity(BoardDTO boardDTO) {
     BoardEntity boardEntity = new BoardEntity();
     boardEntity.setId(boardDTO.getId());
     boardEntity.setBoardwriter(boardDTO.getBoardwriter());
     boardEntity.setBoardpass(boardDTO.getBoardpass());
     boardEntity.setBoardtitle(boardDTO.getBoardtitle());
     boardEntity.setBoardcontents(boardDTO.getBoardcontents());
     boardEntity.setBoardHits(0);
     return boardEntity;
    }
}
