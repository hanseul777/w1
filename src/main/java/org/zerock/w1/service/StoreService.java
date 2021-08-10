package org.zerock.w1.service;

import org.zerock.w1.dto.StoreDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum StoreService {

    INSTANCE;//enum은 대문자로 정의

    private List<StoreDTO> dtoList;

    StoreService() {
        dtoList = new ArrayList<>();

        this.add(StoreDTO.builder().name("수정식당").area("종각").desc("불백").build());
        this.add(StoreDTO.builder().name("창매족").area("석계").desc("족발").build());
        this.add(StoreDTO.builder().name("아리닭발").area("김포").desc("닭발").build());
        this.add(StoreDTO.builder().name("은행나무집").area("종각").desc("한우국밥").build());


    }

    public void add(StoreDTO storeDTO) {
        this.dtoList.add(storeDTO);//this.이 생략
    }

    public List<StoreDTO> getDtoList(String area) {

        if (area == null || area.trim().length() == 0) {
            return this.dtoList;
        }
        return this.dtoList.stream().filter(storeDTO -> storeDTO.getArea().equals(area))
                .collect(Collectors.toList());

    }


}