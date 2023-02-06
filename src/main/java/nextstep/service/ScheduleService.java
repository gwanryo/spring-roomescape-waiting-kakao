package nextstep.service;

import nextstep.domain.Schedule;
import nextstep.domain.Theme;
import nextstep.repository.ScheduleDao;
import nextstep.repository.ThemeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {
    private final ScheduleDao scheduleDao;
    private final ThemeDao themeDao;

    public ScheduleService(ScheduleDao scheduleDao, ThemeDao themeDao) {
        this.scheduleDao = scheduleDao;
        this.themeDao = themeDao;
    }

    public long create(Schedule schedule) {
        Theme theme = themeDao.findById(schedule.getTheme().getId());
        return scheduleDao.save(Schedule.builder().theme(theme).date(schedule.getDate()).time(schedule.getTime()).build());
    }

    public List<Schedule> findByThemeIdAndDate(long themeId, String date) {
        return scheduleDao.findByThemeIdAndDate(themeId, date);
    }

    public void deleteById(long id) {
        scheduleDao.deleteById(id);
    }
}
