package org.tnsif.service;

import java.util.ArrayList;
import java.util.List;

import org.tnsif.entities.Admin;

class AdminService {
    private List<Admin> admins;

    public AdminService() {
        this.admins = new ArrayList<>();
    }

    public void addAdmin(Admin admin) {
        admins.add(admin);
    }

    public List<Admin> getAdmins() {
        return admins;
    }
}
