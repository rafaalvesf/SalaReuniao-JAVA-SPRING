package br.com.rafael.SalaReuniao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "meetingroom")
public class Room {
    private long id;
    private String name;
    private String date;
    private String startHour;
    private String endHour;

}
