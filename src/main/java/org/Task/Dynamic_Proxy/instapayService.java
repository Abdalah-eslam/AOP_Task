package org.Task.Dynamic_Proxy;

public class instapayService implements paymentService {
    @Override
    public void pay(double  amount) {
        System.out.println("INSTAPAY Processing payment of $" + amount);
    }
}
