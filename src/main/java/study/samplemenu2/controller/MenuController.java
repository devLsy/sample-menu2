package study.samplemenu2.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import study.samplemenu2.service.MenuService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/menu/list")
    public String menuList(Model model) throws Exception {
        List<Map<String, Object>> list = menuService.findList();
        model.addAttribute("list", list);
        return "menu/menuList";
    }
}
