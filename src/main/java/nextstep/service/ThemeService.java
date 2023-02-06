package nextstep.service;

import nextstep.domain.Theme;
import nextstep.repository.ThemeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeService {
    private final ThemeDao themeDao;

    public ThemeService(ThemeDao themeDao) {
        this.themeDao = themeDao;
    }

    public long create(Theme theme) {
        return themeDao.save(theme);
    }

    public List<Theme> findAll() {
        return themeDao.findAll();
    }

    public void delete(long id) {
        Theme theme = themeDao.findById(id);
        if (theme == null) {
            throw new NullPointerException();
        }

        themeDao.delete(id);
    }
}
