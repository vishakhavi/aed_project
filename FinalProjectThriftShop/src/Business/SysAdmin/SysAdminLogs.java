/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SysAdmin;

import java.util.Date;

/**
 *
 * @author madhurimachatterjee
 */
public class SysAdminLogs {
    private Date logDateTime;
    private String activity;

    public SysAdminLogs()
    {
        this.logDateTime = new Date();
    }
    
    public Date getLogDateTime() {
        return logDateTime;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
    
    
}
