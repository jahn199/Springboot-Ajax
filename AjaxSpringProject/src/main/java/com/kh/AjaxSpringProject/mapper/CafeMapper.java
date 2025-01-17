package com.kh.AjaxSpringProject.mapper;

import com.kh.AjaxSpringProject.dto.Cafe;
import com.kh.AjaxSpringProject.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CafeMapper {
    //카페 목록 전체 조회 [전체]나 [목록] [리스트]를 작성하게 되면
    //List<DTO파일명> mapper.xml에서 작성한 id 명칭;
    List<Cafe> getAllCafes();
    Cafe getCafeId(int id);

    //하나의 데이터만 조회할 때
    //DTO 파일명 mapper.xml에서 작성한 id 명칭;
}
