package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {
    OnlinePaymentService onlinePayment;

    public ContractService(OnlinePaymentService onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public void processContract(Contract contract, Integer months) {
        double basicQuota = contract.getTotalValue()/months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest =  onlinePayment.interest(basicQuota, i);
            double fee = onlinePayment.paymentFee(interest + basicQuota);
            double quota = basicQuota+fee+interest;
            contract.getInstallments().add(new Installment(dueDate,quota));
        }
    }
}
