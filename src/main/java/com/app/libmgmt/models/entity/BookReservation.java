package com.app.libmgmt.models.entity;

import com.app.libmgmt.models.enums.ReservationStatus;
import lombok.Data;

import java.util.Date;

@Data
public class BookReservation {
    private String resevationId;
    private String lineItemId; // basically this is barcode
    private Date createdAt;
    private String memberId;
    private ReservationStatus reservationStatus;
}
