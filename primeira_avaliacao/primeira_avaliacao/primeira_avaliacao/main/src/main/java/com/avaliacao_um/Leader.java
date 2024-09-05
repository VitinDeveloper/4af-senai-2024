package com.avaliacao_um;

public class Leader {
    private Boolean isAdmin;
    private String team;

    public Leader(Boolean isAdmin, String team) {
        this.isAdmin = isAdmin;
        this.team = team;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Leader [isAdmin=" + isAdmin + ", team=" + team + "]";
    }
}