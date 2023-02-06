package nextstep.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import nextstep.controller.dto.request.ScheduleRequest;
import nextstep.controller.dto.response.ScheduleResponse;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class Schedule {
    private Long id;
    private Theme theme;
    private LocalDate date;
    private LocalTime time;

    public Schedule(ScheduleRequest schedule) {
        this.theme = new Theme(schedule.getThemeId());
        this.date = LocalDate.parse(schedule.getDate());
        this.time = LocalTime.parse(schedule.getTime());
    }

    public Long getId() {
        return id;
    }

    public Theme getTheme() {
        return theme;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public ScheduleResponse toResponse() {
        return ScheduleResponse.builder().theme(theme.toResponse()).date(date).time(time).build();
    }
}
