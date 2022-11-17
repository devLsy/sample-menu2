package study.samplemenu2.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
@Transactional
class MenuServiceTest {

    @Autowired MenuService menuService;

    @Test
    @DisplayName("findList")
    public void findList() {
        //given
        List<Map<String, Object>> list = menuService.findList();
        // when
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println("depCd = " + stringObjectMap.get("depCd"));
            System.out.println("===================================================");
            System.out.println("parentCd = " + stringObjectMap.get("parentCd"));
            System.out.println("===================================================");
            System.out.println("deptName = " + stringObjectMap.get("deptName"));
        }

        //then
    }

}