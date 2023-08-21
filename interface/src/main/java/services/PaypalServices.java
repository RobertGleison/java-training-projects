package services;

public class PaypalServices implements OnlinePaymentService {
    public PaypalServices() {
    }

    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }

    public Double interest(Double amount, Integer months) {
        return amount * 0.01 * (double)months;
    }
}

