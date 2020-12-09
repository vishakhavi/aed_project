/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    public List<WorkRequest> getWorkRequestListCustomer(UserAccount account){
        List<WorkRequest> workRequestListCustomer = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getCustomer() != null){
                UserAccount customerAccount = workRequest.getCustomer();
                if(customerAccount.getUsername().equals(account.getUsername())){
                    workRequestListCustomer.add(workRequest);
                }
            }
        }
        return workRequestListCustomer;
    }
    
    public void addWorkRequest(WorkRequest workRequest){         
        if (!workRequestList.contains(workRequest)) //Add only if the WR doesnt exist
            workRequestList.add(workRequest);
    }  
}