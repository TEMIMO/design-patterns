package com.temimo.behavioral.chain;

public abstract class Role {
    private int priority;
    private Role nextRole;

    public Role(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Role nextRole) {
        this.nextRole = nextRole;
    }

    public void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextRole != null) {
            nextRole.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}
