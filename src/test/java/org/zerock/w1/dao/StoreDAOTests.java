package org.zerock.w1.dao;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.w1.dto.StoreDTO;

public class StoreDAOTests {
    //자바로 먼저 한 번 만들어주고 돌려보기(테스트해보기)
    private TimeDAO timeDAO = new TimeDAO();

    private StoreDAO storeDAO;

    @BeforeEach // test할 때마다 새로 만드는 것. -> 메모리할당을 새로해준다는 느낌
    public void ready(){
        storeDAO = new StoreDAO();
        System.out.println(storeDAO);
    }

    @Test
    public void testInsert() {

        StoreDTO storeDTO = StoreDTO.builder()
                .name("성가네순대국")
                .area("종각")
                .desc("직접 만든 순대, 순대국")
                .build();

        storeDAO.insert(storeDTO);
    }

    @Test
    public void testGetTime(){
        for (int i=10; i<10; i++) {
            System.out.println(timeDAO.getTime());
        }

    }

}
