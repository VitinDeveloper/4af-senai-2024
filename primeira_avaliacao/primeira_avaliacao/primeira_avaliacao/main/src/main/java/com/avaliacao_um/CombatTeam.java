package com.avaliacao_um;

import java.util.Arrays; 


public class CombatTeam {
    private Integer numberMembers; 
    private Leader leader;
    private User[] members;
    private ParkAddress location;

    public CombatTeam(Integer numberMembers, Leader leader, User[] members, ParkAddress location) {
        this.numberMembers = numberMembers;
        this.leader = leader;
        this.members = members;
        this.location = location;
    }

    public CombatTeam(Integer numberMembers, Leader leader, ParkAddress location) {
        this(numberMembers, leader, new User[0], location);
    }

    public Integer getNumberMembers() {
        return numberMembers;
    }

    public void setNumberMembers(Integer numberMembers) {
        this.numberMembers = numberMembers;
    }

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public User[] getMembers() {
        return members;
    }

    public void setMembers(User[] members) {
        this.members = members;
    }

    public ParkAddress getLocation() {
        return location;
    }

    public void setLocation(ParkAddress location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "CombatTeam [numberMembers=" + numberMembers + ", leader=" + leader
                + ", members=" + Arrays.toString(members)
                + ", location=" + location + "]";
    }
}