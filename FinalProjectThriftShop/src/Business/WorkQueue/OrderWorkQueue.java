/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author madhurimachatterjee
 */
public class OrderWorkQueue {
    private ArrayList<OrderWorkRequest> workRequestList;

    public OrderWorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<OrderWorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public void addOrderWorkRequest(OrderWorkRequest owr)
    {
        this.getWorkRequestList().add(owr);
    }
}
