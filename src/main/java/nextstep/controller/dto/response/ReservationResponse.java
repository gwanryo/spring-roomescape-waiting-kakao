package nextstep.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import nextstep.domain.Reservation;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class ReservationResponse {
    private long id;
    private ScheduleResponse schedule;

    public ReservationResponse(Reservation reservation) {
        this.id = reservation.getId();
        this.schedule = reservation.getSchedule().toResponse();
    }
}
