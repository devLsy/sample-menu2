package study.samplemenu2.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.samplemenu2.service.MenuService;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MenuApiController {

    private final MenuService menuService;

    @GetMapping("/api/menu/list")
    public List<Map<String, Object>> menuList() {
        List<Map<String, Object>> list = menuService.findList();
        return list;
    }
}
