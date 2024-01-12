package com.duodevloopers.teammanagement.Model;

public class Match {
    private String matchCode;
    private String matchStatus;
    private String teamName;
    private String matchDay;
    private String matchTime;
    private String matchPlace;
    private int slotLimit;
    private int slotRent;
    private int estimatedPlayer;
    private String fieldAddress;

    public Match() {
    }

    public Match(String matchCode, String matchStatus, String teamName, String matchDay, String matchTime, String matchPlace, int slotLimit, int slotRent, int estimatedPlayer, String fieldAddress) {
        this.matchCode = matchCode;
        this.matchStatus = matchStatus;
        this.teamName = teamName;
        this.matchDay = matchDay;
        this.matchTime = matchTime;
        this.matchPlace = matchPlace;
        this.slotLimit = slotLimit;
        this.slotRent = slotRent;
        this.estimatedPlayer = estimatedPlayer;
        this.fieldAddress = fieldAddress;
    }

    public String getMatchCode() {
        return matchCode;
    }

    public void setMatchCode(String matchCode) {
        this.matchCode = matchCode;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getMatchDay() {
        return matchDay;
    }

    public void setMatchDay(String matchDay) {
        this.matchDay = matchDay;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    public String getMatchPlace() {
        return matchPlace;
    }

    public void setMatchPlace(String matchPlace) {
        this.matchPlace = matchPlace;
    }

    public int getSlotLimit() {
        return slotLimit;
    }

    public void setSlotLimit(int slotLimit) {
        this.slotLimit = slotLimit;
    }

    public int getSlotRent() {
        return slotRent;
    }

    public void setSlotRent(int slotRent) {
        this.slotRent = slotRent;
    }

    public int getEstimatedPlayer() {
        return estimatedPlayer;
    }

    public void setEstimatedPlayer(int estimatedPlayer) {
        this.estimatedPlayer = estimatedPlayer;
    }

    public String getFieldAddress() {
        return fieldAddress;
    }

    public void setFieldAddress(String fieldAddress) {
        this.fieldAddress = fieldAddress;
    }
}
