package common;

import java.util.GregorianCalendar;
import java.util.List;

public class Event {
    private  String name;
    private  String description;
    private  List<Person> attenders;
    private  GregorianCalendar startTime;
    private  GregorianCalendar endTime;


    public Event(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.startTime = builder.startTime;
        this.attenders = builder.attenders;
        this.endTime = builder.endTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAttenders(List<Person> attenders) {
        this.attenders = attenders;
    }

    public void setStartTime(GregorianCalendar startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(GregorianCalendar endTime) {
        this.endTime = endTime;
    }
    public static class Builder {
        private String name;
        private String description;
        private GregorianCalendar startTime;
        private GregorianCalendar endTime;
        private List<Person> attenders;
        public Builder() {
        }

        public Builder(Event origin) {
            this.name = origin.name;
            this.description = origin.description;
            this.startTime = origin.startTime;
            this.attenders = origin.attenders;
            this.endTime = origin.endTime;
        }

            public Builder name(String name){
              this.name = name;
                return this;
            }

        public Builder description(String description){
            this.description = description;
            return this;
        }
        public Builder startTime(GregorianCalendar startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder attenders(List<Person> attenders) {
            this.attenders = attenders;
            return this;
        }
        public Builder endTime(GregorianCalendar endTime) {
            this.endTime = endTime;
            return this;
        }

        public Event build() {
            return new Event(this);
        }
    }

}





