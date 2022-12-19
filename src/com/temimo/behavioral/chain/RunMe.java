package com.temimo.behavioral.chain;

public class RunMe {
    public static void main(String[] args) {
        Role userRole = new UserRole(Priority.USER);
        Role adminRole = new AdminRole(Priority.ADMIN);
        Role superAdminRole = new SuperAdminRole(Priority.SUPERADMIN);

        userRole.setNextNotifier(adminRole);
        adminRole.setNextNotifier(superAdminRole);

        userRole.notifyManager("Delete message", Priority.SUPERADMIN);
        userRole.notifyManager("Edit message", Priority.ADMIN);
        userRole.notifyManager("Send message", Priority.USER);
    }
}
