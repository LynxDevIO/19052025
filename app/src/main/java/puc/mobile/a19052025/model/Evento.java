package puc.mobile.a19052025.model;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private int id;
    private String desc;
    private String data;

    private static final List<Evento> eventos = new ArrayList<>();

    public Evento() {
        eventos.add(this);
        this.id = eventos.size();
    }

    public Evento(int id, String desc, String data) {
        eventos.add(this);
        this.id = eventos.size();
        this.desc = desc;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static List<Evento> getEventos() {
        return eventos;
    }

    @NonNull
    @Override
    public String toString() {
        return "ID: " + this.id + " | DESC: " + this.desc + " | DATA: " + this.data;
    }
}
