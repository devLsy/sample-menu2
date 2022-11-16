package study.samplemenu2.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import study.samplemenu2.mapper.MenuMapper;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class MenuService {
    private final MenuMapper menuMapper;

    public List<Map<String, Object>> findList() {
        return menuMapper.findList();
    }

}
